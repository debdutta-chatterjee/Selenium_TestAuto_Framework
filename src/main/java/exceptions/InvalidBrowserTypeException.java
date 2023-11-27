package exceptions;

public class InvalidBrowserTypeException  extends FrameworkException{
    public InvalidBrowserTypeException(String message) {
        super(message);
    }

    public InvalidBrowserTypeException(String message, Throwable exception_reason) {
        super(message, exception_reason);
    }
}
