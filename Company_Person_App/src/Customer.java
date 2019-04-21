public class Customer extends Person
{

    public String customerNumber;

    public Customer(String customerNumber)
    {

    }

    public String getCustomerNumber()
    {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    public String getDisplayText()
    {
        return super.toString() + "\n" + "Customer Number: " + customerNumber;
    }

}//End of Customer