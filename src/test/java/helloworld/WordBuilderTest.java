package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.exception.InvalidCaseException;
import helloworld.letter.LetterLowerCase;
import helloworld.letter.LetterUpperCase;
import helloworld.word.Word;

public class WordBuilderTest
{
    @Test
    public void TestWordBuilderHello() throws InvalidCaseException
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
}