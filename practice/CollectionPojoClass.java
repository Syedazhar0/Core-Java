package practice;

public class CollectionPojoClass {
    private int playerid;
    private String playername;
    private int playerage;
    private String playerteam;


    public CollectionPojoClass(int playerid, String playername, int playerage, String playerteam) {
        this.playerid = playerid;
        this.playername = playername;
        this.playerage = playerage;
        this.playerteam = playerteam;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getPlayerage() {
        return playerage;
    }

    public void setPlayerage(int playerage) {
        this.playerage = playerage;
    }

    public String getPlayerteam() {
        return playerteam;
    }

    public void setPlayerteam(String playerteam) {
        this.playerteam = playerteam;
    }

    @Override
    public String toString() {
        return "practice7{" +
                "playerid=" + playerid +
                ", playername='" + playername + '\'' +
                ", playerage=" + playerage +
                ", playerteam='" + playerteam + '\'' +
                '}';
    }
}
