package helloworld.word;

import java.util.ArrayList;

import helloworld.letter.Letter;
import helloworld.letter.LetterSpace;

public class Word
{
    private ArrayList<Letter> letters;

    private Word()
    {
        this.letters = new ArrayList<>();
    }

    public static Word getSpaceWord()
    {
        Builder builder = new Builder();

        return builder.addLetter(new LetterSpace()).build();
    }

    private void addLetter(Letter letter)
    {
        this.letters.add(letter);
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

    public static class Builder
    {
        private Word word;

        public Builder()
        {
            this.word = new Word();
        }

        public Builder addLetter(Letter letter)
        {
            this.word.addLetter(letter);
            return this;
        }

        public Word build()
        {
            return this.word;
        }
    }
}