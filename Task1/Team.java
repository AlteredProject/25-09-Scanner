import java.util.ArrayList;

class Team {
    private String teamName;
    private int teamRank;
    private ArrayList<String> playerNames = new ArrayList<>();

    //Constructor
    public Team(String teamName) {
        this.teamName = teamName;
    }

    //Methods
    public void setRank(int rankNum) {
        this.teamRank = rankNum;
    }

    public void addPlayer(String playerName) {
        this.playerNames.add(playerName);
    }

    @Override
    public String toString() {
        System.out.println("\nHold: " + this.teamName + "\tRang: " + this.teamRank);
        for (String player : playerNames) {
            System.out.println("- " + player);
        }
        return null;
    }
}