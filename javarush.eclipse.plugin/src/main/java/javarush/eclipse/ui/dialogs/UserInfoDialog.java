package javarush.eclipse.ui.dialogs;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.Constants;
import javarush.eclipse.core.enums._ServiceResultErrorCode;
import javarush.eclipse.core.utils.ImageUtils;
import javarush.eclipse.core.utils.SessionSingleton;
import javarush.eclipse.core.utils.Util;
import javarush.eclipse.core.utils.WSClient;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;
import javarush.eclipse.ws.client.ServiceResultErrorCode;
import javarush.eclipse.ws.client.ServiceResultOfUserInfo;
import javarush.eclipse.ws.client.UserInfo;

public class UserInfoDialog extends Dialog {

    private final UserInfo info;

    private Label profileFoto;
    private Label userName;
    private Label level;
    private Label lesson;
    private Label ag;
    private Label au;

    /**
     * Create the dialog.
     *
     * @param info
     * @param parentShell
     */
    public UserInfoDialog(UserInfo info) {
        super(WorkspaceUtil.getShell());
        this.info = info;
    }

    /**
     * Create contents of the dialog.
     *
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        container.setLayout(new GridLayout(1, false));

        Font boldFont = Util.defaultBoldFont();

        Composite composite = new Composite(container, SWT.NONE);
        composite.setLayout(new GridLayout(2, false));
        composite.setLayoutData(
                new GridData(SWT.CENTER, SWT.CENTER, false, true, 3, 1));
        profileFoto = new Label(composite,
                SWT.BORDER | SWT.SHADOW_NONE | SWT.RIGHT);
        userName = new Label(composite, SWT.SHADOW_NONE);
        FontData fontData = Util.addHeightFont(8, boldFont);
        userName.setFont(createFont(fontData));

        separator(container);

        Composite composite_2 = new Composite(container, SWT.NONE);
        composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_2.setLayoutData(
                new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
        level = new Label(composite_2, SWT.NONE);
        fontData = Util.addHeightFont(3, boldFont);
        level.setFont(createFont(fontData));
        lesson = new Label(composite_2, SWT.RIGHT);
        lesson.setFont(createFont(fontData));

        separator(container);

        Composite composite_3 = new Composite(container, SWT.NONE);
        composite_3.setLayout(new GridLayout(7, false));
        composite_3.setLayoutData(
                new GridData(SWT.FILL, SWT.CENTER, true, true, 3, 1));

        Label imageAg = new Label(composite_3, SWT.RIGHT);
        imageAg.setImage(ImageUtils.getImage(Constants.iconDarkMater));
        ag = new Label(composite_3, SWT.NONE);
        ag.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
        ag.setFont(createFont(fontData));

        final Button fill = new Button(composite_3, SWT.NONE);
        fill.setLayoutData(
                new GridData(SWT.CENTER, SWT.BOTTOM, false, false, 1, 1));
        fill.setText(Messages.dialog_UserInfo_fill);
        fill.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                fill.setEnabled(false);

                WSClient wsClient = null;
                try {
                    wsClient = new WSClient();
                    final String sessionId = wsClient.authorize();

                    ServiceResultOfUserInfo res = wsClient.getService()
                            .convertMoneyToGold(sessionId);
                    if (ServiceResultErrorCode.SUCCESS != res.getErrorCode())
                        throw new SystemException(
                                _ServiceResultErrorCode.UNKNOWN_ERROR
                                        .fromValue(res.getErrorCode())
                                        .getDescription());

                    UserInfo info = res.getResult();
                    setUserInfo(info);
                }
                catch (Exception e) {
                    SessionSingleton.INSTANCE.setId(null);
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    JavarushEclipsePlugin.logErrorWithMsg(e);
                }
                finally {
                    if (wsClient != null)
                        wsClient.logout();
                    fill.setEnabled(true);
                }
            }
        });

        Label imageAu = new Label(composite_3, SWT.RIGHT);
        imageAu.setLayoutData(
                new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
        imageAu.setImage(ImageUtils.getImage(Constants.iconSpaceship));
        au = new Label(composite_3, SWT.NONE);
        au.setLayoutData(
                new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        au.setFont(createFont(fontData));

        try {
            setUserInfo(info);
        }
        catch (Exception e) {
            if (!(e instanceof BaseException))
                e = new SystemException(e);
            JavarushEclipsePlugin.logErrorWithMsg(e);
        }

        return container;
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();

        // marginHeight = 0;
        // marginWidth = 0;
        // verticalSpacing = 0;
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(1808));
        applyDialogFont(composite);

        initializeDialogUnits(composite);

        dialogArea = createDialogArea(composite);

        return composite;
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }

    private void setUserInfo(UserInfo info) throws MalformedURLException {
        profileFoto.setImage(
                ImageUtils.resizeImage(new URL(info.getPhotoUrl()), 64, 64));
        userName.setText(info.getDisplayName());
        level.setText(MessageFormat.format(Messages.dialog_UserInfo_level,
                info.getLevel()));
        lesson.setText(MessageFormat.format(Messages.dialog_UserInfo_lesson,
                info.getLesson()));
        ag.setText(MessageFormat.format(Messages.dialog_UserInfo_silverMoney,
                info.getSilverMoney()));
        au.setText(MessageFormat.format(Messages.dialog_UserInfo_goldMoney,
                info.getGoldMoney()));
    }

    private Font createFont(FontData fontData) {
        return new Font(Util.getDisplay(), fontData);
    }

    private void separator(Composite container) {
        Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
        GridData data = new GridData(SWT.FILL, SWT.TOP, true, false);
        data.horizontalSpan = 1;
        separator.setLayoutData(data);
    }

}
