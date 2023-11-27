package exceptions;

public class InvalidFilePathException extends FrameworkException{
    public InvalidFilePathException(String message) {
        super(message);
    }

    public InvalidFilePathException(String message, Throwable exception_reason) {
        super(message, exception_reason);
    }
}
