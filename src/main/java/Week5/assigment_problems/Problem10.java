import java.util.Arrays;

class Player implements Comparable<Player>
{
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    Player(String name, int matchesPlayed,
           double battingAverage, boolean injured)
    {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed)
    {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured)
    {
        return matchesPlayed >= 5 && !injured;
    }

    public int compareTo(Player other)
    {
        return Double.compare(
            other.battingAverage,
            battingAverage
        );
    }
}

class Problem10
{
    static String draftAndRank(Player[] players)
    {
        Player[] temp = new Player[players.length];
        int count = 0;

        for(int i = 0; i < players.length; i++)
        {
            if(Player.isDraftable(players[i].matchesPlayed) ||
               Player.isDraftable(players[i].matchesPlayed,
                                  players[i].injured))
            {
                temp[count] = players[i];
                count++;
            }
        }

        Player[] selected = Arrays.copyOf(temp, count);

        Arrays.sort(selected);

        String result = "";

        for(int i = 0; i < selected.length; i++)
        {
            result = result + (i + 1) + ". " +
                     selected[i].name;

            if(i < selected.length - 1)
                result = result + " | ";
        }

        return result;
    }

    public static void main(String[] args)
    {
        Player[] players =
        {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}