import java.text.NumberFormat;

public class Order
{
    public static int numberPie;
    public static int numberCake;
    public static int numberCookies;
    public static int orderTotal;

    public Order()
    {
        numberPie = 0;
        numberCake = 0;
        numberCookies = 0;
        orderTotal = 0;
    }//End of Order

    public static int getNumberPie()
    {
        return numberPie;
    }

    public static void setNumberPie(int numberPie)
    {
        Order.numberPie = numberPie;
    }

    public static int getNumberCake()
    {
        return numberCake;
    }

    public static void setNumberCake(int numberCake)
    {
        Order.numberCake = numberCake;
    }

    public static int getNumberCookies()
    {
        return numberCookies;
    }

    public static void setNumberCookies(int numberCookies)
    {
        Order.numberCookies = numberCookies;
    }

    public static int getOrderTotal()
    {
        return orderTotal;
    }

    public static void setOrderTotal(int orderTotal)
    {
        Order.orderTotal = orderTotal;
    }


    public static int Receipt(int numberPie, int numberCake, int numberCookies)
    {
        int pieTotal = 0;
        int cakeTotal = 0;
        int cookiesTotal = 0;

        if(numberPie != 0)//If number of slices of pie is < 0 then will double by 2
        {
            pieTotal = numberPie * 2;
        }

        if(numberCake != 0)//If number of slices of cake is < 0 then will double by 3
        {
            cakeTotal = numberCake * 3;
        }

        if(numberPie != 0)//If number of cookies is < 0 then will double by 1
        {
            cookiesTotal = numberCookies * 1;
        }

        orderTotal = pieTotal + cakeTotal + cookiesTotal;
        NumberFormat n = NumberFormat.getCurrencyInstance();
        //Extra line to look cleaner
        System.out.println();

        System.out.println("Your Order:" + "\n" + "Slices of pie: " + numberPie + " = " + n.format(pieTotal) + "\n" +
                "Slices of cake: " + numberCake + " = " + n.format(cakeTotal) + "\n" +
                "Number of Cookies: " + numberCookies + " = " + n.format(cookiesTotal));

        return orderTotal;
    }

    public static void Total()
    {
        NumberFormat n = NumberFormat.getCurrencyInstance();
        //Extra line to look cleaner
        System.out.println();
        System.out.println("Your total is: " + n.format(orderTotal));
    }
}//End of Order
