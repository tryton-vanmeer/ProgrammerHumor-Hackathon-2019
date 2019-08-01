package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.letter.Letter;

public class LetterTest
{
    @Test
    public void testLetterFactoryUpperCaseA()
    {
        Letter letter = new Letter('A');
        assertEquals(letter.getLetter(), 'A');
    }

    @Test
    public void testLetterFactoryLowerCaseZ()
    {
        Letter letter = new Letter('z');
        assertEquals(letter.getLetter(), 'z');
    }
}