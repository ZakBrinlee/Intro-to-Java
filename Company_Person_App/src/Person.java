public abstract class Person
{
    public String firstName;
    public String lastName;
    public String emailAddress;

    public Person()
    {

    }
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String toString()
    {
        String personInfo = "";

        personInfo += "You Entered: " + "\n" + "Name: " +  firstName + " " + lastName + "\n" + "Email: " + emailAddress;

        return personInfo;
    }

    public abstract String getDisplayText();


}//end of Person