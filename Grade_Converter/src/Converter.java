import java.util.Scanner;

public class Converter
{
    public static int number;

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Grade G = new Grade();
        String choice = "y";
        //start and welcome greeting
        System.out.println("Welcome to the Letter Grade Converter.");

        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter a numerical grade: ");
            number = Integer.parseInt(sc.nextLine());
            G.setNumber(number);

            System.out.println("Letter grade: " + G.letterGrade());

            System.out.print("Continue? Y/N ");
            choice = sc.nextLine();
        }//end of while
        System.out.println("Bye!");
        sc.close();

    }//End of Main

}//End of converter class