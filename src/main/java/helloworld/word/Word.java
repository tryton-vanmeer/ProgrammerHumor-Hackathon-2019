package helloworld.word;

import java.util.ArrayList;

import helloworld.letter.Letter;

public class Word
{
    private ArrayList<Letter> letters;

    private Word()
    {
        this.letters = new ArrayList<>();
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