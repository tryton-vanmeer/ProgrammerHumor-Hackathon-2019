package helloworld.letter;

import helloworld.exception.InvalidCaseException;

public class LetterLowerCase extends Letter
{
    public LetterLowerCase(char letterIn) throws InvalidCaseException
    {
        super(letterIn);

        if (Character.isUpperCase(letterIn))
        {
            throw new InvalidCaseException(letterIn);
        }
    }
}