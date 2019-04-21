import java.util.Scanner;

public class BakeryApp
{
    /* Zak Brinlee - ITC 115 W17 - Extra Credit Bakery App. In this program a user decide if they
     * wish to start shopping. It will display the daily specials and prompt the user to pick the
     * amount they want for each item. Then will proceed to display their order and the amount
     * for each item along with a total. Then ask the user to enter the whole dollar amount they
     * are paying with. Then it will display their change amount along with a breakdown of
     * the denominations. And prompt the user if they wish to shop again. */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        System.out.println("Welcome to the Bakery");

        //Extra line to look cleaner
        System.out.println();

        System.out.print("Would you like to Shop? (y/n): ");
        choice = sc.nextLine();

        //Extra line to look cleaner
        System.out.println();
        int counter = 2; //Counter to allow for more than 1 order.
        while(choice.equalsIgnoreCase("y") && counter > 1)
        {
            System.out.println("Thank you for choosing to shop.");
            System.out.println("Our Specials Today Are: ");
            System.out.println("Pie- $2.00 per slice");
            System.out.println("Cake- $3.00 per slice");
            System.out.println("Cookies- $1.00 each");

            //Extra line to look cleaner
            System.out.println();

            System.out.print("How many slices of pie would you like?: ");
            int numberPie = Integer.parseInt(sc.nextLine());

            System.out.print("How many slices of cake would you like?: ");
            int numberCake = Integer.parseInt(sc.nextLine());

            System.out.print("How many cookies would you like?:  ");
            int numberCookies = Integer.parseInt(sc.nextLine());

            Order.Receipt(numberPie, numberCake, numberCookies);
            Order.Total();

            System.out.print("Please Enter a Whole Dollar Amount Greater Than the Order Total: ");
            int payAmount = Integer.parseInt(sc.nextLine());

            CalculatePay.calculateChange(payAmount, Order.orderTotal);

            System.out.print("Would you like to shop again? (y/n): ");
            choice = sc.nextLine();
            //Extra line to look cleaner
            System.out.println();
        }

        System.out.println("Have a great day!");
        System.exit(0);
        sc.close();
    }//End of main

}//End of BakeryApp
