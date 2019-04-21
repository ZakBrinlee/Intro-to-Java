import java.util.Random;
import java.util.Scanner;

public class GuessGame
{

	/*Zak Brinlee - ITC 115 W17 - Assignment 3. In this program I will create a guessing game that randomly generates a number
	 and prompts the user to guess. With each guess it will inform the user if the guess was to low, to high or correct. */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Welcome message
        System.out.println("Welcome to the Number Guessing Game");

        userInput(sc);

    }//End of main

    private static void userInput(Scanner sc) {
        int response = 0;
        System.out.print("Enter the upper limit for the number: ");
        int upperLimit = Integer.parseInt(sc.nextLine());

        Random random = new Random();
        int answer = random.nextInt(upperLimit -1) + 1;

        System.out.println("OK, I'm thinking of a number between 0 and " + upperLimit + "\n");

        System.out.print("Enter your guess: ");
        response = Integer.parseInt(sc.nextLine());

        reply(response, answer, sc);
        sc.close();
    }//end of userInput

    private static void reply(int response, int answer, Scanner sc) {

        while (response!=answer)
        {
            if(response>=answer)
            {
                System.out.println();
                System.out.println("Your guess is too high");
                guess(response, answer);
            }
            else
            {
                System.out.println();
                System.out.println("Your guess is too low");
                guess(response, answer);
            }
        }//End of while
        System.out.println("\nCorrect!");

        System.out.print("Guess again? Y/N ");
        Object again = sc.nextLine();

        if (again.equals("N")|| again.equals("n")) {
            System.out.println("Bye!");
            System.exit(0);
        } else {
            userInput(sc);
        }
    }//end of reply

    private static void guess(int response, int answer)
    {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your guess: ");
        response = Integer.parseInt(sc.nextLine());
        reply(response, answer, sc);

        sc.close();
    }//End of guess
}//End of class
