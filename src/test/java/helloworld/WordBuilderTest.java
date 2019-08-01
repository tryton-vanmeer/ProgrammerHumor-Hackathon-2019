package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.exception.InvalidLetterException;
import helloworld.letter.LetterFactory;
import helloworld.word.Word;

public class WordBuilderTest
{
    @Test
    public void TestWordBuilderHello() throws InvalidLetterException
    {
        Word.Builder builder = new Word.Builder();

        Word word = builder
                        .addLetter(LetterFactory.getLetter('H'))
                        .addLetter(LetterFactory.getLetter('e'))
                        .addLetter(LetterFactory.getLetter('l'))
                        .addLetter(LetterFactory.getLetter('l'))
                        .addLetter(LetterFactory.getLetter('o'))
                        .build();
        
        assertEquals(word.toString(), "Hello");
    }
}