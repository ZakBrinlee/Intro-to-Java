public class Employee extends Person
{

    public String SSN;

    public Employee(String SSN)
    {

    }

    public String getSSN()
    {
        return SSN;
    }

    public void setSSN(String sSN)
    {
        SSN = sSN;
    }

    public String getDisplayText()
    {
        return super.toString() + "\n" +  "Social Security Number: " + SSN;
    }
}//End of Employee