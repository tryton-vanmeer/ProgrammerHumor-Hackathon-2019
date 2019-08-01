package helloworld.letter;

import helloworld.exception.InvalidCaseException;

/**
 * A lowercase letter.
 */
public class LetterLowerCase extends Letter
{
    public LetterLowerCase(char letterIn) throws InvalidCaseException
    {
        super(letterIn);

        // Throw InvalidCaseException if letterIn is uppercase.
        if (Character.isUpperCase(letterIn))
        {
            throw new InvalidCaseException(letterIn);
        }
    }
}