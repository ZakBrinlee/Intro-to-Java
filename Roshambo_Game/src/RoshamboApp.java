import java.util.Scanner;

public class RoshamboApp
{
    /* Zak Brinlee - ITC 115 W17 - Assignment 10. This program is game for Rock Paper Scissors.
     * The user starts by entering their name. Then selecting their opponent. The player would choose
     * whether they wish to select Rock, Paper or Scissors.
     * The program would then display what the opponent selected and the outcome of the round.*/

    static String playerThrow = "";
    static String playerName = "";
    static Scanner sc = new Scanner(System.in);
    static String choice = "y";
    static String opponentChoice = "";

    public static void main(String[] args)
    {

        //start program with greetings and input
        System.out.println("Welcome to the game of Roshambo");

        //Extra line to look cleaner
        System.out.println();

        System.out.print("Enter your name: ");
        playerName = sc.nextLine();

        Player1.playerName = playerName;

        //Extra line to look cleaner
        System.out.println();

        while(choice.equalsIgnoreCase("y"))
        {
            chooseYourOpponent();

            //Extra line to look cleaner
            System.out.println();

            if(opponentChoice.equalsIgnoreCase("b"))
            {
                getInput();
                Player1.generateRoshambo();
                Bart.generateRoshambo();//generate Bart's play
                getBartScores();

                //Extra line to look cleaner
                System.out.println();

            }
            else if(opponentChoice.equalsIgnoreCase("l"))
            {
                getInput();
                Player1.generateRoshambo();
                Lisa.generateRoshambo();//generate Lisa's play
                getLisaScores();

                //Extra line to look cleaner
                System.out.println();

            }
            else if(!opponentChoice.equalsIgnoreCase("b") && !opponentChoice.equalsIgnoreCase("l"))
            {
                System.out.print("Seriously?" + "\n" +"We already gave you a second chance..." + "You can play Bart. \n");
                opponentChoice = "b";
                getInput();
                Player1.generateRoshambo();
                Bart.generateRoshambo();//generate Bart's play
                getBartScores();
            }

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
        }//End of While loop



        //Extra line to look cleaner
        System.out.println();
        System.out.println("Have a great day!");
        System.exit(0);
        sc.close();

    }//End of main

    public static void chooseYourOpponent()
    {
        System.out.print("Would you like to play Bart or Lisa? (b/l): ");
        opponentChoice = sc.nextLine();

        if(!opponentChoice.equalsIgnoreCase("b") && !opponentChoice.equalsIgnoreCase("l"))
        {
            System.out.println("Please choose an opponent from the list provided");

            //Extra line to look cleaner
            System.out.println();

            System.out.print("Would you like to play Bart or Lisa? (b/l): ");
            opponentChoice = sc.nextLine();
        }
    }


    public static void getInput()
    {
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Rock, Paper, or Scissors? (r/p/s): ");
            playerThrow = sc.nextLine();

            if(playerThrow.equalsIgnoreCase("r"))
            {
                Player1.playerThrow = "Rock";
                break;
            }
            else if(playerThrow.equalsIgnoreCase("p"))
            {
                Player1.playerThrow = "Paper";
                break;
            }
            else if(playerThrow.equalsIgnoreCase("s"))
            {
                Player1.playerThrow = "Scissors";
                break;
            }
            else
            {
                //Extra line to look cleaner
                System.out.println();

                System.out.println("Please choose either Rock, Paper or Scissors: ");
            }
        }//end of while loop

    }//end of getInput

    public static void getLisaScores()
    {
        if(Player1.playerThrow == "Scissors")
        {
            if(Lisa.lisaRosh == "Rock")
            {
                System.out.println("Lisa Wins!");
            }
            else if (Lisa.lisaRosh == "Paper")
            {
                System.out.println(Player1.playerName + " Wins!");
            }
            else if (Lisa.lisaRosh == "Scissors")
            {
                System.out.println("Draw!");
            }

        }//end of player chooses Scissor

        else if(Player1.playerThrow == "Rock")
        {
            if(Lisa.lisaRosh == "Rock")
            {
                System.out.println("Draw!");
            }
            else if (Lisa.lisaRosh == "Paper")
            {
                System.out.println("Lisa Wins!");
            }
            else if (Lisa.lisaRosh == "Scissors")
            {
                System.out.println(Player1.playerName + " Wins!");
            }

        }//end of player chooses Rock

        else if (Player1.playerThrow == "Paper")
        {
            if(Lisa.lisaRosh == "Rock")
            {
                System.out.println(Player1.playerName + " Wins!");
            }
            else if (Lisa.lisaRosh == "Paper")
            {
                System.out.println("Draw!");
            }
            else if (Lisa.lisaRosh == "Scissors")
            {
                System.out.println("Lisa Wins!");
            }

        }//end of player chooses Paper

    }//End of getLisaScores

    public static void getBartScores()
    {
        if(Bart.bartRosh == "Rock")
        {
            if(Player1.playerThrow == "Rock")
            {
                System.out.println("Draw!");
            }
            else if (Player1.playerThrow == "Paper")
            {
                System.out.println(Player1.playerName + " Wins!");
            }
            else if (Player1.playerThrow == "Scissors")
            {
                System.out.println("Bart Wins!");
            }

        }

    }//End of getBartScores

}//End of RoshamboApp