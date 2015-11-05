package javarush.eclipse.core.enums;

import static javarush.eclipse.Messages.ServiceResultErrorCode_AccessDenied;
import static javarush.eclipse.Messages.ServiceResultErrorCode_ApiVersionMismatch;
import static javarush.eclipse.Messages.ServiceResultErrorCode_AuthorizationError;
import static javarush.eclipse.Messages.ServiceResultErrorCode_RequestTimeout;
import static javarush.eclipse.Messages.ServiceResultErrorCode_ServerUnavailable;
import static javarush.eclipse.Messages.ServiceResultErrorCode_Success;
import static javarush.eclipse.Messages.ServiceResultErrorCode_TaskSolved;
import static javarush.eclipse.Messages.ServiceResultErrorCode_TaskUnavailable;
import static javarush.eclipse.Messages.ServiceResultErrorCode_UnknownError;
import static javarush.eclipse.Messages.ServiceResultErrorCode_UnknownTask;
import static javarush.eclipse.Messages.ServiceResultErrorCode_UnknownUser;

import javarush.eclipse.ws.client.ServiceResultErrorCode;

public enum _ServiceResultErrorCode {
    SUCCESS(ServiceResultErrorCode_Success),
    AUTHORIZATION_ERROR(ServiceResultErrorCode_AuthorizationError),
    REQUEST_TIMEOUT(ServiceResultErrorCode_RequestTimeout),
    SERVER_UNAVAILABLE(ServiceResultErrorCode_ServerUnavailable),
    API_VERSION_MISMATCH(ServiceResultErrorCode_ApiVersionMismatch),
    UNKNOWN_USER(ServiceResultErrorCode_UnknownUser),
    UNKNOWN_TASK(ServiceResultErrorCode_UnknownTask),
    TASK_SOLVED(ServiceResultErrorCode_TaskSolved),
    TASK_UNAVAILABLE(ServiceResultErrorCode_TaskUnavailable),
    ACCESS_DENIED(ServiceResultErrorCode_AccessDenied),
    UNKNOWN_ERROR(ServiceResultErrorCode_UnknownError);

    private String description;

    private _ServiceResultErrorCode(String description) {
        this.description = description;
    }

    public _ServiceResultErrorCode fromValue(ServiceResultErrorCode s) {
        for (_ServiceResultErrorCode _s : values())
            if (_s.name().equals(s.name()))
                return _s;

        throw new IllegalArgumentException(s.name());
    }

    public String getDescription() {
        return description;
    }
}
