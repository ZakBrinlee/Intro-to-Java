public class Transactions extends Account
{
    static double total=0;

    public Transactions()
    {
        super();
    }

    public static void deposit(Depositable account, double amount)
    {
        total = total+amount;

        if(amount <= 10000)
        {
            balance = balance + amount;
            account.deposit(amount);
        }
        else
        {
            System.out.println("Sorry, unable to deposit more than $10,000 per transaction.");
        }
    }


    public static void withdraw(Withdrawable account, double amount)
    {
        if(balance >= amount)
        {
            balance = balance - amount;
            account.withdraw(amount);
        }
        else
        {
            System.out.println("Sorry, cannot withdrawl more than the account balance.");
        }

    }
}//End of Transactions