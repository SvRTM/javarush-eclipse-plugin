package javarush.eclipse.ui.preferences;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.Messages;
import javarush.eclipse.core.Constants;
import javarush.eclipse.core.utils.JdtUtils;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.exceptions.BaseException;
import javarush.eclipse.exceptions.SystemException;

public class MainPrefPage extends PreferencePage
        implements IWorkbenchPreferencePage {

    public static final Pattern pattern = Pattern
            .compile("^(_|\\d|[]a-zA-Z])*$");

    private Text text;
    private Spinner spMinutes;

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
        text.setText(getDefFieldProject());
        spMinutes.setSelection(getDefFieldMinutes());
    }

    @Override
    public boolean performOk() {
        IPreferenceStore store = getPreferenceStore();
        store.setValue(Constants.FIELD_PROJECT, text.getText());
        store.setValue(Constants.FIELD_MINUTES, spMinutes.getSelection());
        return true;
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite top = new Composite(parent, SWT.NONE);
        top.setLayout(new GridLayout(1, false));

        Group grpProject = new Group(top, SWT.BORDER);
        grpProject.setLayoutData(
                new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        grpProject.setLayout(new GridLayout(2, true));
        grpProject.setText(Messages.pref_MainPage_projectName);

        final Button btn = new Button(grpProject, SWT.NONE);
        btn.setEnabled(false);

        text = new Text(grpProject, SWT.BORDER);
        text.setLayoutData(
                new GridData(SWT.LEFT, SWT.CENTER, true, false, 4, 1));
        text.setText(getFieldProject());
        text.addVerifyListener(new VerifyListener() {
            @Override
            public void verifyText(VerifyEvent e) {
                String currentText = ((Text) e.widget).getText();
                String s = currentText.substring(0, e.start) + e.text
                           + currentText.substring(e.end);
                Matcher matcher = pattern.matcher(s);
                if (!matcher.matches()) {
                    e.doit = false;
                    s = currentText;
                }

                try {
                    btn.setEnabled(
                            !s.isEmpty() && !WorkspaceUtil.isProjectExists(s));
                }
                catch (CoreException exc) {
                    JavarushEclipsePlugin.logErrorWithMsg(exc);
                }
            }
        });

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

        Group grpSession = new Group(top, SWT.NONE);
        grpSession.setLayoutData(
                new GridData(SWT.FILL, SWT.TOP, false, false, 2, 1));
        grpSession.setText(Messages.pref_MainPage_sessionUpdateInterval);
        grpSession.setLayout(new GridLayout(3, true));

        nop(grpSession);

        spMinutes = new Spinner(grpSession, SWT.BORDER);
        spMinutes.setLayoutData(
                new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        spMinutes.setMaximum(1480);
        spMinutes.setMinimum(5);
        spMinutes.setSelection(getFieldMinutes());

        Label lblNewLabel = new Label(grpSession, SWT.HORIZONTAL);
        lblNewLabel.setText(Messages.pref_MainPage_session_minutes);

        return top;
    }

    private int getFieldMinutes() {
        return getPreferenceStore().getInt(Constants.FIELD_MINUTES);
    }

    private int getDefFieldMinutes() {
        return getPreferenceStore().getDefaultInt(Constants.FIELD_MINUTES);
    }

    private String getFieldProject() {
        return getPreferenceStore().getString(Constants.FIELD_PROJECT);
    }

    private String getDefFieldProject() {
        return getPreferenceStore().getDefaultString(Constants.FIELD_PROJECT);
    }

    private void nop(Composite parent) {
        new Label(parent, SWT.NONE);
    }
}
