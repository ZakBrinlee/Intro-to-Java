import java.util.Scanner;

public class MovieListerApp
{
    public static Scanner in = new Scanner(System.in);
    public static String choice = "y";
    public static String category;

    public static void main(String[] args)
    {
        //start program with greetings and input
        System.out.println("Welcome to the Movie Lister" + "\n" + "\n" + "There are 100 movies in the list");

        //Extra line to look cleaner
        System.out.println();
        displayCategories();
        MovieDB.getAllMovies();
        //Extra line to look cleaner
        System.out.println();

        while(choice.equalsIgnoreCase("y"))
        {

            System.out.print("What category are you interested in?: ");
            category = in.nextLine();

            //code to initialize categories
            if (category.equalsIgnoreCase("animated"))
            {
                //Extra line to look cleaner
                System.out.println();
                MovieDB.getMovies(category);
            }
            else if (category.equalsIgnoreCase("drama"))
            {
                //Extra line to look cleaner
                System.out.println();
                MovieDB.getMovies(category);
            }
            else if (category.equalsIgnoreCase("horror"))
            {
                //Extra line to look cleaner
                System.out.println();
                MovieDB.getMovies(category);
            }
            else if (category.equalsIgnoreCase("musical"))
            {
                //Extra line to look cleaner
                System.out.println();
                MovieDB.getMovies(category);
            }
            else if (category.equalsIgnoreCase("scifi") || category.equalsIgnoreCase("sci-fi"))
            {
                //Extra line to look cleaner
                System.out.println();
                MovieDB.getMovies(category);
            }
            else if (category.equalsIgnoreCase("all"))
            {
                //Extra line to look cleaner
                System.out.println();
                MovieDB.getFullMovies();
            }
            else
            {
                System.out.println("Error! Not a valid command.\n");
            }

            //Extra line to look cleaner
            System.out.println();

            System.out.print("Continue? (y/n): ");
            choice = in.nextLine();
        }//End of While loop

        //Extra line to look cleaner
        System.out.println();

        System.out.println("Have a great day!");
        System.exit(0);
        in.close();

    }//End of main

    public static void displayCategories()
    {
        System.out.println("MOVIE GENRES");
        System.out.println("Animated    - Cartoons and Disney type stuff");
        System.out.println("Drama       - Intense drama...you may cry");
        System.out.println("Horror      - Turn off the lights");
        System.out.println("Musical     - Singing and more singing");
        System.out.println("Sci-Fi      - X-files and crazy imaginations");
        System.out.println("All         - Display all of our movies");
    }//end of displayCategories

}//End of MovieLister