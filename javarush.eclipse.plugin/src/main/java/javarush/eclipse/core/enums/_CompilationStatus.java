package javarush.eclipse.core.enums;

import static javarush.eclipse.Messages.CompilationStatus_BraceExpectedError;
import static javarush.eclipse.Messages.CompilationStatus_NotAStatementError;
import static javarush.eclipse.Messages.CompilationStatus_ParenthesisExpectedError;
import static javarush.eclipse.Messages.CompilationStatus_QuoteExpectedError;
import static javarush.eclipse.Messages.CompilationStatus_SaveError;
import static javarush.eclipse.Messages.CompilationStatus_SemicolonExpectedError;
import static javarush.eclipse.Messages.CompilationStatus_Success;
import static javarush.eclipse.Messages.CompilationStatus_UnknownError;

import javarush.eclipse.ws.client.CompilationStatus;

public enum _CompilationStatus {
    SUCCESS(CompilationStatus_Success),
    UNKNOWN_ERROR(CompilationStatus_UnknownError),
    SAVE_ERROR(CompilationStatus_SaveError),
    QUOTE_EXPECTED_ERROR(CompilationStatus_QuoteExpectedError),
    SEMICOLON_EXPECTED_ERROR(CompilationStatus_SemicolonExpectedError),
    BRACE_EXPECTED_ERROR(CompilationStatus_BraceExpectedError),
    PARENTHESIS_EXPECTED_ERROR(CompilationStatus_ParenthesisExpectedError),
    NOT_A_STATEMENT_ERROR(CompilationStatus_NotAStatementError);

    private String description;

    private _CompilationStatus(String description) {
        this.description = description;
    }

    public _CompilationStatus fromValue(CompilationStatus s) {
        for (_CompilationStatus _s : values())
            if (_s.name().equals(s.name()))
                return _s;

        throw new IllegalArgumentException(s.name());
    }

    public String getDescription() {
        return description;
    }

    public enum AllowList {
        LIST(CompilationStatus.SUCCESS, CompilationStatus.UNKNOWN_ERROR,
                CompilationStatus.SAVE_ERROR);

        CompilationStatus[] list;

        private AllowList(CompilationStatus... list) {
            this.list = list;
        }

        public boolean isAllow(CompilationStatus compilationStatus) {
            for (CompilationStatus status : list)
                if (status == compilationStatus)
                    return true;
            return false;
        }
    }
}
