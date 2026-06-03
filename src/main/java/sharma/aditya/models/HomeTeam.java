package sharma.aditya.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HomeTeam {

    private String year;
    private String team1;
    private int team1goals;

    public String getYear() {
        return year;
    }

    public String getTeam1() {
        return team1;
    }

    public int getTeam1goals() {
        return team1goals;
    }
}
