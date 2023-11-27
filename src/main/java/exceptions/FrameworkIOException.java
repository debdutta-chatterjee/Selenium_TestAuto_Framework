package exceptions;

public class FrameworkIOException extends FrameworkException
{
    public FrameworkIOException(String message) {
        super(message);
    }

    public FrameworkIOException(String message, Throwable exception_reason) {
        super(message, exception_reason);
    }
}
