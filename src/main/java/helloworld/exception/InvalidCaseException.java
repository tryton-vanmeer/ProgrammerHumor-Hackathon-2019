package helloworld.exception;

/**
 * Exception used if a letter is to be created with the wrong case.
 */
public class InvalidCaseException extends Exception
{
    private static final long serialVersionUID = 1L;

    public InvalidCaseException(char letterIn)
    {
        super(letterIn + " is an invalid case.");
    }
}