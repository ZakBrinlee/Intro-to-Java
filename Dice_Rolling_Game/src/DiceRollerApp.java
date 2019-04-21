import java.util.Scanner;

public class DiceRollerApp {


    /* Zak Brinlee - ITC 115 W17 - Assignment 6. In this program I will create a Dice rolling game that
     * randomly generates a two dice rolls and their sums. Then will provide a response depending on the roll outcome,
     * and prompt a user to roll again */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String choice = "y";

        System.out.println("Welcome to the Dice Roller");
        //Extra line to look cleaner
        System.out.println();

        System.out.print("Roll the dice? (y/n): ");
        choice=sc.nextLine();

        System.out.println();
        while (choice.equalsIgnoreCase("y"))
        {
            counter++; //Initialize counter

            PairOfDice PA = new PairOfDice();
            PA.roll();
            PA.getSum();
            System.out.println("Roll" + " " + counter + ":");
            System.out.println(PA.die1);
            System.out.println(PA.die2);

            if(PA.sum == 2)
            {
                System.out.println("Snake Eyes!!");
            }
            else if(PA.sum == 12)
            {
                System.out.println("Box Cars!!");
            }
            else if(PA.sum == 7)
            {
                System.out.println("Craps!");
            }
            else
            {
                System.out.println("Nothing Special!");
            }
            System.out.print("Roll again? (y/n): ");
            choice=sc.nextLine();
            //Extra line to look cleaner
            System.out.println();
        }//End of while loop

        System.out.println("Bye!");
        System.exit(0);
        sc.close();
    }//End of main

}//End of class
