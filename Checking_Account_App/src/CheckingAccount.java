import java.text.NumberFormat;

public class CheckingAccount extends Account
{
    //declare variables and functions
    static NumberFormat nf = NumberFormat.getCurrencyInstance();
    static double monthlyFee = 1;

    public CheckingAccount()
    {
        super();
    }

    static double subtractMonthlyFee()
    {
        balance = balance - monthlyFee;
        return balance;
    }

    public void setMonthlyFee(double monthlyFee)
    {
        CheckingAccount.monthlyFee = monthlyFee;
    }
    public double getMonthlyFee()
    {
        return monthlyFee;
    }

    static String getMonthlyFeeFormatted()
    {
        return "Monthly Fees" + "\n" + "Checking fee: " + nf.format(monthlyFee) + "\n";
    }

}//End of CheckingAccount