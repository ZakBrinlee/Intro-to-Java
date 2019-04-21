import java.util.Scanner;

public class PairOfDice {

    int sides;
    int die1;
    int die2;
    int sum;

    Scanner sc = new Scanner(System.in);
    //initialize values
    public PairOfDice()
    {
        sides = 6;
        die1 = 1;
        die2 = 1;
        sum = 0;
    }// end PairOfDice

    public PairOfDice(int sides)
    {
        roll();
    }

    public void roll()
    {
        die1 = (int) Math.ceil(Math.random() *  sides);
        die2 = (int) Math.ceil(Math.random() *  sides);
    }//end double die roll

    public int getDie2()
    {
        return die2;
    }//End getDie2

    public int getDie1()
    {
        return die1;
    }//End getDie1

    public int getSum()
    {
        sum = die1 + die2;
        return sum;
    }

}//End of class
