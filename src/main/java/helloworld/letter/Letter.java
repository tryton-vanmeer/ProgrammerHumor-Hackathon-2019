package helloworld.letter;

/**
 * Letter
 * 
 * Represents a letter.
 */
public class Letter
{
    private char letter;

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

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(this.letter);

        return builder.toString();
    }
}