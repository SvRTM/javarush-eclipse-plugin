package javarush.eclipse.core.enums;

import static javarush.eclipse.Messages.ValidationStatus_Invalid;
import static javarush.eclipse.Messages.ValidationStatus_InvalidButPartialSuccess;
import static javarush.eclipse.Messages.ValidationStatus_SecurityError;
import static javarush.eclipse.Messages.ValidationStatus_Success;
import static javarush.eclipse.Messages.ValidationStatus_TaskSolvedError;
import static javarush.eclipse.Messages.ValidationStatus_TimeoutError;
import static javarush.eclipse.Messages.ValidationStatus_UnknownError;

import javarush.eclipse.ws.client.ValidationStatus;

public enum _ValidationStatus {
    SUCCESS(ValidationStatus_Success),
    UNKNOWN_ERROR(ValidationStatus_UnknownError),
    INVALID(ValidationStatus_Invalid),
    INVALID_BUT_PARTIAL_SUCCESS(ValidationStatus_InvalidButPartialSuccess),
    TIMEOUT_ERROR(ValidationStatus_TimeoutError),
    SECURITY_ERROR(ValidationStatus_SecurityError),
    TASK_SOLVED_ERROR(ValidationStatus_TaskSolvedError),
    TASK_UNAVAILABLE_ERROR(ValidationStatus_UnknownError);

    private String description;

    private _ValidationStatus(String description) {
        this.description = description;
    }

    public _ValidationStatus fromValue(ValidationStatus s) {
        for (_ValidationStatus _s : values())
            if (_s.name().equals(s.name()))
                return _s;

        throw new IllegalArgumentException(s.name());
    }

    public String getDescription() {
        return description;
    }

}
