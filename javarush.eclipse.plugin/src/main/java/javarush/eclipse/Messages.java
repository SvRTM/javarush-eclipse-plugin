package javarush.eclipse;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "javarush.eclipse.messages";//$NON-NLS-1$

    static {
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    public static String title;

    public static String toolbox_TaskList_checkTask;
    public static String toolbox_TaskList_taskList;

    public static String pref_MainPage_projectName;
    public static String pref_MainPage_secretKey;
    public static String pref_MainPage_sessionUpdateInterval;
    public static String pref_MainPage_session_minutes;
    public static String action_pref_MainPage_createProject;
    public static String action_pref_MainPage_addSecretKey;
    public static String warn_pref_MainPage_projectExist;
    public static String info_pref_MainPage_projectCreate;
    public static String error_pref_MainPage_emptyProjectName;

    public static String dialog_UserInfo_title;
    public static String dialog_UserInfo_level;
    public static String dialog_UserInfo_lesson;
    public static String dialog_UserInfo_silverMoney;
    public static String dialog_UserInfo_goldMoney;
    public static String dialog_UserInfo_fill;

    public static String title_UserInfo;
    public static String monitor_UserInfo;
    public static String monitor_UserInfo_loadUserProfile;

    public static String monitor_Authorization;

    public static String title_TaskList;
    public static String monitor_TaskList;
    public static String monitor_TaskList_countUnreadMessages;
    public static String monitor_TaskList_countUnresolvedTasks;
    public static String monitor_TaskList_sortingTasks;

    public static String title_ResetProgress;
    public static String monitor_ResetProgress;
    public static String monitor_ResetProgress_reset;

    public static String title_LoadTask;
    public static String monitor_LoadTaskProject;
    public static String monitor_LoadTask_downloadJavaFiles;
    public static String monitor_LoadTask_newTask;
    public static String monitor_CheckTask;
    public static String title_CheckTask;
    public static String monitor_CheckTask_taskNumber;
    public static String monitor_CheckTask_sentOnCheck;

    public static String error_getWorkspace;
    public static String error_getRoot;
    public static String error_getRootLocation;
    public static String error_closedProject;
    public static String error_sourceFolderNotFound;
    public static String error_getActivePage;
    public static String error_getActiveEditor;
    public static String error_getEditorInput;
    public static String error_getActiveWorknchWindow;
    public static String error_findProject;
    public static String error_findFilePackage;
    public static String error_findFile;
    public static String error_findFolder;

    public static String error_CheckTask_onlyJavaFile;
    public static String error_CheckTask_checkTask;
    public static String error_CheckTask_invalidPackage;
    public static String title_CheckTask_compilation;
    public static String title_CheckTask_validation;
    public static String title_CheckTask_wellDone;
    public static String info_CheckTask_errorCompilation;
    public static String info_CheckTask_statistics;

    public static String title_errorMessage;

    public static String error_Login_secKeyEmpty;
    public static String error_Login_sessionIdEmpty;
    public static String error_Login_oldVersion;
    public static String error_Login_authorizationError;
    public static String error_Login_unknownError;

    public static String error_TaskList_emptyKeyTask;
    public static String table_TaskList_typeColumn;
    public static String table_TaskList_teacherColumn;
    public static String table_TaskList_conditionColumn;
    public static String table_TaskList_rewardColumn;
    public static String confirm_TaskList_titleUnreadMessages;
    public static String info_TaskList_unreadMessages;
    public static String error_TaskList_countUnreadMessages;
    public static String error_TaskList_receiveUnresolvedTask;
    public static String info_TaskList_noAvailableTasks;

    public static String menu_TaskList_resetProgressTask;
    public static String menu_TaskList_askHelpTask;
    public static String menu_TaskList_discussTask;

    public static String confirm_TaskList_titleConfirm;
    public static String confirm_TaskList_resetProgress;

    public static String info_ResetProgress_success;

    public static String ServiceResultErrorCode_Success;
    public static String ServiceResultErrorCode_AuthorizationError;
    public static String ServiceResultErrorCode_RequestTimeout;
    public static String ServiceResultErrorCode_ServerUnavailable;
    public static String ServiceResultErrorCode_ApiVersionMismatch;
    public static String ServiceResultErrorCode_UnknownUser;
    public static String ServiceResultErrorCode_UnknownTask;
    public static String ServiceResultErrorCode_TaskSolved;
    public static String ServiceResultErrorCode_TaskUnavailable;
    public static String ServiceResultErrorCode_AccessDenied;
    public static String ServiceResultErrorCode_UnknownError;

    public static String TaskType_Practical;
    public static String TaskType_Homework;
    public static String TaskType_Bonus;
    public static String TaskType_Big;

    public static String TaskStatus_Unknown;
    public static String TaskStatus_Assigned;
    public static String TaskStatus_InProgress;
    public static String TaskStatus_Solved;
    public static String TaskStatus_Hidden;
    public static String TaskStatus_Preassigned;
    public static String TaskStatus_Restricted;
    public static String TaskStatus_Disabled;

    public static String CompilationStatus_Success;
    public static String CompilationStatus_UnknownError;
    public static String CompilationStatus_SaveError;
    public static String CompilationStatus_QuoteExpectedError;
    public static String CompilationStatus_SemicolonExpectedError;
    public static String CompilationStatus_BraceExpectedError;
    public static String CompilationStatus_ParenthesisExpectedError;
    public static String CompilationStatus_NotAStatementError;

    public static String ValidationStatus_Success;
    public static String ValidationStatus_UnknownError;
    public static String ValidationStatus_Invalid;
    public static String ValidationStatus_InvalidButPartialSuccess;
    public static String ValidationStatus_TimeoutError;
    public static String ValidationStatus_SecurityError;
    public static String ValidationStatus_TaskSolvedError;
    public static String ValidationStatus_TaskUnavailableError;
}
