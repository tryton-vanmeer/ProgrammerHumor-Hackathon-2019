package helloworld.sentence;

import java.util.ArrayList;

import helloworld.word.Word;

/**
 * A Sentence is a joined list of Words.
 */
public class Sentence
{
    private ArrayList<Word> words;

    private Sentence()
    {
        this.words = new ArrayList<>();
    }

    /**
     * Adds a word to the sentence.
     * 
     * @param word The word to add to the Sentence.
     */
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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        else if (obj instanceof Sentence)
        {
            Sentence sentenceToTest = (Sentence) obj;

            if (this.toString().equals(sentenceToTest.toString()))
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
     * Builder for Sentences.
     */
    public static class Builder
    {
        private Sentence sentence;

        public Builder()
        {
            this.sentence = new Sentence();
        }

        /**
         * Adds a word to the sentence being built.
         * 
         * @param word The word to be added.
         * @return this instance of Builder.
         */
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