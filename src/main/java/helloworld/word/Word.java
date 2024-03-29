package helloworld.word;

import java.util.ArrayList;

import helloworld.api.IBooleanConvertable;
import helloworld.letter.Letter;
import helloworld.letter.LetterPunctuation;
import helloworld.letter.LetterSpace;
import helloworld.letter.LetterPunctuation.Punctuation;

/**
 * A Word is a joined list of letters.
 */
public class Word implements IBooleanConvertable
{
    private ArrayList<Letter> letters;

    private Word()
    {
        this.letters = new ArrayList<>();
    }

    /**
     * Helper method that returns a Word consisting of one LetterSpace.
     * 
     * @return Word consisting of one LetterSpace.
     */
    public static Word getSpaceWord()
    {
        Builder builder = new Builder();

        return builder.addLetter(new LetterSpace()).build();
    }

    /**
     * Helper method that returns a Word consisting of a punctuation.
     * 
     * @return Word consisting of one punctuation.
     */
    public static Word getPunctuationWord(Punctuation punctuation) 
    {
        Builder builder = new Builder();

        return builder.addLetter(LetterPunctuation.getPunctuationLetter(punctuation)).build();
    }

    /**
     * Adds a letter to the word.
     * 
     * @param letter The letter to add to the word.
     */
    private void addLetter(Letter letter)
    {
        this.letters.add(letter);
    }

    @Override
    public boolean toBoolean()
    {
        if (this.toString().equals("True"))
        {
            return true;
        }
        else if (this.toString().equals("true"))
        {
            return true;
        }
        else if (this.toString().equals("False"))
        {
            return false;
        }
        else if (this.toString().equals("false"))
        {
            return false;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (Letter letter : this.letters)
        {
            builder.append(letter.toString());
        }

        return builder.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        else if (obj instanceof Word)
        {
            Word wordToTest = (Word) obj;

            if (this.toString().equals(wordToTest.toString()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * Builder for Words.
     */
    public static class Builder
    {
        private Word word;

        public Builder()
        {
            this.word = new Word();
        }

        /**
         * Adds a letter to the word being built.
         * 
         * @param letter the letter to add to the word.
         * @return this Builder instance.
         */
        public Builder addLetter(Letter letter)
        {
            this.word.addLetter(letter);
            return this;
        }

        /**
         * Returns the built word.
         * 
         * @return Word build from given letters.
         */
        public Word build()
        {
            return this.word;
        }
    }
}