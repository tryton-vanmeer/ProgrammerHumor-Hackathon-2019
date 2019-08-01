package helloworld.letter;

import helloworld.exception.InvalidLetterException;

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
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  __ _ \n");
                        builder.append(" / _` |\n");
                        builder.append(" \\__,_|");

                        return builder.toString();
                    }
                };
            case 'A':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("    _   \n");
                        builder.append("   /_\\  \n");
                        builder.append("  / _ \\ \n");
                        builder.append(" /_/ \\_\\");

                        return builder.toString();
                    }
                };
            case 'b':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _    \n");
                        builder.append(" | |__ \n");
                        builder.append(" | '_ \\\n");
                        builder.append(" |_.__/");

                        return builder.toString();
                    }
                };
            case 'B':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" | _ )\n");
                        builder.append(" | _ \\\n");
                        builder.append(" |___/");

                        return builder.toString();
                    }
                };
            case 'c':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append("  __ \n");
                        builder.append(" / _|\n");
                        builder.append(" \\__|");
                                
                        return builder.toString();
                    }
                };
            case 'C':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append("   ___ \n");
                        builder.append("  / __|\n");
                        builder.append(" | (__ \n");
                        builder.append("  \\___|");

                        return builder.toString();
                    }
                };
            case 'd':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("     _ \n");
                        builder.append("  __| |\n");
                        builder.append(" / _` |\n");
                        builder.append(" \\__,_|");

                        return builder.toString();
                    }
                };
            case 'D':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___  \n");
                        builder.append(" |   \\ \n");
                        builder.append(" | |) |\n");
                        builder.append(" |___/ ");

                        return builder.toString();
                    }
                };
            case 'e':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" / -_)\n");
                        builder.append(" \\___|");

                        return builder.toString();
                    }
                };
            case 'E':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" | __|\n");
                        builder.append(" | _| \n");
                        builder.append(" |___|");

                        return builder.toString();
                    }
                };
            case 'f':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("   __ \n");
                        builder.append("  / _|\n");
                        builder.append(" |  _|\n");
                        builder.append(" |_|  ");

                        return builder.toString();
                    }
                };
            case 'F':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" | __|\n");
                        builder.append(" | _| \n");
                        builder.append(" |_|  ");

                        return builder.toString();
                    }
                };
            case 'g':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  __ _ \n");
                        builder.append(" / _` |\n");
                        builder.append(" \\__, |\n");
                        builder.append(" |___/ ");

                        return builder.toString();
                    }
                };
            case 'G':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("   ___ \n");
                        builder.append("  / __|\n");
                        builder.append(" | (_ |\n");
                        builder.append("  \\___|");

                        return builder.toString();
                    }
                };
            case 'h':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _    \n");
                        builder.append(" | |_  \n");
                        builder.append(" | ' \\ \n");
                        builder.append(" |_||_|");

                        return builder.toString();
                    }
                };
            case 'H':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _  _ \n");
                        builder.append(" | || |\n");
                        builder.append(" | __ |\n");
                        builder.append(" |_||_|");

                        return builder.toString();
                    }
                };
            case 'i':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _ \n");
                        builder.append(" (_)\n");
                        builder.append(" | |\n");
                        builder.append(" |_|");

                        return builder.toString();
                    }
                };
            case 'I':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" |_ _|\n");
                        builder.append("  | | \n");
                        builder.append(" |___|");

                        return builder.toString();
                    }
                };
            case 'j':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("    _ \n");
                        builder.append("   (_)\n");
                        builder.append("   | |\n");
                        builder.append("  _/ |\n");
                        builder.append(" |__/ ");

                        return builder.toString();
                    }
                };
            case 'J':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("     _ \n");
                        builder.append("  _ | |\n");
                        builder.append(" | || |\n");
                        builder.append("  \\__/ ");

                        return builder.toString();
                    }
                };
            case 'k':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _   \n");
                        builder.append(" | |__\n");
                        builder.append(" | / /\n");
                        builder.append(" |_\\_\\");

                        return builder.toString();
                    }
                };
            case 'K':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _  __\n");
                        builder.append(" | |/ /\n");
                        builder.append(" | ' < \n");
                        builder.append(" |_|\\_\\");

                        return builder.toString();
                    }
                };
            case 'l':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _ \n");
                        builder.append(" | |\n");
                        builder.append(" | |\n");
                        builder.append(" |_|");

                        return builder.toString();
                    }
                };
            case 'L':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _    \n");
                        builder.append(" | |   \n");
                        builder.append(" | |__ \n");
                        builder.append(" |____|");

                        return builder.toString();
                    }
                };
            case 'm':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _ __  \n");
                        builder.append(" | '  \\ \n");
                        builder.append(" |_|_|_|");

                        return builder.toString();
                    }
                };
            case 'M':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  __  __ \n");
                        builder.append(" |  \\/  |\n");
                        builder.append(" | |\\/| |\n");
                        builder.append(" |_|  |_|");

                        return builder.toString();
                    }
                };
            case 'n':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _ _  \n");
                        builder.append(" | ' \\ \n");
                        builder.append(" |_||_|");

                        return builder.toString();
                    }
                };
            case 'N':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _  _ \n");
                        builder.append(" | \\| |\n");
                        builder.append(" | .` |\n");
                        builder.append(" |_|\\_|");

                        return builder.toString();
                    }
                };
            case 'o':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" / _ \\\n");
                        builder.append(" \\___/");

                        return builder.toString();
                    }
                };
            case 'O':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("   ___  \n");
                        builder.append("  / _ \\ \n");
                        builder.append(" | (_) |\n");
                        builder.append("  \\___/ ");

                        return builder.toString();
                    }
                };
            case 'p':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _ __ \n");
                        builder.append(" | '_ \\\n");
                        builder.append(" | .__/\n");
                        builder.append(" |_|   ");

                        return builder.toString();
                    }
                };
            case 'P':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                        
                        builder.append("  ___ \n");
                        builder.append(" | _ \\\n");
                        builder.append(" |  _/\n");
                        builder.append(" |_|  ");

                        return builder.toString();
                    }
                };
            case 'q':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                        
                        builder.append("  __ _ \n");
                        builder.append(" / _` |\n");
                        builder.append(" \\__, |\n");
                        builder.append("    |_|");

                        return builder.toString();
                    }
                };
            case 'Q':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("   ___  \n");
                        builder.append("  / _ \\ \n");
                        builder.append(" | (_) |\n");
                        builder.append("  \\__\\_\\");

                        return builder.toString();
                    }
                };
            case 'r':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _ _ \n");
                        builder.append(" | '_|\n");
                        builder.append(" |_|  ");

                        return builder.toString();
                    }
                };
            case 'R':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" | _ \\\n");
                        builder.append(" |   /\n");
                        builder.append(" |_|_\\");

                        return builder.toString();
                    }
                };
            case 's':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                           
                        builder.append("  ___\n");
                        builder.append(" (_-<\n");
                        builder.append(" /__/");

                        return builder.toString();
                    }
                };
            case 'S':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  ___ \n");
                        builder.append(" / __|\n");
                        builder.append(" \\__ \\\n");
                        builder.append(" |___/");

                        return builder.toString();
                    }
                };
            case 't':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                            
                        builder.append("  _   \n");
                        builder.append(" | |_ \n");
                        builder.append(" |  _|\n");
                        builder.append("  \\__|");

                        return builder.toString();
                    }
                };
            case 'T':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append("  _____ \n");
                        builder.append(" |_   _|\n");
                        builder.append("   | |  \n");
                        builder.append("   |_|  ");

                        return builder.toString();
                    }
                };
            case 'u':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                        
                        builder.append("  _  _ \n");
                        builder.append(" | || |\n");
                        builder.append("  \\_,_|");

                        return builder.toString();
                    }
                };
            case 'U':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();
                        
                        builder.append("  _   _ \n");
                        builder.append(" | | | |\n");
                        builder.append(" | |_| |\n");
                        builder.append("  \\___/ \n");

                        return builder.toString();
                    }
                };
            case 'v':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append(" __ __\n");
                        builder.append(" \\ V /\n");
                        builder.append("  \\_/ \n");

                        return builder.toString();
                    }
                };
            case 'V':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append(" __   __\n");
                        builder.append(" \\ \\ / /\n");
                        builder.append("  \\ V / \n");
                        builder.append("   \\_/  \n");

                        builder.toString();

                        return builder.toString();
                    }
                };
            case 'y':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append("  _  _ \n");
                        builder.append(" | || |\n");
                        builder.append("  \\_, |\n");
                        builder.append("  |__/ ");

                        builder.toString();

                        return builder.toString();
                    }
                };
            case 'Y':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append(" __   __\n");
                        builder.append(" \\ \\ / /\n");
                        builder.append("  \\ V / \n");
                        builder.append("   |_|  ");
                        
                        return builder.toString();
                    }
                };
            case 'z':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append("  ___\n");
                        builder.append(" |_ /\n");
                        builder.append(" /__|");

                        return builder.toString();
                    }
                };
            case 'Z':
                return new Letter(letter)
                {
                    @Override
                    public String toFancyString()
                    {
                        StringBuilder builder = new StringBuilder();

                        builder.append("  ____\n");
                        builder.append(" |_  /\n");
                        builder.append("  / / \n");
                        builder.append(" /___|");
                        
                        return builder.toString();
                    }
                };
            default:
                throw new InvalidLetterException(letter + " is not a valid character for LetterFactory.");
        }
    }
}