package helloworld.letter;

/**
 * Letter
 * 
 * Represents a letter.
 */
public abstract class Letter
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

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(this.letter);

        return builder.toString();
    }
}