package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.exception.InvalidCaseException;
import helloworld.letter.LetterLowerCase;
import helloworld.letter.LetterUpperCase;
import helloworld.word.Word;

public class WordTest
{
    @Test
    public void testWordBuilderHello() throws InvalidCaseException
    {
        Word.Builder builder = new Word.Builder();

        Word word = builder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();
        
        assertEquals(word.toString(), "Hello");
    }

    @Test
    public void testSpaceWord()
    {
        Word space = Word.getSpaceWord();

        assertEquals(space.toString(), " ");
    }

    @Test
    public void testWordEquality() throws InvalidCaseException
    {
        Word.Builder builder = new Word.Builder();

        Word word1 = builder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        builder = new Word.Builder();

        Word word2 = builder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();
        
        boolean result = word1.equals(word2);

        assertEquals(result, true);
    }

    @Test
    public void testWordInequalityDifferentWord() throws InvalidCaseException
    {
        Word.Builder builder = new Word.Builder();

        Word word1 = builder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        builder = new Word.Builder();

        Word word2 = builder
                        .addLetter(new LetterUpperCase('W'))
                        .addLetter(new LetterLowerCase('o'))
                        .addLetter(new LetterLowerCase('r'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('d'))
                        .build();
        
        boolean result = word1.equals(word2);

        assertEquals(result, false);
    }

    @Test
    public void testWordInequalityNull() throws InvalidCaseException
    {
        Word.Builder builder = new Word.Builder();

        Word word1 = builder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        Word word2 = null;

        boolean result = word1.equals(word2);

        assertEquals(result, false);
    }

    @Test
    public void testWordToBooleanTrue() throws InvalidCaseException
    {
        Word.Builder builder = new Word.Builder();

        Word word = builder
                        .addLetter(new LetterUpperCase('T'))
                        .addLetter(new LetterLowerCase('r'))
                        .addLetter(new LetterLowerCase('u'))
                        .addLetter(new LetterLowerCase('e'))
                        .build();

        assertEquals(word.toBoolean(), true);
    }

    @Test
    public void testWordToBooleanFalse() throws InvalidCaseException
    {
        Word.Builder builder = new Word.Builder();

        Word word = builder
                        .addLetter(new LetterUpperCase('F'))
                        .addLetter(new LetterLowerCase('a'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('s'))
                        .addLetter(new LetterLowerCase('e'))
                        .build();

        assertEquals(word.toBoolean(), false);
    }

    @Test
    public void testWordToBooleanFalseOther() throws InvalidCaseException
    {
        Word.Builder builder = new Word.Builder();

        Word word = builder
                        .addLetter(new LetterUpperCase('F'))
                        .addLetter(new LetterLowerCase('o'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        assertEquals(word.toBoolean(), false);
    }
}