package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helloworld.exception.InvalidCaseException;
import helloworld.letter.LetterLowerCase;
import helloworld.letter.LetterUpperCase;
import helloworld.sentence.Sentence;
import helloworld.word.Word;

public class SentenceTest
{
    @Test
    public void testSentenceHelloWord() throws InvalidCaseException
    {
        Sentence.Builder sentenceBuilder = new Sentence.Builder();

        Word.Builder wordBuilder = new Word.Builder();

        Word hello = wordBuilder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        wordBuilder = new Word.Builder();

        Word world = wordBuilder
                        .addLetter(new LetterUpperCase('W'))
                        .addLetter(new LetterLowerCase('o'))
                        .addLetter(new LetterLowerCase('r'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('d'))
                        .build();

        Sentence sentence = sentenceBuilder
                                .addWord(hello)
                                .addWord(world)
                                .build();

        assertEquals(sentence.toString(), "HelloWorld");
    }

    @Test
    public void testSentenceWithSpaces() throws InvalidCaseException
    {
        Sentence.Builder sentenceBuilder = new Sentence.Builder();

        Word.Builder wordBuilder = new Word.Builder();

        Word hello = wordBuilder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        wordBuilder = new Word.Builder();

        Word world = wordBuilder
                        .addLetter(new LetterUpperCase('W'))
                        .addLetter(new LetterLowerCase('o'))
                        .addLetter(new LetterLowerCase('r'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('d'))
                        .build();

        Sentence sentence = sentenceBuilder
                                .addWord(hello)
                                .addWord(Word.getSpaceWord())
                                .addWord(world)
                                .build();

        assertEquals(sentence.toString(), "Hello World");
    }

    @Test
    public void testSentenceEquality() throws InvalidCaseException
    {
        Sentence.Builder sentenceBuilder = new Sentence.Builder();

        Word.Builder wordBuilder = new Word.Builder();

        Word hello = wordBuilder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        wordBuilder = new Word.Builder();

        Word world = wordBuilder
                        .addLetter(new LetterUpperCase('W'))
                        .addLetter(new LetterLowerCase('o'))
                        .addLetter(new LetterLowerCase('r'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('d'))
                        .build();

        Sentence sentence = sentenceBuilder
                                .addWord(hello)
                                .addWord(Word.getSpaceWord())
                                .addWord(world)
                                .build();

        Sentence sentence2 = sentenceBuilder
                                .addWord(hello)
                                .addWord(Word.getSpaceWord())
                                .addWord(world)
                                .build();

        boolean result = sentence.equals(sentence2);

        assertEquals(result, true);
    }

    @Test
    public void testSentenceEqualityDifferent() throws InvalidCaseException
    {
        Sentence.Builder sentenceBuilder = new Sentence.Builder();

        Word.Builder wordBuilder = new Word.Builder();

        Word hello = wordBuilder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        wordBuilder = new Word.Builder();

        Word world = wordBuilder
                        .addLetter(new LetterUpperCase('W'))
                        .addLetter(new LetterLowerCase('o'))
                        .addLetter(new LetterLowerCase('r'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('d'))
                        .build();

        Sentence sentence = sentenceBuilder
                                .addWord(hello)
                                .addWord(Word.getSpaceWord())
                                .addWord(world)
                                .build();

        sentenceBuilder = new Sentence.Builder();

        Sentence sentence2 = sentenceBuilder
                                .addWord(world)
                                .addWord(Word.getSpaceWord())
                                .addWord(hello)
                                .build();

        boolean result = sentence.equals(sentence2);

        assertEquals(result, false);
    }

    @Test
    public void testSentenceEqualityNull() throws InvalidCaseException
    {
        Sentence.Builder sentenceBuilder = new Sentence.Builder();

        Word.Builder wordBuilder = new Word.Builder();

        Word hello = wordBuilder
                        .addLetter(new LetterUpperCase('H'))
                        .addLetter(new LetterLowerCase('e'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('o'))
                        .build();

        wordBuilder = new Word.Builder();

        Word world = wordBuilder
                        .addLetter(new LetterUpperCase('W'))
                        .addLetter(new LetterLowerCase('o'))
                        .addLetter(new LetterLowerCase('r'))
                        .addLetter(new LetterLowerCase('l'))
                        .addLetter(new LetterLowerCase('d'))
                        .build();

        Sentence sentence = sentenceBuilder
                                .addWord(hello)
                                .addWord(Word.getSpaceWord())
                                .addWord(world)
                                .build();

        Sentence sentence2 = null;

        boolean result = sentence.equals(sentence2);

        assertEquals(result, false);
    }
}