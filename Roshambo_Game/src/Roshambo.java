public enum Roshambo
{
    Rock("Rock", 1),
    Paper("Paper", 2),
    Scissors("Scissors", 3);

    private final String desc;
    private final int val;
    Roshambo(String description, int value)
    {
        desc = description;
        val = value;
    }
    public String toString()
    {
        return desc;
    }

    public int getValue()
    {
        return val;
    }

}//End of Roshambo