package sharma.aditya.pojo;

public class Match {
    private String year;
    private String team;
    private int goals;

    public Match(String year, String team, int goals) {
        this.year = year;
        this.team = team;
        this.goals = goals;
    }

    public String getYear() {
        return year;
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }
}
