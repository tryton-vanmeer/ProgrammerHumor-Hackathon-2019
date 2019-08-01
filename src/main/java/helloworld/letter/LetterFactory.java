package helloworld.letter;

import helloworld.exception.InvalidLetterException;
import helloworld.util.PrintUtil;

public class LetterFactory
{
    public static Letter getLetter(char letter) throws InvalidLetterException
    {
        switch(letter)
        {
            case 'a':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  __ _ ",
                                " / _` |",
                                " \\__,_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'A':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "    _   ",
                                "   /_\\  ",
                                "  / _ \\ ",
                                " /_/ \\_\\"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'b':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _    ",
                                " | |__ ",
                                " | '_ \\",
                                " |_.__/"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'B':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " | _ )",
                                " | _ \\",
                                " |___/"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'c':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  __ ",
                                " / _|",
                                " \\__|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'C':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "   ___ ",
                                "  / __|",
                                " | (__ ",
                                "  \\___|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'd':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "     _ ",
                                "  __| |",
                                " / _` |",
                                " \\__,_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'D':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___  ",
                                " |   \\ ",
                                " | |) |",
                                " |___/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'e':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " / -_)",
                                " \\___|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'E':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " | __|",
                                " | _| ",
                                " |___|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'f':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "   __ ",
                                "  / _|",
                                " |  _|",
                                " |_|  "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'F':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " | __|",
                                " | _| ",
                                " |_|  "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'g':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  __ _ ",
                                " / _` |",
                                " \\__, |",
                                " |___/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'G':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "   ___ ",
                                "  / __|",
                                " | (_ |",
                                "  \\___|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'h':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _    ",
                                " | |_  ",
                                " | ' \\ ",
                                " |_||_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'H':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _  _ ",
                                " | || |",
                                " | __ |",
                                " |_||_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'i':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _ ",
                                " (_)",
                                " | |",
                                " |_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'I':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " |_ _|",
                                "  | | ",
                                " |___|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'j':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "    _ ",
                                "   (_)",
                                "   | |",
                                "  _/ |",
                                " |__/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'J':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "     _ ",
                                "  _ | |",
                                " | || |",
                                "  \\__/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'k':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _   ",
                                " | |__",
                                " | / /",
                                " |_\\_\\"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'K':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _  __",
                                " | |/ /",
                                " | ' < ",
                                " |_|\\_\\"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'l':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _ ",
                                " | |",
                                " | |",
                                " |_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'L':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _    ",
                                " | |   ",
                                " | |__ ",
                                " |____|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'm':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _ __  ",
                                " | '  \\ ",
                                " |_|_|_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'M':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  __  __ ",
                                " |  \\/  |",
                                " | |\\/| |",
                                " |_|  |_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'n':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _ _  ",
                                " | ' \\ ",
                                " |_||_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'N':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _  _ ",
                                " | \\| |",
                                " | .` |",
                                " |_|\\_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'o':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " / _ \\",
                                " \\___/"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'O':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "   ___  ",
                                "  / _ \\ ",
                                " | (_) |",
                                "  \\___/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'p':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _ __ ",
                                " | '_ \\",
                                " | .__/",
                                " |_|   "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'P':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " | _ \\",
                                " |  _/",
                                " |_|  "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'q':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  __ _ ",
                                " / _` |",
                                " \\__, |",
                                "    |_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'Q':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "   ___  ",
                                "  / _ \\ ",
                                " | (_) |",
                                "  \\__\\_\\"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'r':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _ _ ",
                                " | '_|",
                                " |_|  "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'R':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " | _ \\",
                                " |   /",
                                " |_|_\\"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 's':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___",
                                " (_-<",
                                " /__/"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'S':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___ ",
                                " / __|",
                                " \\__ \\",
                                " |___/"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 't':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _   ",
                                " | |_ ",
                                " |  _|",
                                "  \\__|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'T':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _____ ",
                                " |_   _|",
                                "   | |  ",
                                "   |_|  "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'u':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _  _ ",
                                " | || |",
                                "  \\_,_|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'U':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _   _ ",
                                " | | | |",
                                " | |_| |",
                                "  \\___/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'v':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                " __ __",
                                " \\ V /",
                                "  \\_/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'V':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                " __   __",
                                " \\ \\ / /",
                                "  \\ V / ",
                                "   \\_/  "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'y':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  _  _ ",
                                " | || |",
                                "  \\_, |",
                                "  |__/ "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'Y':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                " __   __",
                                " \\ \\ / /",
                                "  \\ V / ",
                                "   |_|  "
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'z':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ___",
                                " |_ /",
                                " /__|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            case 'Z':
                return new Letter(letter)
                {
                    @Override
                    public void draw(boolean fancy)
                    {
                        if (fancy)
                        {
                            PrintUtil.printBlock(
                                "  ____",
                                " |_  /",
                                "  / / ",
                                " /___|"
                            );
                        }
                        else
                        {
                            PrintUtil.print(this.toString());
                        }
                    }
                };
            default:
                throw new InvalidLetterException(letter + " is not a valid character for LetterFactory.");
        }
    }
}