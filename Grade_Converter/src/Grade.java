
public class Grade {
    public int number;
    String letterGrade;

    public Grade()
    {
        number = 0;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String letterGrade()
    {

        if (number <= 100 && number >= 88)
        {
            letterGrade = "A";
        }
        else if (number <=87 && number>=80)
        {
            letterGrade = "B";
        }
        else if (number <=79 && number>=67)
        {
            letterGrade = "C";
        }
        else if (number <=66 && number>=60)
        {
            letterGrade = "D";
        }
        else
        {
            letterGrade = "F";
        }
        return letterGrade;
    }//End of letterGrade

}//End of class