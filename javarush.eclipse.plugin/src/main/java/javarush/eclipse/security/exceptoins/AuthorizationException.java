package javarush.eclipse.security.exceptoins;

import javarush.eclipse.exceptions.BusinessException;

public class AuthorizationException extends BusinessException {
    private static final long serialVersionUID = 1L;

    private Action action = Action.UNKNOWN;
    private String msg;

    public AuthorizationException() {
    }

    public AuthorizationException(String message) {
        super(message);
        msg = message;
    }

    public AuthorizationException(Action action, String message) {
        super(action + ": " + message);
        this.action = action;
        msg = message;
    }

    public AuthorizationException(Throwable cause) {
        super(cause);
    }

    public AuthorizationException(String message, Throwable cause) {
        super(message, cause);
        msg = message;
    }

    public Action getAction() {
        return action;
    }

    public String getMsg() {
        return msg;
    }

    public enum Action {
        LOGIN, LOGOUT, UNKNOWN
    }
}
