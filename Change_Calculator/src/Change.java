import java.util.Scanner;

public class Change {

    /*Zak Brinlee - ITC 115 W17 - Assignment 5. In this program a user will enter amount of change between 0-99 cents.
     * The application will display the minimum number of quarters,
     * dimes, nickels and pennies that represent the amount given.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int quarters, quartersR, dimes, dimesR, nickles, nicklesR, pennies;
        int number = 0;

        System.out.println("Welcome to the Change Calculator");
        System.out.println();
        String choice = "y";

        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter number of cents (0-99): ");
            number = Integer.parseInt(sc.nextLine());

            quarters = number/25;
            quartersR = number % 25;
            dimes = quartersR/10;
            dimesR = quartersR % 10;
            nickles = dimesR/5;
            nicklesR = dimesR % 5;
            pennies = nicklesR / 1;

            System.out.println("Quarters: " + quarters + "\n"
                    + "Dimes: " + dimes + "\n"
                    + "Nickles: " + nickles + "\n"
                    + "Pennies: " + pennies);

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }// end of while
        sc.close();
        System.out.println("Bye!");

    }//End of Main

}//End of class
