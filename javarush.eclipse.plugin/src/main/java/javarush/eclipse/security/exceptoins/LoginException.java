package javarush.eclipse.security.exceptoins;

import javarush.eclipse.exceptions.BusinessException;

public class LoginException extends BusinessException {
    private static final long serialVersionUID = 1L;

    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(Throwable cause) {
        super(cause);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }

}
