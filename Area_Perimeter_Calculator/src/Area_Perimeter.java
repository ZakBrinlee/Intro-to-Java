public class Area_Perimeter {

    public static void main(String[] args)
    {
        System.out.println("Hello! Welcome to Assignment 2. \nWhere the program will calculate the perimeter and area of a rectangle.");
        //Spacer to make the program look cleaner
        System.out.println();
        //Declare values
        double width = 4.25;
        double length = 8.5;
        //Calculation for perimeter with value assigned
        double perimeter = 2 * width + 2 * length;
        //Calculation for area
        double area = width * length;

        System.out.println("Width: " +width);
        System.out.println("Length: " +length);
        System.out.println("Perimeter: " +perimeter);
        System.out.println("Area: " + area + " squared");

    }//End of main

}//End of class