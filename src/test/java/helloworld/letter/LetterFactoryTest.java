package helloworld.letter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.exception.InvalidLetterException;

public class LetterFactoryTest
{
    @Test
    public void testLetterFactoryUpperCaseA()
    {
        try
        {
            Letter letter = LetterFactory.getLetter('A');
            assertEquals(letter.getLetter(), 'A');
        } catch (InvalidLetterException e)
        {
			e.printStackTrace();
		}
    }

    @Test
    public void testLetterFactoryLowerCaseZ()
    {
        try
        {
            Letter letter = LetterFactory.getLetter('z');
            assertEquals(letter.getLetter(), 'z');
        } catch (InvalidLetterException e)
        {
			e.printStackTrace();
		}
    }
}