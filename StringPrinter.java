public class StringPrinter
{
    public static void printOutEachChar(String word)
    {
        //method that takes in a string word and prints out every character
        for(int i = 0; i < word.length(); i++)
        {
            System.out.println("Char " + (i + 1) + ": " + word.charAt(i));
        }
    }

    public static void printOutInReverse(String word)
    {
        for (int i = word.length() - 1; i >= 0; i--)
        {
            System.out.println("Char " + (i + 1)  + ": " + word.charAt(i));
        }
    }

    public static void printInAllCaps(String text)
    {
        System.out.println(text.toUpperCase());
    }

    public static void printNtimes(String text, int n)
    {
        for (int i = 1; i <= n; i ++) {
            System.out.println(text);
        }
    }

    public static void printStartingLetter(String word)
    {
        word = word.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.print(word.charAt(0));
        for(int i = 0; i < word.length() - 1; i++)
        {
            if(word.charAt(i) == ' ')
            {
                System.out.print(word.charAt(i + 1));
            }
        }
    }

    public static void printHiddenText(String text)
    {
        text = text.toLowerCase();
        for(int i = 0; i < text.length();  i ++)
        {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' ||
                    text.charAt(i) == 'u')
            {
                System.out.print('O');
            }
            else if (text.charAt(i) == ' ')
            {
                System.out.print('+');
            }
            else
                System.out.print('X');
        }
    }

    public static void printWords(String text)
    {
        for (int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i));
            if(text.charAt(i) == ' ')
            {
                System.out.println();
            }
        }
    }

    public static void printRepeatedAndReversed(String word, int n)
    {
        if (n == 1)
        {
            System.out.println(word);
        }

        else if (n % 2 == 0)
        {
            n = n / 2;

            for (int i = 0; i < n; i++)
            {
                System.out.print(word);
                System.out.print(" ");

                for (int k = word.length() - 1; k >= 0; k--)
                {
                    System.out.print(word.charAt(k));
                }
                System.out.print(" ");
            }
        }

        else
        {
            n = n / 2;

            for (int i = 0; i < n; i++)
            {
                System.out.print(word);
                System.out.print(" ");

                for (int k = word.length() - 1; k >= 0; k--)
                {
                    System.out.print(word.charAt(k));
                }
                System.out.print(" ");
            }
            System.out.print(word);
        }
    }


    public static void main (String[] args)
    {
    //    printOutEachChar("Hello");
    //    printOutInReverse("Hello");
    //    printInAllCaps("ani");
    //    printNtimes("Bangla", 3);
    //    printStartingLetter("Hi Ani I am Gowtham --------");
    //    printHiddenText("You totally should eat turkey if you are hungry");
        printWords("My code won't compile");
    //    printRepeatedAndReversed("Go", 5);
    }
}
