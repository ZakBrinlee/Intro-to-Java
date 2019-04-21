import java.util.Random;

public class Lisa extends Player
{
    public static String lisaRosh;

    public static void generateRoshambo()
    {
        Roshambo action[] = Roshambo.values();
        Roshambo result = action[new Random().nextInt(action.length)];

        System.out.println("Lisa: " + result);

        lisaRosh = result.toString();
    }
}//End of Lisa