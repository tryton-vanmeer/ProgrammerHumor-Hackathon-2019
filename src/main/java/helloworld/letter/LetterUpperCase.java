package helloworld.letter;

import helloworld.exception.InvalidCaseException;

public class LetterUpperCase extends Letter
{
    public LetterUpperCase(char letterIn) throws InvalidCaseException
    {
        super(letterIn);

        if (Character.isLowerCase(letterIn))
        {
            throw new InvalidCaseException(letterIn);
        }
    }
}