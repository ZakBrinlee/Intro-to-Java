public class Player1 extends Player
{
    public static String playerName;
    public static String playerThrow;

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        Player1.playerName = playerName;
    }

    static void generateRoshambo()
    {
        System.out.println(playerName + ": " + playerThrow);
    }
}//End of Player1