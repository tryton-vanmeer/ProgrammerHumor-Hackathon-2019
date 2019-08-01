package helloworld.exception;

public class InvalidCaseException extends Exception
{
    private static final long serialVersionUID = 1L;

    public InvalidCaseException(char letterIn)
    {
        super(letterIn + " is an invalid case.");
    }
}