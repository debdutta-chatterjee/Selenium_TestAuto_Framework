package exceptions;

public class BrowserInvocationFailed extends FrameworkException{
    public BrowserInvocationFailed(String message) {
        super(message);
    }

    public BrowserInvocationFailed(String message, Throwable exception_reason) {
        super(message, exception_reason);
    }
}
