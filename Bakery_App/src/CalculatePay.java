import java.text.NumberFormat;
import java.util.Scanner;

public class CalculatePay
{
    public static int payAmount;
    public static int changeAmount;
    public static int orderTotal;

    public CalculatePay()
    {
        payAmount = 0;
        changeAmount = 0;
        orderTotal = 0;
    }

    public static int getChangeAmount()
    {
        return changeAmount;
    }

    public static void setChangeAmount(int changeAmount)
    {
        CalculatePay.changeAmount = changeAmount;
    }

    public static int getOrderTotal() {
        return orderTotal;
    }

    public static void setOrderTotal(int orderTotal)
    {
        CalculatePay.orderTotal = orderTotal;
    }

    public static int getPayAmount()
    {
        return payAmount;
    }

    public static void setPayAmount(int payAmount)
    {
        CalculatePay.payAmount = payAmount;
    }

    public static void calculateChange(int payAmount, int orderTotal)
    {
        int twenty = 0;
        int tens = 0;
        int fives = 0;
        int ones = 0;

        //declare functions needed
        NumberFormat n = NumberFormat.getCurrencyInstance();
        Scanner sc = new Scanner(System.in);

        //Extra line to look cleaner
        System.out.println();

        //check if amount entered is enough.
        if(payAmount < orderTotal)
        {
            int shortage = 0;
            shortage = orderTotal - payAmount;
            System.out.println("I�m sorry, you are short: " + n.format(shortage));
            System.out.println("Please enter an amount greater than the total for your order: ");
            payAmount = sc.nextInt();
        }

        changeAmount = payAmount - orderTotal;

        System.out.print("Your change is: " + n.format(changeAmount) + "\n");

        while(changeAmount >= 20)
        {
            twenty++;
            changeAmount -= 20;
        }
        while(changeAmount >= 10)
        {
            tens++;
            changeAmount -= 10;
        }
        while(changeAmount >= 5)
        {
            fives++;
            changeAmount -= 5;
        }
        while(changeAmount >= 1)
        {
            ones++;
            changeAmount -= 1;
        }

        System.out.println("Twenties: " + twenty + "\n" + "Tens: " + tens + "\n"+ "Fives: " + fives + "\n" + "Ones: " + ones + "\n");
    }//end of calculateChange

}//End of CalculatePay class
