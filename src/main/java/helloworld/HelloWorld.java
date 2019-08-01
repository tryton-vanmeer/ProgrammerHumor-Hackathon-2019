package helloworld;

import helloworld.exception.InvalidCaseException;
import helloworld.letter.LetterLowerCase;
import helloworld.letter.LetterUpperCase;
import helloworld.sentence.Sentence;
import helloworld.util.PrintUtil;
import helloworld.word.Word;

public class HelloWorld
{
    public static void main(String[] args) throws InvalidCaseException
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

        PrintUtil.print(sentence.toString());
    }
}