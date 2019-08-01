package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.letter.Letter;
import helloworld.word.Word;

public class WordBuilderTest
{
    @Test
    public void TestWordBuilderHello()
    {
        Word.Builder builder = new Word.Builder();

        Word word = builder
                        .addLetter(new Letter('H'))
                        .addLetter(new Letter('e'))
                        .addLetter(new Letter('l'))
                        .addLetter(new Letter('l'))
                        .addLetter(new Letter('o'))
                        .build();
        
        assertEquals(word.toString(), "Hello");
    }
}