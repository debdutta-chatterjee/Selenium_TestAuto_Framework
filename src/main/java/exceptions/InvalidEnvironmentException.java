package exceptions;

public class InvalidEnvironmentException  extends FrameworkException{
    public InvalidEnvironmentException(String message) {
        super(message);
    }

    public InvalidEnvironmentException(String message, Throwable exception_reason) {
        super(message, exception_reason);
    }
}
