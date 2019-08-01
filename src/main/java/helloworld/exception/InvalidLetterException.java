package helloworld.exception;

public class InvalidLetterException extends Exception
{
    private static final long serialVersionUID = 1L;

    public InvalidLetterException(String msg)
    {
        super(msg);
    }
}