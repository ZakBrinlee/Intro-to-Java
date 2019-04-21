import java.util.Scanner;

public class PersonApp
{
    public static String firstName;
    public static String lastName;
    public static String emailAddress;
    public static String SSN;
    public static String customerNumber;

    public static void main(String[] args)
    {
        getInput();
    }

    public static void getInput()
    {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        String selection = "";

        System.out.println("Welcome to the Person Tester application");

        //Extra line to look cleaner
        System.out.println();
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Create customer or employee? (c/e): ");
            selection = sc.nextLine();

            //Extra line to look cleaner
            System.out.println();

            System.out.print("Enter first name: ");
            firstName = sc.nextLine();
            System.out.print("Enter last name: ");
            lastName = sc.nextLine();
            System.out.print("Enter email address: ");
            emailAddress = sc.nextLine();


            if(selection.equalsIgnoreCase("e"))
            {
                System.out.print("Social Security number: ");

                SSN = sc.nextLine();
                Employee employee = new Employee(SSN);
                employee.setSSN(SSN);
                employee.setEmailAddress(emailAddress);
                employee.setFirstName(firstName);
                employee.setLastName(lastName);

                //Extra line to look cleaner
                System.out.println();
                System.out.println(employee.getDisplayText());
            }//End of if

            else if (selection.equalsIgnoreCase("c"))
            {
                System.out.print("Customer Number: ");

                customerNumber = sc.nextLine();
                Customer customer = new Customer(customerNumber);
                customer.setCustomerNumber(customerNumber);
                customer.setEmailAddress(emailAddress);
                customer.setFirstName(firstName);
                customer.setLastName(lastName);

                //Extra line to look cleaner
                System.out.println();
                System.out.println(customer.getDisplayText());

            }//End of else if


            //Extra line to look cleaner
            System.out.println();

            System.out.print("Continue? (y/n): ");
            choice=sc.nextLine();
            //Extra line to look cleaner
            System.out.println();
        }//End of while loop


        System.out.println("Bye!");
        System.exit(0);
        sc.close();
    }//End of main
}//End of PersonApp