package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.exception.InvalidCaseException;
import helloworld.letter.Letter;
import helloworld.letter.LetterLowerCase;
import helloworld.letter.LetterUpperCase;

public class LetterTest
{
    @Test
    public void testLetterFactoryUpperCaseA() throws InvalidCaseException
    {
        Letter letter = new LetterUpperCase('A');
        assertEquals(letter.getLetter(), 'A');
    }

    @Test
    public void testLetterFactoryLowerCaseZ() throws InvalidCaseException
    {
        Letter letter = new LetterLowerCase('z');
        assertEquals(letter.getLetter(), 'z');
    }
}