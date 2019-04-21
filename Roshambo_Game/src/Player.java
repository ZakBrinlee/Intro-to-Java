public abstract class Player
{
    public static String playerName;
    public static String playerThrow;

    //Need to find a way to make the array from the enum class

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        Player.playerName = playerName;
    }

    public String getPlayerThrow()
    {
        return playerThrow;
    }

    public void setPlayerThrow(String playerThrow)
    {
        Player.playerThrow = playerThrow;
    }

}//End of Player