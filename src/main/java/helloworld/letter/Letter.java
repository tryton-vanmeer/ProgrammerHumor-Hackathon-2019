package helloworld.letter;

/**
 * Letter
 * 
 * Represents a letter.
 */
public abstract class Letter
{
    private char letter;

    public Letter() {}

    public Letter(char letterIn)
    {
        this.letter = letterIn;
    }

    /**
     * Return this Letter's letter
     *
     * @return letter
     */
    public char getLetter()
    {
        return this.letter;
    }

    /**
     * Set this Letter's letter
     * 
     * @param letter the letter to set
     */
    public void setLetter(char letter)
    {
        this.letter = letter;
    }

    /**
     * toString with fancy representation
     * 
     * @return fancy representation of this letter as a String
     */
    public abstract String toFancyString();

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(this.letter);

        return builder.toString();
    }
}