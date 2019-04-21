import java.util.Scanner;

public class PigLatin
{
    /* Zak Brinlee - ITC 115 W17 - Assignment 7. In this program I will create a English to Pig Latin translator.
     * The program asks the user to enter a sentence to be translated.
     * Then will provide the sentence translated into Pig Latin. */

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        String sentence = "";
        int i;

        System.out.println("Welcome to the Pig Latin Translator.");
        //Extra line to look cleaner
        System.out.println();

        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter a line to be translated to Pig Latin: ");


            sentence = sc.nextLine();

            if(sentence.isEmpty())
            {
                System.out.println("Please enter a valid word or phrase to be translated.");
            } else {

                sentence = sentence.toLowerCase();
                //System.out.println(sentence);
                //Extra line to look cleaner
                System.out.println();
                String[] wordsArray = sentence.split(" ");

                for(i = 0; i < wordsArray.length; i++)
                {

                    if(wordsArray[i].charAt(0) == 'a' || wordsArray[i].charAt(0) == 'e' || wordsArray[i].charAt(0) == 'i' || wordsArray[i].charAt(0) == 'o' || wordsArray[i].charAt(0) == 'u')
                    {
                        String newLatin = wordsArray[i] + "way" + " ";
                        System.out.print(newLatin + " ");

                    }//End of if loop

                    else
                    {
                        newWord(wordsArray[i]);
                    }//end else for

                }//End of for loop

            }//end of check if input loop

            //Extra line to look cleaner
            System.out.println();
            System.out.print("\nTranslate again? (y/n): ");
            choice = sc.nextLine();


        }//End of while loop

        System.out.println("Bye!");
        System.exit(0);
        sc.close();

    }//End of Main

    private static String newWord(String wordsArray)
    {
        String freshWord = "";
        for (int i=0; i < wordsArray.length(); i ++)
        {
            if(wordsArray.charAt(i)=='a' || wordsArray.charAt(i)=='e' || wordsArray.charAt(i)=='i' || wordsArray.charAt(i)=='o' || wordsArray.charAt(i)=='u')
            {
                String app = wordsArray.substring(0,i);

                String temp = wordsArray.substring(i,wordsArray.length());
                freshWord = temp+app+"ay";
                break;

            }//end of if
        }
        System.out.print(freshWord + " ");
        return freshWord;
    }//end newWord

}//End of class
