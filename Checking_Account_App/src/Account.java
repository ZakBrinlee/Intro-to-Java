import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balanceable
{
    //declare variables and functions
    static double amount = 0;
    static double balance = 1000;
    static double finalBalance = 0;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    //start getters and setters
    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        Account.amount = amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        Account.balance = balance;
    }


    public String getBalanceFormatted()
    {
        String result;
        //if statement to show negative value
        if(balance - CheckingAccount.monthlyFee < 0 )
        {
            result = "Final Balance" + "\n" + "Checking: " + "-" + nf.format(CheckingAccount.subtractMonthlyFee());
        }
        else
        {
            result = "Final Balance" + "\n" + "Checking: " + nf.format(CheckingAccount.subtractMonthlyFee());
        }
        return result;
    }

    @Override
    public void withdraw(double amount) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub

    }
}//End of Account