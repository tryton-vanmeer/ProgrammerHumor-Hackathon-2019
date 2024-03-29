package helloworld.letter;

import helloworld.api.IBooleanConvertable;

/**
 * Letter
 * 
 * Represents a letter.
 */
public abstract class Letter implements IBooleanConvertable
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

    public boolean toBoolean()
    {
        if (this.toString().equals("t"))
        {
            return true;
        }
        else if (this.toString().equals("T"))
        {
            return true;
        }
        else if (this.toString().equals("f"))
        {
            return false;
        }
        else if (this.toString().equals("F"))
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
        builder.append(this.letter);

        return builder.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        else if (obj instanceof Letter)
        {
            Letter letterToTest = (Letter) obj;

            if (this.toString().equals(letterToTest.toString()))
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
}