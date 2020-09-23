public class StringAnalyzer
{
    public static int countSentences(String text)
    {
        int countOfSentences = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!')
            {
                countOfSentences++;
            }
        }
        return countOfSentences;
    }

    public static int countVowels(String text)
    {
        int countOfVowels = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a' || text.charAt(i) == 'E' || text.charAt(i) == 'e' ||
            text.charAt(i) == 'I' || text.charAt(i) == 'i' || text.charAt(i) == 'O' || text.charAt(i) == 'o' ||
                    text.charAt(i) == 'U' || text.charAt(i) == 'u')
            {
                countOfVowels++;
            }

        }
        return countOfVowels;
    }

    public static int countConsonants(String word)
    {
        int countOfConsonants = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'A' && word.charAt(i) != 'a' && word.charAt(i) != 'E' && word.charAt(i) != 'e' &&
            word.charAt(i) != 'I' && word.charAt(i) != 'i' && word.charAt(i) != 'O' && word.charAt(i) != 'o' &&
                    word.charAt(i) != 'U' && word.charAt(i) != 'u')
            {
                countOfConsonants++;
            }
        }
        return countOfConsonants;
    }

    public static int countOccurences(String text, String word)
    {
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i <= (text.length() - word.length()); i++)
        {
            if (text.substring(i, word.length() + i).equals(word))
            {
                count++;
            }
        }
        return count;
    }

    public static int countTotalOccurance(String text, String[] searchTerms)
    {
        int countTotalOccurance = 0;
        text = text.toLowerCase();
        for (int k = 0; k < searchTerms.length; k++)
        {
            searchTerms[k] = searchTerms[k].toLowerCase();
        }
        for(int i = 0; i < searchTerms.length; i++)
        {
            for(int j = 0; j <= (text.length() - searchTerms[i].length()); j++)
            {
                if (text.substring(j, searchTerms[i].length() + j).equals(searchTerms[i]))
                {
                    countTotalOccurance ++;
                }
            }
        }
        return countTotalOccurance;
    }

    public static String[] findWords(String text, String [] foundWords)
    {
        String[] resultArray = new String[foundWords.length];
   //     text = text.toLowerCase();
        for (int k = 0; k < foundWords.length; k++)
        {
            foundWords[k] = foundWords[k].toLowerCase();
        }

        for (int i = 0; i < foundWords.length; i++)
        {
            if(text.contains(foundWords[i]))
            {
                resultArray[i] = foundWords[i];
            }
        }
        for (int o = 0; o < resultArray.length; o++)
        {
        //    System.out.println(resultArray[o]);
            if(resultArray[o] != null)
            {
                System.out.println(resultArray[o]);
            }
        }
        return resultArray;
    }


    public static void main (String[] args)
    {
   //     System.out.println(countSentences("Hi"));
   //     System.out.println(countVowels("I love You"));
   //     System.out.println(countConsonants("Gowtham"));
   //     System.out.println(countOccurences("I am Sam and I like spam. Am I dammed?", "am"));
        /*
        String[] searchTerms = new String[] {"so", "you", "am", "eat"};
        System.out.println(countTotalOccurance("I am so so so great", searchTerms));
         */
        String[] searchWords = new String[] {"my", "Gowtham", "am"};
        System.out.println(findWords("Hi my name is Gowtham", searchWords));
    }
}
