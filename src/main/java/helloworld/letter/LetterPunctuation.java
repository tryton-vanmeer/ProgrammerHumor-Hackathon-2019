package helloworld.letter;

/**
 * Letters that are punctuation.
 */
public class LetterPunctuation extends Letter
{
    private LetterPunctuation(char punctuation)
    {
        super(punctuation);
    }

    /**
     * Returns a LetterPunctiation based on the Punctuation Enum.
     * 
     * @param punctuation the punctuation to create.
     * @return LetterPunctiation of the requested punctuation.
     */
    public static LetterPunctuation getPunctuationLetter(Punctuation punctuation)
    {
        return new LetterPunctuation(punctuation.getCharacter());
    }

    /**
     * Enum for the types of punctuation letters available.
     */
    public static enum Punctuation
    {
        PERIOD('.'), BANG('!'), COMMA(',');

        private char character;

        Punctuation(char punctuation)
        {
            this.character = punctuation;
        }

        public char getCharacter()
        {
            return this.character;
        }
    }
}