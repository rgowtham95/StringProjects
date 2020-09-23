public class StringModifier
{
    public static String exclaimWord(String word) {
        String result = word + "!";
        return result;
    }

    public static String combineWords(String word1, String word2, String word3) {
        return word1 + " " + word2 + " " + word3;
    }

    public static String twistWord(String word) {
        String result = word.substring(word.length() / 2) + word.substring(0, (word.length() / 2));
        return result;
    }

    public static String reverseWord(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }

    public static String spanify(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i);
            if (word.charAt(i) == 't') {
                result += 'h';
            }
        }
        return result;
    }

    public static String pigLatinateWord(String text)
    {
        text = text.toLowerCase();
        String result = "";
        /*
            for (int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i));
            if(text.charAt(i) == ' ')
            {
                System.out.println();
            }
        }
             */

        if (text.startsWith("a") || text.startsWith("e") || text.startsWith("i") || text.startsWith("o") ||
                text.startsWith("u")) {
            for (int i = 0; i < text.length(); i++) {
                result += text.charAt(i);
            }
            result += text.charAt(0) + "hay";
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                        || text.charAt(i) == 'u') {
                    result += text.substring(i, text.length()) + text.substring(0, i) + "ay";
                    break;
                }
            }
        }
        return result;
    }

    public static String elongateWord(String word)
    {
        String combination = "";

        for (int i = 0; i < word.length(); i++)
        {
            int edgeFirst = i;
       //     System.out.println(edgeFirst);
            int edgeLast = (word.length() - 1) - i;
       //     System.out.println(edgeLast);
            combination += word.charAt(i);

            if(edgeFirst <= edgeLast)
            {
                for(int j = 0; j < edgeFirst; j++)
                {
                    combination += word.charAt(i);
                }
            }
            else if(edgeLast <= edgeFirst)
            {
                for(int k = 0; k < edgeLast; k++)
                {
                    combination += word.charAt(i);
                }
            }
        }
        return combination;
    }

    public static void main (String[] args)
    {
        //     System.out.println(exclaimWord("Hello"));
        //     System.out.println(combineWords("Hi", "hello", "bye"));
        //     System.out.println(twistWord("marking"));
        //     System.out.println(reverseWord("mathematics"));
        //     System.out.println(spanify("You totally should eat turkey"));
             System.out.println(pigLatinateWord("orbit"));
        //     System.out.println(elongateWord("wombat"));
    }
}
