import java.util.Scanner;

public class Die {
    Scanner sc = new Scanner(System.in);
    int sides;
    int value;

    public Die()
    {
        sides = 6;
        value = 0;
    }//end Die constructor

    public Die(int sides)
    {
        roll();
    }//end Die

    public void roll()
    {
        value = (int) Math.ceil(Math.random() * sides);
    }//End roll

    public int getValue()
    {
        return value;
    }//End getValue

}//End of class