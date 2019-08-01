package helloworld.letter;

import helloworld.exception.InvalidCaseException;

/**
 * An uppercase letter.
 */
public class LetterUpperCase extends Letter
{
    public LetterUpperCase(char letterIn) throws InvalidCaseException
    {
        super(letterIn);

        // Throw InvalidCaseException if letterIn is lowercase.
        if (Character.isLowerCase(letterIn))
        {
            throw new InvalidCaseException(letterIn);
        }
    }
}