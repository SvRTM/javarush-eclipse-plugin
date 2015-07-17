
package javarush.eclipse.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the javarush.eclipse.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceResultOfByteArrayResult_QNAME = new QName("", "Result");
    private final static QName _CloseTopic_QNAME = new QName("http://api1.controller.diana.javarush.com/", "CloseTopic");
    private final static QName _DeleteComment_QNAME = new QName("http://api1.controller.diana.javarush.com/", "DeleteComment");
    private final static QName _GetUserTaskSolutionByTaskKeyResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserTaskSolutionByTaskKeyResponse");
    private final static QName _GetMessagesResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetMessagesResponse");
    private final static QName _ReportErrorResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ReportErrorResponse");
    private final static QName _GetMessages_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetMessages");
    private final static QName _VoteForDifficultyRating_QNAME = new QName("http://api1.controller.diana.javarush.com/", "VoteForDifficultyRating");
    private final static QName _ResetBigTask_QNAME = new QName("http://api1.controller.diana.javarush.com/", "resetBigTask");
    private final static QName _GetUnsolvedHomeTasks_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUnsolvedHomeTasks");
    private final static QName _GetUnsolvedLessonTasksResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUnsolvedLessonTasksResponse");
    private final static QName _DeleteTopic_QNAME = new QName("http://api1.controller.diana.javarush.com/", "DeleteTopic");
    private final static QName _TaskInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TaskInfo");
    private final static QName _SendError_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SendError");
    private final static QName _VoteForDifficultyRatingResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "VoteForDifficultyRatingResponse");
    private final static QName _GetCurrentUserTaskArchiveResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetCurrentUserTaskArchiveResponse");
    private final static QName _GetMessageByIdResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetMessageByIdResponse");
    private final static QName _AskForHelpWithTask_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AskForHelpWithTask");
    private final static QName _ServiceResultOfByteArray_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfByteArray");
    private final static QName _ServiceResultOfUserInfoList_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfUserInfoList");
    private final static QName _CloseTopicResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "CloseTopicResponse");
    private final static QName _AddCommentToTaskResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AddCommentToTaskResponse");
    private final static QName _GetUserSubscriptions_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserSubscriptions");
    private final static QName _SendMessageResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SendMessageResponse");
    private final static QName _LeaveTopic_QNAME = new QName("http://api1.controller.diana.javarush.com/", "LeaveTopic");
    private final static QName _ServiceResultOfBoolean_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfBoolean");
    private final static QName _SignOutResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SignOutResponse");
    private final static QName _ServiceResult_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ServiceResult");
    private final static QName _GetCurrentUserSessionIdResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetCurrentUserSessionIdResponse");
    private final static QName _ServiceResultOfTaskInfoList_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfTaskInfoList");
    private final static QName _ServiceResultOfTopicListInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfTopicListInfo");
    private final static QName _SignInViaSecretKey_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SignInViaSecretKey");
    private final static QName _MarkAsRead_QNAME = new QName("http://api1.controller.diana.javarush.com/", "MarkAsRead");
    private final static QName _GetCurrentUserTaskArchive_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetCurrentUserTaskArchive");
    private final static QName _ServiceResultOfMessageInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfMessageInfo");
    private final static QName _SendMessage_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SendMessage");
    private final static QName _ServiceResultOfSubscriptionInfoList_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfSubscriptionInfoList");
    private final static QName _MessageInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "MessageInfo");
    private final static QName _TaskCompleatedResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TaskCompleatedResponse");
    private final static QName _ServiceResultOfClassDataInfoList_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfClassDataInfoList");
    private final static QName _ValidateForClientResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ValidateForClientResponse");
    private final static QName _SubscriptionInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SubscriptionInfo");
    private final static QName _ServiceResultOfTaskInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfTaskInfo");
    private final static QName _SignOut_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SignOut");
    private final static QName _GetUserProfilesByIdList_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserProfilesByIdList");
    private final static QName _AskQuestion_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AskQuestion");
    private final static QName _ValidateForClient_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ValidateForClient");
    private final static QName _DeleteTopicResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "DeleteTopicResponse");
    private final static QName _GetUnsolvedLessonTasks_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUnsolvedLessonTasks");
    private final static QName _AskQuestionResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AskQuestionResponse");
    private final static QName _GetVideoUrlFromPlayerUrl_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetVideoUrlFromPlayerUrl");
    private final static QName _GetUnsolvedHomeTasksResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUnsolvedHomeTasksResponse");
    private final static QName _CreateTaskHelpTopic_QNAME = new QName("http://api1.controller.diana.javarush.com/", "CreateTaskHelpTopic");
    private final static QName _CreateTaskHelpTopicResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "CreateTaskHelpTopicResponse");
    private final static QName _SendErrorResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SendErrorResponse");
    private final static QName _ServiceResultOfUserInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfUserInfo");
    private final static QName _GetCurrentUserProfileResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetCurrentUserProfileResponse");
    private final static QName _GetVideoUrlFromPlayerUrlResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetVideoUrlFromPlayerUrlResponse");
    private final static QName _ServiceResultOfString_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfString");
    private final static QName _SignUpAsReadOnlyUserResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SignUpAsReadOnlyUserResponse");
    private final static QName _GetUnreadedMessagesCountResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUnreadedMessagesCountResponse");
    private final static QName _GetUnreadedMessagesCount_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUnreadedMessagesCount");
    private final static QName _LessonComplete_QNAME = new QName("http://api1.controller.diana.javarush.com/", "LessonComplete");
    private final static QName _ValidateForPlugin_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ValidateForPlugin");
    private final static QName _ReportError_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ReportError");
    private final static QName _TaskCompleated_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TaskCompleated");
    private final static QName _GetTaskTemplateResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetTaskTemplateResponse");
    private final static QName _GetUserTopicsResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserTopicsResponse");
    private final static QName _AskForHelpResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AskForHelpResponse");
    private final static QName _GetMessageById_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetMessageById");
    private final static QName _GetUserTopicCommentsResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserTopicCommentsResponse");
    private final static QName _GetUserSubscriptionsResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserSubscriptionsResponse");
    private final static QName _ClassDataInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ClassDataInfo");
    private final static QName _TaskInProgress_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TaskInProgress");
    private final static QName _ValidateInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ValidateInfo");
    private final static QName _TopicCommentInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TopicCommentInfo");
    private final static QName _ServiceResultOfTopicInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfTopicInfo");
    private final static QName _SignUpAsReadOnlyUser_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SignUpAsReadOnlyUser");
    private final static QName _ServiceResultOfTopicCommentListInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfTopicCommentListInfo");
    private final static QName _TopicInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TopicInfo");
    private final static QName _VoteForInterestRating_QNAME = new QName("http://api1.controller.diana.javarush.com/", "VoteForInterestRating");
    private final static QName _AskForHelpWithTaskResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AskForHelpWithTaskResponse");
    private final static QName _GetUserTopics_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserTopics");
    private final static QName _GetCurrentUserProfile_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetCurrentUserProfile");
    private final static QName _LeaveTopicResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "LeaveTopicResponse");
    private final static QName _GetCurrentUserSessionId_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetCurrentUserSessionId");
    private final static QName _SignInViaSecretKeyResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "SignInViaSecretKeyResponse");
    private final static QName _ServiceResultOfMessageInfoList_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfMessageInfoList");
    private final static QName _GetUserProfilesByIdListResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserProfilesByIdListResponse");
    private final static QName _ResetBigTaskResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "resetBigTaskResponse");
    private final static QName _LessonCompleteResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "LessonCompleteResponse");
    private final static QName _DeleteCommentResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "DeleteCommentResponse");
    private final static QName _TopicListInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TopicListInfo");
    private final static QName _TaskInProgressResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TaskInProgressResponse");
    private final static QName _UserStatisticInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "UserStatisticInfo");
    private final static QName _ServiceResultOfTopicCommentInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfTopicCommentInfo");
    private final static QName _VoteForInterestRatingResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "VoteForInterestRatingResponse");
    private final static QName _AddCommentToTopic_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AddCommentToTopic");
    private final static QName _UserInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "UserInfo");
    private final static QName _MarkAsReadResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "MarkAsReadResponse");
    private final static QName _GetUserTaskSolutionByTaskKey_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserTaskSolutionByTaskKey");
    private final static QName _ValidateForPluginResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ValidateForPluginResponse");
    private final static QName _ConvertMoneyToGoldResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ConvertMoneyToGoldResponse");
    private final static QName _ServiceResultOfValidationInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfValidationInfo");
    private final static QName _AddCommentToTask_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AddCommentToTask");
    private final static QName _GetUserTopicComments_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetUserTopicComments");
    private final static QName _TopicCommentListInfo_QNAME = new QName("http://api1.controller.diana.javarush.com/", "TopicCommentListInfo");
    private final static QName _ConvertMoneyToGold_QNAME = new QName("http://api1.controller.diana.javarush.com/", "ConvertMoneyToGold");
    private final static QName _AskForHelp_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AskForHelp");
    private final static QName _GetTaskTemplate_QNAME = new QName("http://api1.controller.diana.javarush.com/", "GetTaskTemplate");
    private final static QName _AddCommentToTopicResponse_QNAME = new QName("http://api1.controller.diana.javarush.com/", "AddCommentToTopicResponse");
    private final static QName _ServiceResultOfInteger_QNAME = new QName("http://api1.controller.diana.javarush.com/", "serviceResultOfInteger");
    private final static QName _UserInfoStatistics_QNAME = new QName("", "Statistics");
    private final static QName _UserInfoTaskts_QNAME = new QName("", "Taskts");
    private final static QName _TopicListInfoList_QNAME = new QName("", "List");
    private final static QName _TaskInfoHelps_QNAME = new QName("", "Helps");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javarush.eclipse.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceResultOfSubscriptionInfoList }
     * 
     */
    public ServiceResultOfSubscriptionInfoList createServiceResultOfSubscriptionInfoList() {
        return new ServiceResultOfSubscriptionInfoList();
    }

    /**
     * Create an instance of {@link ServiceResultOfClassDataInfoList }
     * 
     */
    public ServiceResultOfClassDataInfoList createServiceResultOfClassDataInfoList() {
        return new ServiceResultOfClassDataInfoList();
    }

    /**
     * Create an instance of {@link TaskInfo }
     * 
     */
    public TaskInfo createTaskInfo() {
        return new TaskInfo();
    }

    /**
     * Create an instance of {@link ServiceResultOfTaskInfoList }
     * 
     */
    public ServiceResultOfTaskInfoList createServiceResultOfTaskInfoList() {
        return new ServiceResultOfTaskInfoList();
    }

    /**
     * Create an instance of {@link ServiceResultOfUserInfoList }
     * 
     */
    public ServiceResultOfUserInfoList createServiceResultOfUserInfoList() {
        return new ServiceResultOfUserInfoList();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link ServiceResultOfMessageInfoList }
     * 
     */
    public ServiceResultOfMessageInfoList createServiceResultOfMessageInfoList() {
        return new ServiceResultOfMessageInfoList();
    }

    /**
     * Create an instance of {@link TopicListInfo }
     * 
     */
    public TopicListInfo createTopicListInfo() {
        return new TopicListInfo();
    }

    /**
     * Create an instance of {@link TopicCommentListInfo }
     * 
     */
    public TopicCommentListInfo createTopicCommentListInfo() {
        return new TopicCommentListInfo();
    }

    /**
     * Create an instance of {@link ServiceResultOfTopicCommentListInfo }
     * 
     */
    public ServiceResultOfTopicCommentListInfo createServiceResultOfTopicCommentListInfo() {
        return new ServiceResultOfTopicCommentListInfo();
    }

    /**
     * Create an instance of {@link SignUpAsReadOnlyUser }
     * 
     */
    public SignUpAsReadOnlyUser createSignUpAsReadOnlyUser() {
        return new SignUpAsReadOnlyUser();
    }

    /**
     * Create an instance of {@link ServiceResultOfTopicInfo }
     * 
     */
    public ServiceResultOfTopicInfo createServiceResultOfTopicInfo() {
        return new ServiceResultOfTopicInfo();
    }

    /**
     * Create an instance of {@link TopicCommentInfo }
     * 
     */
    public TopicCommentInfo createTopicCommentInfo() {
        return new TopicCommentInfo();
    }

    /**
     * Create an instance of {@link GetCurrentUserProfile }
     * 
     */
    public GetCurrentUserProfile createGetCurrentUserProfile() {
        return new GetCurrentUserProfile();
    }

    /**
     * Create an instance of {@link GetCurrentUserSessionId }
     * 
     */
    public GetCurrentUserSessionId createGetCurrentUserSessionId() {
        return new GetCurrentUserSessionId();
    }

    /**
     * Create an instance of {@link LeaveTopicResponse }
     * 
     */
    public LeaveTopicResponse createLeaveTopicResponse() {
        return new LeaveTopicResponse();
    }

    /**
     * Create an instance of {@link GetUserTopics }
     * 
     */
    public GetUserTopics createGetUserTopics() {
        return new GetUserTopics();
    }

    /**
     * Create an instance of {@link AskForHelpWithTaskResponse }
     * 
     */
    public AskForHelpWithTaskResponse createAskForHelpWithTaskResponse() {
        return new AskForHelpWithTaskResponse();
    }

    /**
     * Create an instance of {@link VoteForInterestRating }
     * 
     */
    public VoteForInterestRating createVoteForInterestRating() {
        return new VoteForInterestRating();
    }

    /**
     * Create an instance of {@link TopicInfo }
     * 
     */
    public TopicInfo createTopicInfo() {
        return new TopicInfo();
    }

    /**
     * Create an instance of {@link GetTaskTemplateResponse }
     * 
     */
    public GetTaskTemplateResponse createGetTaskTemplateResponse() {
        return new GetTaskTemplateResponse();
    }

    /**
     * Create an instance of {@link ReportError }
     * 
     */
    public ReportError createReportError() {
        return new ReportError();
    }

    /**
     * Create an instance of {@link TaskCompleated }
     * 
     */
    public TaskCompleated createTaskCompleated() {
        return new TaskCompleated();
    }

    /**
     * Create an instance of {@link ValidateForPlugin }
     * 
     */
    public ValidateForPlugin createValidateForPlugin() {
        return new ValidateForPlugin();
    }

    /**
     * Create an instance of {@link GetUnreadedMessagesCount }
     * 
     */
    public GetUnreadedMessagesCount createGetUnreadedMessagesCount() {
        return new GetUnreadedMessagesCount();
    }

    /**
     * Create an instance of {@link LessonComplete }
     * 
     */
    public LessonComplete createLessonComplete() {
        return new LessonComplete();
    }

    /**
     * Create an instance of {@link GetUnreadedMessagesCountResponse }
     * 
     */
    public GetUnreadedMessagesCountResponse createGetUnreadedMessagesCountResponse() {
        return new GetUnreadedMessagesCountResponse();
    }

    /**
     * Create an instance of {@link SignUpAsReadOnlyUserResponse }
     * 
     */
    public SignUpAsReadOnlyUserResponse createSignUpAsReadOnlyUserResponse() {
        return new SignUpAsReadOnlyUserResponse();
    }

    /**
     * Create an instance of {@link ClassDataInfo }
     * 
     */
    public ClassDataInfo createClassDataInfo() {
        return new ClassDataInfo();
    }

    /**
     * Create an instance of {@link TaskInProgress }
     * 
     */
    public TaskInProgress createTaskInProgress() {
        return new TaskInProgress();
    }

    /**
     * Create an instance of {@link ValidateInfo }
     * 
     */
    public ValidateInfo createValidateInfo() {
        return new ValidateInfo();
    }

    /**
     * Create an instance of {@link GetUserSubscriptionsResponse }
     * 
     */
    public GetUserSubscriptionsResponse createGetUserSubscriptionsResponse() {
        return new GetUserSubscriptionsResponse();
    }

    /**
     * Create an instance of {@link GetUserTopicCommentsResponse }
     * 
     */
    public GetUserTopicCommentsResponse createGetUserTopicCommentsResponse() {
        return new GetUserTopicCommentsResponse();
    }

    /**
     * Create an instance of {@link GetUserTopicsResponse }
     * 
     */
    public GetUserTopicsResponse createGetUserTopicsResponse() {
        return new GetUserTopicsResponse();
    }

    /**
     * Create an instance of {@link GetMessageById }
     * 
     */
    public GetMessageById createGetMessageById() {
        return new GetMessageById();
    }

    /**
     * Create an instance of {@link AskForHelpResponse }
     * 
     */
    public AskForHelpResponse createAskForHelpResponse() {
        return new AskForHelpResponse();
    }

    /**
     * Create an instance of {@link GetUserTopicComments }
     * 
     */
    public GetUserTopicComments createGetUserTopicComments() {
        return new GetUserTopicComments();
    }

    /**
     * Create an instance of {@link AddCommentToTask }
     * 
     */
    public AddCommentToTask createAddCommentToTask() {
        return new AddCommentToTask();
    }

    /**
     * Create an instance of {@link ServiceResultOfValidationInfo }
     * 
     */
    public ServiceResultOfValidationInfo createServiceResultOfValidationInfo() {
        return new ServiceResultOfValidationInfo();
    }

    /**
     * Create an instance of {@link ConvertMoneyToGoldResponse }
     * 
     */
    public ConvertMoneyToGoldResponse createConvertMoneyToGoldResponse() {
        return new ConvertMoneyToGoldResponse();
    }

    /**
     * Create an instance of {@link ValidateForPluginResponse }
     * 
     */
    public ValidateForPluginResponse createValidateForPluginResponse() {
        return new ValidateForPluginResponse();
    }

    /**
     * Create an instance of {@link ServiceResultOfInteger }
     * 
     */
    public ServiceResultOfInteger createServiceResultOfInteger() {
        return new ServiceResultOfInteger();
    }

    /**
     * Create an instance of {@link AddCommentToTopicResponse }
     * 
     */
    public AddCommentToTopicResponse createAddCommentToTopicResponse() {
        return new AddCommentToTopicResponse();
    }

    /**
     * Create an instance of {@link GetTaskTemplate }
     * 
     */
    public GetTaskTemplate createGetTaskTemplate() {
        return new GetTaskTemplate();
    }

    /**
     * Create an instance of {@link AskForHelp }
     * 
     */
    public AskForHelp createAskForHelp() {
        return new AskForHelp();
    }

    /**
     * Create an instance of {@link ConvertMoneyToGold }
     * 
     */
    public ConvertMoneyToGold createConvertMoneyToGold() {
        return new ConvertMoneyToGold();
    }

    /**
     * Create an instance of {@link DeleteCommentResponse }
     * 
     */
    public DeleteCommentResponse createDeleteCommentResponse() {
        return new DeleteCommentResponse();
    }

    /**
     * Create an instance of {@link LessonCompleteResponse }
     * 
     */
    public LessonCompleteResponse createLessonCompleteResponse() {
        return new LessonCompleteResponse();
    }

    /**
     * Create an instance of {@link ResetBigTaskResponse }
     * 
     */
    public ResetBigTaskResponse createResetBigTaskResponse() {
        return new ResetBigTaskResponse();
    }

    /**
     * Create an instance of {@link GetUserProfilesByIdListResponse }
     * 
     */
    public GetUserProfilesByIdListResponse createGetUserProfilesByIdListResponse() {
        return new GetUserProfilesByIdListResponse();
    }

    /**
     * Create an instance of {@link SignInViaSecretKeyResponse }
     * 
     */
    public SignInViaSecretKeyResponse createSignInViaSecretKeyResponse() {
        return new SignInViaSecretKeyResponse();
    }

    /**
     * Create an instance of {@link GetUserTaskSolutionByTaskKey }
     * 
     */
    public GetUserTaskSolutionByTaskKey createGetUserTaskSolutionByTaskKey() {
        return new GetUserTaskSolutionByTaskKey();
    }

    /**
     * Create an instance of {@link MarkAsReadResponse }
     * 
     */
    public MarkAsReadResponse createMarkAsReadResponse() {
        return new MarkAsReadResponse();
    }

    /**
     * Create an instance of {@link VoteForInterestRatingResponse }
     * 
     */
    public VoteForInterestRatingResponse createVoteForInterestRatingResponse() {
        return new VoteForInterestRatingResponse();
    }

    /**
     * Create an instance of {@link ServiceResultOfTopicCommentInfo }
     * 
     */
    public ServiceResultOfTopicCommentInfo createServiceResultOfTopicCommentInfo() {
        return new ServiceResultOfTopicCommentInfo();
    }

    /**
     * Create an instance of {@link AddCommentToTopic }
     * 
     */
    public AddCommentToTopic createAddCommentToTopic() {
        return new AddCommentToTopic();
    }

    /**
     * Create an instance of {@link UserStatisticInfo }
     * 
     */
    public UserStatisticInfo createUserStatisticInfo() {
        return new UserStatisticInfo();
    }

    /**
     * Create an instance of {@link TaskInProgressResponse }
     * 
     */
    public TaskInProgressResponse createTaskInProgressResponse() {
        return new TaskInProgressResponse();
    }

    /**
     * Create an instance of {@link LeaveTopic }
     * 
     */
    public LeaveTopic createLeaveTopic() {
        return new LeaveTopic();
    }

    /**
     * Create an instance of {@link GetUserSubscriptions }
     * 
     */
    public GetUserSubscriptions createGetUserSubscriptions() {
        return new GetUserSubscriptions();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link CloseTopicResponse }
     * 
     */
    public CloseTopicResponse createCloseTopicResponse() {
        return new CloseTopicResponse();
    }

    /**
     * Create an instance of {@link ServiceResultOfByteArray }
     * 
     */
    public ServiceResultOfByteArray createServiceResultOfByteArray() {
        return new ServiceResultOfByteArray();
    }

    /**
     * Create an instance of {@link AddCommentToTaskResponse }
     * 
     */
    public AddCommentToTaskResponse createAddCommentToTaskResponse() {
        return new AddCommentToTaskResponse();
    }

    /**
     * Create an instance of {@link ServiceResultOfTopicListInfo }
     * 
     */
    public ServiceResultOfTopicListInfo createServiceResultOfTopicListInfo() {
        return new ServiceResultOfTopicListInfo();
    }

    /**
     * Create an instance of {@link GetCurrentUserSessionIdResponse }
     * 
     */
    public GetCurrentUserSessionIdResponse createGetCurrentUserSessionIdResponse() {
        return new GetCurrentUserSessionIdResponse();
    }

    /**
     * Create an instance of {@link ServiceResult }
     * 
     */
    public ServiceResult createServiceResult() {
        return new ServiceResult();
    }

    /**
     * Create an instance of {@link SignOutResponse }
     * 
     */
    public SignOutResponse createSignOutResponse() {
        return new SignOutResponse();
    }

    /**
     * Create an instance of {@link ServiceResultOfBoolean }
     * 
     */
    public ServiceResultOfBoolean createServiceResultOfBoolean() {
        return new ServiceResultOfBoolean();
    }

    /**
     * Create an instance of {@link GetMessages }
     * 
     */
    public GetMessages createGetMessages() {
        return new GetMessages();
    }

    /**
     * Create an instance of {@link VoteForDifficultyRating }
     * 
     */
    public VoteForDifficultyRating createVoteForDifficultyRating() {
        return new VoteForDifficultyRating();
    }

    /**
     * Create an instance of {@link GetUnsolvedHomeTasks }
     * 
     */
    public GetUnsolvedHomeTasks createGetUnsolvedHomeTasks() {
        return new GetUnsolvedHomeTasks();
    }

    /**
     * Create an instance of {@link ResetBigTask }
     * 
     */
    public ResetBigTask createResetBigTask() {
        return new ResetBigTask();
    }

    /**
     * Create an instance of {@link ReportErrorResponse }
     * 
     */
    public ReportErrorResponse createReportErrorResponse() {
        return new ReportErrorResponse();
    }

    /**
     * Create an instance of {@link GetUserTaskSolutionByTaskKeyResponse }
     * 
     */
    public GetUserTaskSolutionByTaskKeyResponse createGetUserTaskSolutionByTaskKeyResponse() {
        return new GetUserTaskSolutionByTaskKeyResponse();
    }

    /**
     * Create an instance of {@link CloseTopic }
     * 
     */
    public CloseTopic createCloseTopic() {
        return new CloseTopic();
    }

    /**
     * Create an instance of {@link DeleteComment }
     * 
     */
    public DeleteComment createDeleteComment() {
        return new DeleteComment();
    }

    /**
     * Create an instance of {@link GetMessagesResponse }
     * 
     */
    public GetMessagesResponse createGetMessagesResponse() {
        return new GetMessagesResponse();
    }

    /**
     * Create an instance of {@link AskForHelpWithTask }
     * 
     */
    public AskForHelpWithTask createAskForHelpWithTask() {
        return new AskForHelpWithTask();
    }

    /**
     * Create an instance of {@link GetMessageByIdResponse }
     * 
     */
    public GetMessageByIdResponse createGetMessageByIdResponse() {
        return new GetMessageByIdResponse();
    }

    /**
     * Create an instance of {@link GetCurrentUserTaskArchiveResponse }
     * 
     */
    public GetCurrentUserTaskArchiveResponse createGetCurrentUserTaskArchiveResponse() {
        return new GetCurrentUserTaskArchiveResponse();
    }

    /**
     * Create an instance of {@link SendError }
     * 
     */
    public SendError createSendError() {
        return new SendError();
    }

    /**
     * Create an instance of {@link VoteForDifficultyRatingResponse }
     * 
     */
    public VoteForDifficultyRatingResponse createVoteForDifficultyRatingResponse() {
        return new VoteForDifficultyRatingResponse();
    }

    /**
     * Create an instance of {@link DeleteTopic }
     * 
     */
    public DeleteTopic createDeleteTopic() {
        return new DeleteTopic();
    }

    /**
     * Create an instance of {@link GetUnsolvedLessonTasksResponse }
     * 
     */
    public GetUnsolvedLessonTasksResponse createGetUnsolvedLessonTasksResponse() {
        return new GetUnsolvedLessonTasksResponse();
    }

    /**
     * Create an instance of {@link GetUnsolvedHomeTasksResponse }
     * 
     */
    public GetUnsolvedHomeTasksResponse createGetUnsolvedHomeTasksResponse() {
        return new GetUnsolvedHomeTasksResponse();
    }

    /**
     * Create an instance of {@link CreateTaskHelpTopic }
     * 
     */
    public CreateTaskHelpTopic createCreateTaskHelpTopic() {
        return new CreateTaskHelpTopic();
    }

    /**
     * Create an instance of {@link GetVideoUrlFromPlayerUrl }
     * 
     */
    public GetVideoUrlFromPlayerUrl createGetVideoUrlFromPlayerUrl() {
        return new GetVideoUrlFromPlayerUrl();
    }

    /**
     * Create an instance of {@link AskQuestionResponse }
     * 
     */
    public AskQuestionResponse createAskQuestionResponse() {
        return new AskQuestionResponse();
    }

    /**
     * Create an instance of {@link GetUnsolvedLessonTasks }
     * 
     */
    public GetUnsolvedLessonTasks createGetUnsolvedLessonTasks() {
        return new GetUnsolvedLessonTasks();
    }

    /**
     * Create an instance of {@link DeleteTopicResponse }
     * 
     */
    public DeleteTopicResponse createDeleteTopicResponse() {
        return new DeleteTopicResponse();
    }

    /**
     * Create an instance of {@link ServiceResultOfString }
     * 
     */
    public ServiceResultOfString createServiceResultOfString() {
        return new ServiceResultOfString();
    }

    /**
     * Create an instance of {@link ServiceResultOfUserInfo }
     * 
     */
    public ServiceResultOfUserInfo createServiceResultOfUserInfo() {
        return new ServiceResultOfUserInfo();
    }

    /**
     * Create an instance of {@link GetCurrentUserProfileResponse }
     * 
     */
    public GetCurrentUserProfileResponse createGetCurrentUserProfileResponse() {
        return new GetCurrentUserProfileResponse();
    }

    /**
     * Create an instance of {@link GetVideoUrlFromPlayerUrlResponse }
     * 
     */
    public GetVideoUrlFromPlayerUrlResponse createGetVideoUrlFromPlayerUrlResponse() {
        return new GetVideoUrlFromPlayerUrlResponse();
    }

    /**
     * Create an instance of {@link CreateTaskHelpTopicResponse }
     * 
     */
    public CreateTaskHelpTopicResponse createCreateTaskHelpTopicResponse() {
        return new CreateTaskHelpTopicResponse();
    }

    /**
     * Create an instance of {@link SendErrorResponse }
     * 
     */
    public SendErrorResponse createSendErrorResponse() {
        return new SendErrorResponse();
    }

    /**
     * Create an instance of {@link MessageInfo }
     * 
     */
    public MessageInfo createMessageInfo() {
        return new MessageInfo();
    }

    /**
     * Create an instance of {@link TaskCompleatedResponse }
     * 
     */
    public TaskCompleatedResponse createTaskCompleatedResponse() {
        return new TaskCompleatedResponse();
    }

    /**
     * Create an instance of {@link ServiceResultOfMessageInfo }
     * 
     */
    public ServiceResultOfMessageInfo createServiceResultOfMessageInfo() {
        return new ServiceResultOfMessageInfo();
    }

    /**
     * Create an instance of {@link GetCurrentUserTaskArchive }
     * 
     */
    public GetCurrentUserTaskArchive createGetCurrentUserTaskArchive() {
        return new GetCurrentUserTaskArchive();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link SignInViaSecretKey }
     * 
     */
    public SignInViaSecretKey createSignInViaSecretKey() {
        return new SignInViaSecretKey();
    }

    /**
     * Create an instance of {@link MarkAsRead }
     * 
     */
    public MarkAsRead createMarkAsRead() {
        return new MarkAsRead();
    }

    /**
     * Create an instance of {@link GetUserProfilesByIdList }
     * 
     */
    public GetUserProfilesByIdList createGetUserProfilesByIdList() {
        return new GetUserProfilesByIdList();
    }

    /**
     * Create an instance of {@link ValidateForClient }
     * 
     */
    public ValidateForClient createValidateForClient() {
        return new ValidateForClient();
    }

    /**
     * Create an instance of {@link AskQuestion }
     * 
     */
    public AskQuestion createAskQuestion() {
        return new AskQuestion();
    }

    /**
     * Create an instance of {@link SignOut }
     * 
     */
    public SignOut createSignOut() {
        return new SignOut();
    }

    /**
     * Create an instance of {@link ServiceResultOfTaskInfo }
     * 
     */
    public ServiceResultOfTaskInfo createServiceResultOfTaskInfo() {
        return new ServiceResultOfTaskInfo();
    }

    /**
     * Create an instance of {@link ValidateForClientResponse }
     * 
     */
    public ValidateForClientResponse createValidateForClientResponse() {
        return new ValidateForClientResponse();
    }

    /**
     * Create an instance of {@link SubscriptionInfo }
     * 
     */
    public SubscriptionInfo createSubscriptionInfo() {
        return new SubscriptionInfo();
    }

    /**
     * Create an instance of {@link ServiceResultOfSubscriptionInfoList.Result }
     * 
     */
    public ServiceResultOfSubscriptionInfoList.Result createServiceResultOfSubscriptionInfoListResult() {
        return new ServiceResultOfSubscriptionInfoList.Result();
    }

    /**
     * Create an instance of {@link ServiceResultOfClassDataInfoList.Result }
     * 
     */
    public ServiceResultOfClassDataInfoList.Result createServiceResultOfClassDataInfoListResult() {
        return new ServiceResultOfClassDataInfoList.Result();
    }

    /**
     * Create an instance of {@link TaskInfo.Helps }
     * 
     */
    public TaskInfo.Helps createTaskInfoHelps() {
        return new TaskInfo.Helps();
    }

    /**
     * Create an instance of {@link ServiceResultOfTaskInfoList.Result }
     * 
     */
    public ServiceResultOfTaskInfoList.Result createServiceResultOfTaskInfoListResult() {
        return new ServiceResultOfTaskInfoList.Result();
    }

    /**
     * Create an instance of {@link ServiceResultOfUserInfoList.Result }
     * 
     */
    public ServiceResultOfUserInfoList.Result createServiceResultOfUserInfoListResult() {
        return new ServiceResultOfUserInfoList.Result();
    }

    /**
     * Create an instance of {@link UserInfo.Taskts }
     * 
     */
    public UserInfo.Taskts createUserInfoTaskts() {
        return new UserInfo.Taskts();
    }

    /**
     * Create an instance of {@link UserInfo.Statistics }
     * 
     */
    public UserInfo.Statistics createUserInfoStatistics() {
        return new UserInfo.Statistics();
    }

    /**
     * Create an instance of {@link ServiceResultOfMessageInfoList.Result }
     * 
     */
    public ServiceResultOfMessageInfoList.Result createServiceResultOfMessageInfoListResult() {
        return new ServiceResultOfMessageInfoList.Result();
    }

    /**
     * Create an instance of {@link TopicListInfo.List }
     * 
     */
    public TopicListInfo.List createTopicListInfoList() {
        return new TopicListInfo.List();
    }

    /**
     * Create an instance of {@link TopicCommentListInfo.List }
     * 
     */
    public TopicCommentListInfo.List createTopicCommentListInfoList() {
        return new TopicCommentListInfo.List();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result", scope = ServiceResultOfByteArray.class)
    public JAXBElement<byte[]> createServiceResultOfByteArrayResult(byte[] value) {
        return new JAXBElement<byte[]>(_ServiceResultOfByteArrayResult_QNAME, byte[].class, ServiceResultOfByteArray.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "CloseTopic")
    public JAXBElement<CloseTopic> createCloseTopic(CloseTopic value) {
        return new JAXBElement<CloseTopic>(_CloseTopic_QNAME, CloseTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "DeleteComment")
    public JAXBElement<DeleteComment> createDeleteComment(DeleteComment value) {
        return new JAXBElement<DeleteComment>(_DeleteComment_QNAME, DeleteComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTaskSolutionByTaskKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserTaskSolutionByTaskKeyResponse")
    public JAXBElement<GetUserTaskSolutionByTaskKeyResponse> createGetUserTaskSolutionByTaskKeyResponse(GetUserTaskSolutionByTaskKeyResponse value) {
        return new JAXBElement<GetUserTaskSolutionByTaskKeyResponse>(_GetUserTaskSolutionByTaskKeyResponse_QNAME, GetUserTaskSolutionByTaskKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetMessagesResponse")
    public JAXBElement<GetMessagesResponse> createGetMessagesResponse(GetMessagesResponse value) {
        return new JAXBElement<GetMessagesResponse>(_GetMessagesResponse_QNAME, GetMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ReportErrorResponse")
    public JAXBElement<ReportErrorResponse> createReportErrorResponse(ReportErrorResponse value) {
        return new JAXBElement<ReportErrorResponse>(_ReportErrorResponse_QNAME, ReportErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetMessages")
    public JAXBElement<GetMessages> createGetMessages(GetMessages value) {
        return new JAXBElement<GetMessages>(_GetMessages_QNAME, GetMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoteForDifficultyRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "VoteForDifficultyRating")
    public JAXBElement<VoteForDifficultyRating> createVoteForDifficultyRating(VoteForDifficultyRating value) {
        return new JAXBElement<VoteForDifficultyRating>(_VoteForDifficultyRating_QNAME, VoteForDifficultyRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetBigTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "resetBigTask")
    public JAXBElement<ResetBigTask> createResetBigTask(ResetBigTask value) {
        return new JAXBElement<ResetBigTask>(_ResetBigTask_QNAME, ResetBigTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnsolvedHomeTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUnsolvedHomeTasks")
    public JAXBElement<GetUnsolvedHomeTasks> createGetUnsolvedHomeTasks(GetUnsolvedHomeTasks value) {
        return new JAXBElement<GetUnsolvedHomeTasks>(_GetUnsolvedHomeTasks_QNAME, GetUnsolvedHomeTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnsolvedLessonTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUnsolvedLessonTasksResponse")
    public JAXBElement<GetUnsolvedLessonTasksResponse> createGetUnsolvedLessonTasksResponse(GetUnsolvedLessonTasksResponse value) {
        return new JAXBElement<GetUnsolvedLessonTasksResponse>(_GetUnsolvedLessonTasksResponse_QNAME, GetUnsolvedLessonTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "DeleteTopic")
    public JAXBElement<DeleteTopic> createDeleteTopic(DeleteTopic value) {
        return new JAXBElement<DeleteTopic>(_DeleteTopic_QNAME, DeleteTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TaskInfo")
    public JAXBElement<TaskInfo> createTaskInfo(TaskInfo value) {
        return new JAXBElement<TaskInfo>(_TaskInfo_QNAME, TaskInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SendError")
    public JAXBElement<SendError> createSendError(SendError value) {
        return new JAXBElement<SendError>(_SendError_QNAME, SendError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoteForDifficultyRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "VoteForDifficultyRatingResponse")
    public JAXBElement<VoteForDifficultyRatingResponse> createVoteForDifficultyRatingResponse(VoteForDifficultyRatingResponse value) {
        return new JAXBElement<VoteForDifficultyRatingResponse>(_VoteForDifficultyRatingResponse_QNAME, VoteForDifficultyRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserTaskArchiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetCurrentUserTaskArchiveResponse")
    public JAXBElement<GetCurrentUserTaskArchiveResponse> createGetCurrentUserTaskArchiveResponse(GetCurrentUserTaskArchiveResponse value) {
        return new JAXBElement<GetCurrentUserTaskArchiveResponse>(_GetCurrentUserTaskArchiveResponse_QNAME, GetCurrentUserTaskArchiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetMessageByIdResponse")
    public JAXBElement<GetMessageByIdResponse> createGetMessageByIdResponse(GetMessageByIdResponse value) {
        return new JAXBElement<GetMessageByIdResponse>(_GetMessageByIdResponse_QNAME, GetMessageByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AskForHelpWithTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AskForHelpWithTask")
    public JAXBElement<AskForHelpWithTask> createAskForHelpWithTask(AskForHelpWithTask value) {
        return new JAXBElement<AskForHelpWithTask>(_AskForHelpWithTask_QNAME, AskForHelpWithTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfByteArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfByteArray")
    public JAXBElement<ServiceResultOfByteArray> createServiceResultOfByteArray(ServiceResultOfByteArray value) {
        return new JAXBElement<ServiceResultOfByteArray>(_ServiceResultOfByteArray_QNAME, ServiceResultOfByteArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfUserInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfUserInfoList")
    public JAXBElement<ServiceResultOfUserInfoList> createServiceResultOfUserInfoList(ServiceResultOfUserInfoList value) {
        return new JAXBElement<ServiceResultOfUserInfoList>(_ServiceResultOfUserInfoList_QNAME, ServiceResultOfUserInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseTopicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "CloseTopicResponse")
    public JAXBElement<CloseTopicResponse> createCloseTopicResponse(CloseTopicResponse value) {
        return new JAXBElement<CloseTopicResponse>(_CloseTopicResponse_QNAME, CloseTopicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentToTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AddCommentToTaskResponse")
    public JAXBElement<AddCommentToTaskResponse> createAddCommentToTaskResponse(AddCommentToTaskResponse value) {
        return new JAXBElement<AddCommentToTaskResponse>(_AddCommentToTaskResponse_QNAME, AddCommentToTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserSubscriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserSubscriptions")
    public JAXBElement<GetUserSubscriptions> createGetUserSubscriptions(GetUserSubscriptions value) {
        return new JAXBElement<GetUserSubscriptions>(_GetUserSubscriptions_QNAME, GetUserSubscriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SendMessageResponse")
    public JAXBElement<SendMessageResponse> createSendMessageResponse(SendMessageResponse value) {
        return new JAXBElement<SendMessageResponse>(_SendMessageResponse_QNAME, SendMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaveTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "LeaveTopic")
    public JAXBElement<LeaveTopic> createLeaveTopic(LeaveTopic value) {
        return new JAXBElement<LeaveTopic>(_LeaveTopic_QNAME, LeaveTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfBoolean")
    public JAXBElement<ServiceResultOfBoolean> createServiceResultOfBoolean(ServiceResultOfBoolean value) {
        return new JAXBElement<ServiceResultOfBoolean>(_ServiceResultOfBoolean_QNAME, ServiceResultOfBoolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SignOutResponse")
    public JAXBElement<SignOutResponse> createSignOutResponse(SignOutResponse value) {
        return new JAXBElement<SignOutResponse>(_SignOutResponse_QNAME, SignOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ServiceResult")
    public JAXBElement<ServiceResult> createServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_ServiceResult_QNAME, ServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserSessionIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetCurrentUserSessionIdResponse")
    public JAXBElement<GetCurrentUserSessionIdResponse> createGetCurrentUserSessionIdResponse(GetCurrentUserSessionIdResponse value) {
        return new JAXBElement<GetCurrentUserSessionIdResponse>(_GetCurrentUserSessionIdResponse_QNAME, GetCurrentUserSessionIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfTaskInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfTaskInfoList")
    public JAXBElement<ServiceResultOfTaskInfoList> createServiceResultOfTaskInfoList(ServiceResultOfTaskInfoList value) {
        return new JAXBElement<ServiceResultOfTaskInfoList>(_ServiceResultOfTaskInfoList_QNAME, ServiceResultOfTaskInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfTopicListInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfTopicListInfo")
    public JAXBElement<ServiceResultOfTopicListInfo> createServiceResultOfTopicListInfo(ServiceResultOfTopicListInfo value) {
        return new JAXBElement<ServiceResultOfTopicListInfo>(_ServiceResultOfTopicListInfo_QNAME, ServiceResultOfTopicListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignInViaSecretKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SignInViaSecretKey")
    public JAXBElement<SignInViaSecretKey> createSignInViaSecretKey(SignInViaSecretKey value) {
        return new JAXBElement<SignInViaSecretKey>(_SignInViaSecretKey_QNAME, SignInViaSecretKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsRead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "MarkAsRead")
    public JAXBElement<MarkAsRead> createMarkAsRead(MarkAsRead value) {
        return new JAXBElement<MarkAsRead>(_MarkAsRead_QNAME, MarkAsRead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserTaskArchive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetCurrentUserTaskArchive")
    public JAXBElement<GetCurrentUserTaskArchive> createGetCurrentUserTaskArchive(GetCurrentUserTaskArchive value) {
        return new JAXBElement<GetCurrentUserTaskArchive>(_GetCurrentUserTaskArchive_QNAME, GetCurrentUserTaskArchive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfMessageInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfMessageInfo")
    public JAXBElement<ServiceResultOfMessageInfo> createServiceResultOfMessageInfo(ServiceResultOfMessageInfo value) {
        return new JAXBElement<ServiceResultOfMessageInfo>(_ServiceResultOfMessageInfo_QNAME, ServiceResultOfMessageInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SendMessage")
    public JAXBElement<SendMessage> createSendMessage(SendMessage value) {
        return new JAXBElement<SendMessage>(_SendMessage_QNAME, SendMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfSubscriptionInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfSubscriptionInfoList")
    public JAXBElement<ServiceResultOfSubscriptionInfoList> createServiceResultOfSubscriptionInfoList(ServiceResultOfSubscriptionInfoList value) {
        return new JAXBElement<ServiceResultOfSubscriptionInfoList>(_ServiceResultOfSubscriptionInfoList_QNAME, ServiceResultOfSubscriptionInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "MessageInfo")
    public JAXBElement<MessageInfo> createMessageInfo(MessageInfo value) {
        return new JAXBElement<MessageInfo>(_MessageInfo_QNAME, MessageInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskCompleatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TaskCompleatedResponse")
    public JAXBElement<TaskCompleatedResponse> createTaskCompleatedResponse(TaskCompleatedResponse value) {
        return new JAXBElement<TaskCompleatedResponse>(_TaskCompleatedResponse_QNAME, TaskCompleatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfClassDataInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfClassDataInfoList")
    public JAXBElement<ServiceResultOfClassDataInfoList> createServiceResultOfClassDataInfoList(ServiceResultOfClassDataInfoList value) {
        return new JAXBElement<ServiceResultOfClassDataInfoList>(_ServiceResultOfClassDataInfoList_QNAME, ServiceResultOfClassDataInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateForClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ValidateForClientResponse")
    public JAXBElement<ValidateForClientResponse> createValidateForClientResponse(ValidateForClientResponse value) {
        return new JAXBElement<ValidateForClientResponse>(_ValidateForClientResponse_QNAME, ValidateForClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SubscriptionInfo")
    public JAXBElement<SubscriptionInfo> createSubscriptionInfo(SubscriptionInfo value) {
        return new JAXBElement<SubscriptionInfo>(_SubscriptionInfo_QNAME, SubscriptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfTaskInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfTaskInfo")
    public JAXBElement<ServiceResultOfTaskInfo> createServiceResultOfTaskInfo(ServiceResultOfTaskInfo value) {
        return new JAXBElement<ServiceResultOfTaskInfo>(_ServiceResultOfTaskInfo_QNAME, ServiceResultOfTaskInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SignOut")
    public JAXBElement<SignOut> createSignOut(SignOut value) {
        return new JAXBElement<SignOut>(_SignOut_QNAME, SignOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfilesByIdList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserProfilesByIdList")
    public JAXBElement<GetUserProfilesByIdList> createGetUserProfilesByIdList(GetUserProfilesByIdList value) {
        return new JAXBElement<GetUserProfilesByIdList>(_GetUserProfilesByIdList_QNAME, GetUserProfilesByIdList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AskQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AskQuestion")
    public JAXBElement<AskQuestion> createAskQuestion(AskQuestion value) {
        return new JAXBElement<AskQuestion>(_AskQuestion_QNAME, AskQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateForClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ValidateForClient")
    public JAXBElement<ValidateForClient> createValidateForClient(ValidateForClient value) {
        return new JAXBElement<ValidateForClient>(_ValidateForClient_QNAME, ValidateForClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTopicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "DeleteTopicResponse")
    public JAXBElement<DeleteTopicResponse> createDeleteTopicResponse(DeleteTopicResponse value) {
        return new JAXBElement<DeleteTopicResponse>(_DeleteTopicResponse_QNAME, DeleteTopicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnsolvedLessonTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUnsolvedLessonTasks")
    public JAXBElement<GetUnsolvedLessonTasks> createGetUnsolvedLessonTasks(GetUnsolvedLessonTasks value) {
        return new JAXBElement<GetUnsolvedLessonTasks>(_GetUnsolvedLessonTasks_QNAME, GetUnsolvedLessonTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AskQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AskQuestionResponse")
    public JAXBElement<AskQuestionResponse> createAskQuestionResponse(AskQuestionResponse value) {
        return new JAXBElement<AskQuestionResponse>(_AskQuestionResponse_QNAME, AskQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideoUrlFromPlayerUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetVideoUrlFromPlayerUrl")
    public JAXBElement<GetVideoUrlFromPlayerUrl> createGetVideoUrlFromPlayerUrl(GetVideoUrlFromPlayerUrl value) {
        return new JAXBElement<GetVideoUrlFromPlayerUrl>(_GetVideoUrlFromPlayerUrl_QNAME, GetVideoUrlFromPlayerUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnsolvedHomeTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUnsolvedHomeTasksResponse")
    public JAXBElement<GetUnsolvedHomeTasksResponse> createGetUnsolvedHomeTasksResponse(GetUnsolvedHomeTasksResponse value) {
        return new JAXBElement<GetUnsolvedHomeTasksResponse>(_GetUnsolvedHomeTasksResponse_QNAME, GetUnsolvedHomeTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTaskHelpTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "CreateTaskHelpTopic")
    public JAXBElement<CreateTaskHelpTopic> createCreateTaskHelpTopic(CreateTaskHelpTopic value) {
        return new JAXBElement<CreateTaskHelpTopic>(_CreateTaskHelpTopic_QNAME, CreateTaskHelpTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTaskHelpTopicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "CreateTaskHelpTopicResponse")
    public JAXBElement<CreateTaskHelpTopicResponse> createCreateTaskHelpTopicResponse(CreateTaskHelpTopicResponse value) {
        return new JAXBElement<CreateTaskHelpTopicResponse>(_CreateTaskHelpTopicResponse_QNAME, CreateTaskHelpTopicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SendErrorResponse")
    public JAXBElement<SendErrorResponse> createSendErrorResponse(SendErrorResponse value) {
        return new JAXBElement<SendErrorResponse>(_SendErrorResponse_QNAME, SendErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfUserInfo")
    public JAXBElement<ServiceResultOfUserInfo> createServiceResultOfUserInfo(ServiceResultOfUserInfo value) {
        return new JAXBElement<ServiceResultOfUserInfo>(_ServiceResultOfUserInfo_QNAME, ServiceResultOfUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetCurrentUserProfileResponse")
    public JAXBElement<GetCurrentUserProfileResponse> createGetCurrentUserProfileResponse(GetCurrentUserProfileResponse value) {
        return new JAXBElement<GetCurrentUserProfileResponse>(_GetCurrentUserProfileResponse_QNAME, GetCurrentUserProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideoUrlFromPlayerUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetVideoUrlFromPlayerUrlResponse")
    public JAXBElement<GetVideoUrlFromPlayerUrlResponse> createGetVideoUrlFromPlayerUrlResponse(GetVideoUrlFromPlayerUrlResponse value) {
        return new JAXBElement<GetVideoUrlFromPlayerUrlResponse>(_GetVideoUrlFromPlayerUrlResponse_QNAME, GetVideoUrlFromPlayerUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfString")
    public JAXBElement<ServiceResultOfString> createServiceResultOfString(ServiceResultOfString value) {
        return new JAXBElement<ServiceResultOfString>(_ServiceResultOfString_QNAME, ServiceResultOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignUpAsReadOnlyUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SignUpAsReadOnlyUserResponse")
    public JAXBElement<SignUpAsReadOnlyUserResponse> createSignUpAsReadOnlyUserResponse(SignUpAsReadOnlyUserResponse value) {
        return new JAXBElement<SignUpAsReadOnlyUserResponse>(_SignUpAsReadOnlyUserResponse_QNAME, SignUpAsReadOnlyUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnreadedMessagesCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUnreadedMessagesCountResponse")
    public JAXBElement<GetUnreadedMessagesCountResponse> createGetUnreadedMessagesCountResponse(GetUnreadedMessagesCountResponse value) {
        return new JAXBElement<GetUnreadedMessagesCountResponse>(_GetUnreadedMessagesCountResponse_QNAME, GetUnreadedMessagesCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnreadedMessagesCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUnreadedMessagesCount")
    public JAXBElement<GetUnreadedMessagesCount> createGetUnreadedMessagesCount(GetUnreadedMessagesCount value) {
        return new JAXBElement<GetUnreadedMessagesCount>(_GetUnreadedMessagesCount_QNAME, GetUnreadedMessagesCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LessonComplete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "LessonComplete")
    public JAXBElement<LessonComplete> createLessonComplete(LessonComplete value) {
        return new JAXBElement<LessonComplete>(_LessonComplete_QNAME, LessonComplete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateForPlugin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ValidateForPlugin")
    public JAXBElement<ValidateForPlugin> createValidateForPlugin(ValidateForPlugin value) {
        return new JAXBElement<ValidateForPlugin>(_ValidateForPlugin_QNAME, ValidateForPlugin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ReportError")
    public JAXBElement<ReportError> createReportError(ReportError value) {
        return new JAXBElement<ReportError>(_ReportError_QNAME, ReportError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskCompleated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TaskCompleated")
    public JAXBElement<TaskCompleated> createTaskCompleated(TaskCompleated value) {
        return new JAXBElement<TaskCompleated>(_TaskCompleated_QNAME, TaskCompleated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskTemplateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetTaskTemplateResponse")
    public JAXBElement<GetTaskTemplateResponse> createGetTaskTemplateResponse(GetTaskTemplateResponse value) {
        return new JAXBElement<GetTaskTemplateResponse>(_GetTaskTemplateResponse_QNAME, GetTaskTemplateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTopicsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserTopicsResponse")
    public JAXBElement<GetUserTopicsResponse> createGetUserTopicsResponse(GetUserTopicsResponse value) {
        return new JAXBElement<GetUserTopicsResponse>(_GetUserTopicsResponse_QNAME, GetUserTopicsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AskForHelpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AskForHelpResponse")
    public JAXBElement<AskForHelpResponse> createAskForHelpResponse(AskForHelpResponse value) {
        return new JAXBElement<AskForHelpResponse>(_AskForHelpResponse_QNAME, AskForHelpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetMessageById")
    public JAXBElement<GetMessageById> createGetMessageById(GetMessageById value) {
        return new JAXBElement<GetMessageById>(_GetMessageById_QNAME, GetMessageById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTopicCommentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserTopicCommentsResponse")
    public JAXBElement<GetUserTopicCommentsResponse> createGetUserTopicCommentsResponse(GetUserTopicCommentsResponse value) {
        return new JAXBElement<GetUserTopicCommentsResponse>(_GetUserTopicCommentsResponse_QNAME, GetUserTopicCommentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserSubscriptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserSubscriptionsResponse")
    public JAXBElement<GetUserSubscriptionsResponse> createGetUserSubscriptionsResponse(GetUserSubscriptionsResponse value) {
        return new JAXBElement<GetUserSubscriptionsResponse>(_GetUserSubscriptionsResponse_QNAME, GetUserSubscriptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassDataInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ClassDataInfo")
    public JAXBElement<ClassDataInfo> createClassDataInfo(ClassDataInfo value) {
        return new JAXBElement<ClassDataInfo>(_ClassDataInfo_QNAME, ClassDataInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskInProgress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TaskInProgress")
    public JAXBElement<TaskInProgress> createTaskInProgress(TaskInProgress value) {
        return new JAXBElement<TaskInProgress>(_TaskInProgress_QNAME, TaskInProgress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ValidateInfo")
    public JAXBElement<ValidateInfo> createValidateInfo(ValidateInfo value) {
        return new JAXBElement<ValidateInfo>(_ValidateInfo_QNAME, ValidateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicCommentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TopicCommentInfo")
    public JAXBElement<TopicCommentInfo> createTopicCommentInfo(TopicCommentInfo value) {
        return new JAXBElement<TopicCommentInfo>(_TopicCommentInfo_QNAME, TopicCommentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfTopicInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfTopicInfo")
    public JAXBElement<ServiceResultOfTopicInfo> createServiceResultOfTopicInfo(ServiceResultOfTopicInfo value) {
        return new JAXBElement<ServiceResultOfTopicInfo>(_ServiceResultOfTopicInfo_QNAME, ServiceResultOfTopicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignUpAsReadOnlyUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SignUpAsReadOnlyUser")
    public JAXBElement<SignUpAsReadOnlyUser> createSignUpAsReadOnlyUser(SignUpAsReadOnlyUser value) {
        return new JAXBElement<SignUpAsReadOnlyUser>(_SignUpAsReadOnlyUser_QNAME, SignUpAsReadOnlyUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfTopicCommentListInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfTopicCommentListInfo")
    public JAXBElement<ServiceResultOfTopicCommentListInfo> createServiceResultOfTopicCommentListInfo(ServiceResultOfTopicCommentListInfo value) {
        return new JAXBElement<ServiceResultOfTopicCommentListInfo>(_ServiceResultOfTopicCommentListInfo_QNAME, ServiceResultOfTopicCommentListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TopicInfo")
    public JAXBElement<TopicInfo> createTopicInfo(TopicInfo value) {
        return new JAXBElement<TopicInfo>(_TopicInfo_QNAME, TopicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoteForInterestRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "VoteForInterestRating")
    public JAXBElement<VoteForInterestRating> createVoteForInterestRating(VoteForInterestRating value) {
        return new JAXBElement<VoteForInterestRating>(_VoteForInterestRating_QNAME, VoteForInterestRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AskForHelpWithTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AskForHelpWithTaskResponse")
    public JAXBElement<AskForHelpWithTaskResponse> createAskForHelpWithTaskResponse(AskForHelpWithTaskResponse value) {
        return new JAXBElement<AskForHelpWithTaskResponse>(_AskForHelpWithTaskResponse_QNAME, AskForHelpWithTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTopics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserTopics")
    public JAXBElement<GetUserTopics> createGetUserTopics(GetUserTopics value) {
        return new JAXBElement<GetUserTopics>(_GetUserTopics_QNAME, GetUserTopics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetCurrentUserProfile")
    public JAXBElement<GetCurrentUserProfile> createGetCurrentUserProfile(GetCurrentUserProfile value) {
        return new JAXBElement<GetCurrentUserProfile>(_GetCurrentUserProfile_QNAME, GetCurrentUserProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaveTopicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "LeaveTopicResponse")
    public JAXBElement<LeaveTopicResponse> createLeaveTopicResponse(LeaveTopicResponse value) {
        return new JAXBElement<LeaveTopicResponse>(_LeaveTopicResponse_QNAME, LeaveTopicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserSessionId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetCurrentUserSessionId")
    public JAXBElement<GetCurrentUserSessionId> createGetCurrentUserSessionId(GetCurrentUserSessionId value) {
        return new JAXBElement<GetCurrentUserSessionId>(_GetCurrentUserSessionId_QNAME, GetCurrentUserSessionId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignInViaSecretKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "SignInViaSecretKeyResponse")
    public JAXBElement<SignInViaSecretKeyResponse> createSignInViaSecretKeyResponse(SignInViaSecretKeyResponse value) {
        return new JAXBElement<SignInViaSecretKeyResponse>(_SignInViaSecretKeyResponse_QNAME, SignInViaSecretKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfMessageInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfMessageInfoList")
    public JAXBElement<ServiceResultOfMessageInfoList> createServiceResultOfMessageInfoList(ServiceResultOfMessageInfoList value) {
        return new JAXBElement<ServiceResultOfMessageInfoList>(_ServiceResultOfMessageInfoList_QNAME, ServiceResultOfMessageInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfilesByIdListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserProfilesByIdListResponse")
    public JAXBElement<GetUserProfilesByIdListResponse> createGetUserProfilesByIdListResponse(GetUserProfilesByIdListResponse value) {
        return new JAXBElement<GetUserProfilesByIdListResponse>(_GetUserProfilesByIdListResponse_QNAME, GetUserProfilesByIdListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetBigTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "resetBigTaskResponse")
    public JAXBElement<ResetBigTaskResponse> createResetBigTaskResponse(ResetBigTaskResponse value) {
        return new JAXBElement<ResetBigTaskResponse>(_ResetBigTaskResponse_QNAME, ResetBigTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LessonCompleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "LessonCompleteResponse")
    public JAXBElement<LessonCompleteResponse> createLessonCompleteResponse(LessonCompleteResponse value) {
        return new JAXBElement<LessonCompleteResponse>(_LessonCompleteResponse_QNAME, LessonCompleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "DeleteCommentResponse")
    public JAXBElement<DeleteCommentResponse> createDeleteCommentResponse(DeleteCommentResponse value) {
        return new JAXBElement<DeleteCommentResponse>(_DeleteCommentResponse_QNAME, DeleteCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicListInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TopicListInfo")
    public JAXBElement<TopicListInfo> createTopicListInfo(TopicListInfo value) {
        return new JAXBElement<TopicListInfo>(_TopicListInfo_QNAME, TopicListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskInProgressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TaskInProgressResponse")
    public JAXBElement<TaskInProgressResponse> createTaskInProgressResponse(TaskInProgressResponse value) {
        return new JAXBElement<TaskInProgressResponse>(_TaskInProgressResponse_QNAME, TaskInProgressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStatisticInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "UserStatisticInfo")
    public JAXBElement<UserStatisticInfo> createUserStatisticInfo(UserStatisticInfo value) {
        return new JAXBElement<UserStatisticInfo>(_UserStatisticInfo_QNAME, UserStatisticInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfTopicCommentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfTopicCommentInfo")
    public JAXBElement<ServiceResultOfTopicCommentInfo> createServiceResultOfTopicCommentInfo(ServiceResultOfTopicCommentInfo value) {
        return new JAXBElement<ServiceResultOfTopicCommentInfo>(_ServiceResultOfTopicCommentInfo_QNAME, ServiceResultOfTopicCommentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoteForInterestRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "VoteForInterestRatingResponse")
    public JAXBElement<VoteForInterestRatingResponse> createVoteForInterestRatingResponse(VoteForInterestRatingResponse value) {
        return new JAXBElement<VoteForInterestRatingResponse>(_VoteForInterestRatingResponse_QNAME, VoteForInterestRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentToTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AddCommentToTopic")
    public JAXBElement<AddCommentToTopic> createAddCommentToTopic(AddCommentToTopic value) {
        return new JAXBElement<AddCommentToTopic>(_AddCommentToTopic_QNAME, AddCommentToTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "UserInfo")
    public JAXBElement<UserInfo> createUserInfo(UserInfo value) {
        return new JAXBElement<UserInfo>(_UserInfo_QNAME, UserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "MarkAsReadResponse")
    public JAXBElement<MarkAsReadResponse> createMarkAsReadResponse(MarkAsReadResponse value) {
        return new JAXBElement<MarkAsReadResponse>(_MarkAsReadResponse_QNAME, MarkAsReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTaskSolutionByTaskKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserTaskSolutionByTaskKey")
    public JAXBElement<GetUserTaskSolutionByTaskKey> createGetUserTaskSolutionByTaskKey(GetUserTaskSolutionByTaskKey value) {
        return new JAXBElement<GetUserTaskSolutionByTaskKey>(_GetUserTaskSolutionByTaskKey_QNAME, GetUserTaskSolutionByTaskKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateForPluginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ValidateForPluginResponse")
    public JAXBElement<ValidateForPluginResponse> createValidateForPluginResponse(ValidateForPluginResponse value) {
        return new JAXBElement<ValidateForPluginResponse>(_ValidateForPluginResponse_QNAME, ValidateForPluginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMoneyToGoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ConvertMoneyToGoldResponse")
    public JAXBElement<ConvertMoneyToGoldResponse> createConvertMoneyToGoldResponse(ConvertMoneyToGoldResponse value) {
        return new JAXBElement<ConvertMoneyToGoldResponse>(_ConvertMoneyToGoldResponse_QNAME, ConvertMoneyToGoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfValidationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfValidationInfo")
    public JAXBElement<ServiceResultOfValidationInfo> createServiceResultOfValidationInfo(ServiceResultOfValidationInfo value) {
        return new JAXBElement<ServiceResultOfValidationInfo>(_ServiceResultOfValidationInfo_QNAME, ServiceResultOfValidationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentToTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AddCommentToTask")
    public JAXBElement<AddCommentToTask> createAddCommentToTask(AddCommentToTask value) {
        return new JAXBElement<AddCommentToTask>(_AddCommentToTask_QNAME, AddCommentToTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTopicComments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetUserTopicComments")
    public JAXBElement<GetUserTopicComments> createGetUserTopicComments(GetUserTopicComments value) {
        return new JAXBElement<GetUserTopicComments>(_GetUserTopicComments_QNAME, GetUserTopicComments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicCommentListInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "TopicCommentListInfo")
    public JAXBElement<TopicCommentListInfo> createTopicCommentListInfo(TopicCommentListInfo value) {
        return new JAXBElement<TopicCommentListInfo>(_TopicCommentListInfo_QNAME, TopicCommentListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMoneyToGold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "ConvertMoneyToGold")
    public JAXBElement<ConvertMoneyToGold> createConvertMoneyToGold(ConvertMoneyToGold value) {
        return new JAXBElement<ConvertMoneyToGold>(_ConvertMoneyToGold_QNAME, ConvertMoneyToGold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AskForHelp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AskForHelp")
    public JAXBElement<AskForHelp> createAskForHelp(AskForHelp value) {
        return new JAXBElement<AskForHelp>(_AskForHelp_QNAME, AskForHelp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "GetTaskTemplate")
    public JAXBElement<GetTaskTemplate> createGetTaskTemplate(GetTaskTemplate value) {
        return new JAXBElement<GetTaskTemplate>(_GetTaskTemplate_QNAME, GetTaskTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentToTopicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "AddCommentToTopicResponse")
    public JAXBElement<AddCommentToTopicResponse> createAddCommentToTopicResponse(AddCommentToTopicResponse value) {
        return new JAXBElement<AddCommentToTopicResponse>(_AddCommentToTopicResponse_QNAME, AddCommentToTopicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api1.controller.diana.javarush.com/", name = "serviceResultOfInteger")
    public JAXBElement<ServiceResultOfInteger> createServiceResultOfInteger(ServiceResultOfInteger value) {
        return new JAXBElement<ServiceResultOfInteger>(_ServiceResultOfInteger_QNAME, ServiceResultOfInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfo.Statistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Statistics", scope = UserInfo.class)
    public JAXBElement<UserInfo.Statistics> createUserInfoStatistics(UserInfo.Statistics value) {
        return new JAXBElement<UserInfo.Statistics>(_UserInfoStatistics_QNAME, UserInfo.Statistics.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfo.Taskts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Taskts", scope = UserInfo.class)
    public JAXBElement<UserInfo.Taskts> createUserInfoTaskts(UserInfo.Taskts value) {
        return new JAXBElement<UserInfo.Taskts>(_UserInfoTaskts_QNAME, UserInfo.Taskts.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicListInfo.List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "List", scope = TopicListInfo.class)
    public JAXBElement<TopicListInfo.List> createTopicListInfoList(TopicListInfo.List value) {
        return new JAXBElement<TopicListInfo.List>(_TopicListInfoList_QNAME, TopicListInfo.List.class, TopicListInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskInfo.Helps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Helps", scope = TaskInfo.class)
    public JAXBElement<TaskInfo.Helps> createTaskInfoHelps(TaskInfo.Helps value) {
        return new JAXBElement<TaskInfo.Helps>(_TaskInfoHelps_QNAME, TaskInfo.Helps.class, TaskInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicCommentListInfo.List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "List", scope = TopicCommentListInfo.class)
    public JAXBElement<TopicCommentListInfo.List> createTopicCommentListInfoList(TopicCommentListInfo.List value) {
        return new JAXBElement<TopicCommentListInfo.List>(_TopicListInfoList_QNAME, TopicCommentListInfo.List.class, TopicCommentListInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfClassDataInfoList.Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result", scope = ServiceResultOfClassDataInfoList.class)
    public JAXBElement<ServiceResultOfClassDataInfoList.Result> createServiceResultOfClassDataInfoListResult(ServiceResultOfClassDataInfoList.Result value) {
        return new JAXBElement<ServiceResultOfClassDataInfoList.Result>(_ServiceResultOfByteArrayResult_QNAME, ServiceResultOfClassDataInfoList.Result.class, ServiceResultOfClassDataInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfSubscriptionInfoList.Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result", scope = ServiceResultOfSubscriptionInfoList.class)
    public JAXBElement<ServiceResultOfSubscriptionInfoList.Result> createServiceResultOfSubscriptionInfoListResult(ServiceResultOfSubscriptionInfoList.Result value) {
        return new JAXBElement<ServiceResultOfSubscriptionInfoList.Result>(_ServiceResultOfByteArrayResult_QNAME, ServiceResultOfSubscriptionInfoList.Result.class, ServiceResultOfSubscriptionInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfUserInfoList.Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result", scope = ServiceResultOfUserInfoList.class)
    public JAXBElement<ServiceResultOfUserInfoList.Result> createServiceResultOfUserInfoListResult(ServiceResultOfUserInfoList.Result value) {
        return new JAXBElement<ServiceResultOfUserInfoList.Result>(_ServiceResultOfByteArrayResult_QNAME, ServiceResultOfUserInfoList.Result.class, ServiceResultOfUserInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfTaskInfoList.Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result", scope = ServiceResultOfTaskInfoList.class)
    public JAXBElement<ServiceResultOfTaskInfoList.Result> createServiceResultOfTaskInfoListResult(ServiceResultOfTaskInfoList.Result value) {
        return new JAXBElement<ServiceResultOfTaskInfoList.Result>(_ServiceResultOfByteArrayResult_QNAME, ServiceResultOfTaskInfoList.Result.class, ServiceResultOfTaskInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResultOfMessageInfoList.Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result", scope = ServiceResultOfMessageInfoList.class)
    public JAXBElement<ServiceResultOfMessageInfoList.Result> createServiceResultOfMessageInfoListResult(ServiceResultOfMessageInfoList.Result value) {
        return new JAXBElement<ServiceResultOfMessageInfoList.Result>(_ServiceResultOfByteArrayResult_QNAME, ServiceResultOfMessageInfoList.Result.class, ServiceResultOfMessageInfoList.class, value);
    }

}
