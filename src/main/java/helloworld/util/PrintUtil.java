package helloworld.util;

public class PrintUtil
{
    public static void print(String s)
    {
        System.out.println(s);
    }

    public static void printBlock(String... lines)
    {
        for (String line : lines)
        {
            print(line);
        }
    }
}