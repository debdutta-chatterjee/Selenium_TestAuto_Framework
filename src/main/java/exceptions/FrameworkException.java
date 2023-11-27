package exceptions;

public class FrameworkException extends RuntimeException
{
    public FrameworkException(String message)
    {
        super(message);
    }

    public FrameworkException(String message, Throwable exception_reason)
    {
        super(message,exception_reason);
    }

}
