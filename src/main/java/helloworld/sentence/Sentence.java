package helloworld.sentence;

import java.util.ArrayList;

import helloworld.word.Word;

public class Sentence
{
    private ArrayList<Word> words;

    private Sentence()
    {
        this.words = new ArrayList<>();
    }

    private void addWord(Word word)
    {
        this.words.add(word);
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (Word word : this.words)
        {
            builder.append(word.toString());
        }

        return builder.toString();
    }

    public static class Builder
    {
        private Sentence sentence;

        public Builder()
        {
            this.sentence = new Sentence();
        }

        public Builder addWord(Word word)
        {
            this.sentence.addWord(word);
            return this;
        }

        public Sentence build()
        {
            return this.sentence;
        }
    }
}