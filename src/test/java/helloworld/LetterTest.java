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

    @Test
    public void testLetterToBooleanT() throws InvalidCaseException
    {
        Letter letter = new LetterUpperCase('T');
        assertEquals(letter.toBoolean(), true);
    }

    @Test
    public void testLetterToBooleanF() throws InvalidCaseException
    {
        Letter letter = new LetterLowerCase('f');
        assertEquals(letter.toBoolean(), false);
    }

    @Test
    public void testLetterToBooleanOther() throws InvalidCaseException
    {
        Letter letter = new LetterLowerCase('e');
        assertEquals(letter.toBoolean(), false);
    }

    @Test
    public void testLetterEquality() throws InvalidCaseException
    {
        Letter letter = new LetterLowerCase('a');
        Letter letter2 = new LetterLowerCase('a');

        boolean result = letter.equals(letter2);

        assertEquals(result, true);
    }

    @Test
    public void testLetterEqualityDifferentLetter() throws InvalidCaseException
    {
        Letter letter = new LetterLowerCase('a');
        Letter letter2 = new LetterUpperCase('Z');

        boolean result = letter.equals(letter2);

        assertEquals(result, false);
    }

    @Test
    public void testLetterEqualityNull() throws InvalidCaseException
    {
        Letter letter = new LetterLowerCase('a');
        Letter letter2 = null;

        boolean result = letter.equals(letter2);

        assertEquals(result, false);
    }
}