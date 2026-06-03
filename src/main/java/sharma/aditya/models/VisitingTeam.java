package sharma.aditya.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VisitingTeam {

    private String year;
    private String team2;
    private int team2goals;

    public String getYear() {
        return year;
    }

    public String getTeam2() {
        return team2;
    }

    public int getTeam2goals() {
        return team2goals;
    }
}