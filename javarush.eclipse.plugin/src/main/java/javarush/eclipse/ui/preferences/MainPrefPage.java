package javarush.eclipse.ui.preferences;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.utils.JdtUtils;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;

public class MainPrefPage extends PreferencePage
        implements IWorkbenchPreferencePage {

    private static String SFIELD = "projectName";

    public static final Pattern pattern = Pattern
            .compile("^(_|\\d|[]a-zA-Z])*$");

    private Text text;

    public MainPrefPage() {
    }

    @Override
    public void init(IWorkbench workbench) {
        setPreferenceStore(
                JavarushEclipsePlugin.getDefault().getPreferenceStore());
        setDescription(Messages.title);
    }

    @Override
    protected void performDefaults() {
        super.performDefaults();
        text.setText(getPreferenceStore().getDefaultString(SFIELD));
    }

    @Override
    public boolean performOk() {
        getPreferenceStore().setValue(SFIELD, text.getText());
        return true;
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite top = new Composite(parent, SWT.LEFT);
        top.setLayout(new GridLayout(4, false));

        Label lbl = new Label(top, SWT.NONE);
        lbl.setLayoutData(
                new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        lbl.setText(Messages.pref_MainPage_projectName);

        text = new Text(top, SWT.BORDER);
        text.setLayoutData(
                new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
        text.setText(getPreferenceStore().getString(SFIELD));
        text.addVerifyListener(new VerifyListener() {
            @Override
            public void verifyText(VerifyEvent e) {
                String currentText = ((Text) e.widget).getText();
                Matcher matcher = pattern
                        .matcher(currentText.substring(0, e.start) + e.text
                                 + currentText.substring(e.end));
                if (!matcher.matches())
                    e.doit = false;
            }
        });

        Button btn = new Button(top, SWT.NONE);
        btn.setLayoutData(
                new GridData(SWT.RIGHT, SWT.CENTER, false, false, 4, 1));
        btn.setText(Messages.action_pref_MainPage_createProject);
        btn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                try {
                    int kind;
                    String msg, t = text.getText();
                    if (t.length() == 0) {
                        kind = MessageDialog.ERROR;
                        msg = Messages.error_pref_MainPage_emptyProjectName;
                    }
                    else if (!WorkspaceUtil.createProject(t)) {
                        kind = MessageDialog.WARNING;
                        msg = Messages.warn_pref_MainPage_projectExist;
                    }
                    else {
                        JdtUtils.createJavaProject(t, "src", "bin",
                                new NullProgressMonitor());

                        kind = MessageDialog.INFORMATION;
                        msg = Messages.info_pref_MainPage_projectCreate;
                    }
                    MessageDialog.open(kind, getShell(), Messages.title, msg,
                            0);
                }
                catch (Exception e) {
                    if (!(e instanceof BaseException))
                        e = new SystemException(e);
                    JavarushEclipsePlugin.logErrorWithMsg(e);
                }
            }
        });
        return top;
    }

}
