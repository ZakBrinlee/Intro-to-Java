import java.util.Scanner;
import java.text.NumberFormat;

public class AccountApp
{
    /* Zak Brinlee - ITC 115 W17 - Assignment 9. This program is a mock bank account application.
     * The user starts with $1000 in their account and will be prompt to enter the transactions for the month.
     * The user will be prompt to choose to enter a Withdrawl or Deposit. Each one will be stored and
     * user asked to repeat. Once completed it will deplay the monthly checking fee of $1, then
     * the total balance at the end of the month */


    public static void main(String[] args)
    {

        //declare variables and functions
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        String choice = "y";
        String transChoice = "";
        String inputAmount;

        Account customer1 = new Account(); // Creates an account object

        //start program with greetings and input
        System.out.println("Welcome to the Account Calculator");

        //Extra line to look cleaner
        System.out.println();

        System.out.println("Starting balance" + "\n" + "Checking Balance: " + nf.format(Account.balance));

        //Extra line to look cleaner
        System.out.println();

        System.out.println("Please enter the transactions for the month");

        //Extra line to look cleaner
        System.out.println();


        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Withdrawl or Deposit? (w/d) : ");
            transChoice = sc.nextLine();

            //Extra line to look cleaner
            System.out.println();

            if(transChoice.equalsIgnoreCase("w"))
            {
                //add withdrawl methods etc here
                System.out.print("Withdrawl Amount: ");
                inputAmount = sc.nextLine();
                double amount = Double.parseDouble(inputAmount);
                Account.amount =  amount;
                Transactions.withdraw(customer1, Account.amount);

                //Extra line to look cleaner
                System.out.println();

            }
            else if(transChoice.equalsIgnoreCase("d"))
            {
                //add deposit methods here
                System.out.print("Deposit Amount: ");
                inputAmount = sc.nextLine();
                double amount = Double.parseDouble(inputAmount);
                Account.amount =  amount;
                Transactions.deposit(customer1, Account.amount);

                //Extra line to look cleaner
                System.out.println();

            }
            else
            {
                System.out.println("Please choose withdrawl or deposit.");
            }

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();

            //Extra line to look cleaner
            System.out.println();

        }//End of While loop

        System.out.println(CheckingAccount.getMonthlyFeeFormatted());
        System.out.println(customer1.getBalanceFormatted());

        //Extra line to look cleaner
        System.out.println();
        System.out.println("Have a great day!");
        System.exit(0);
        sc.close();

    }//End of main

}//End of AccountApp