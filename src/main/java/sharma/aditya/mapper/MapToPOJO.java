package sharma.aditya.mapper;

import sharma.aditya.models.HomeTeam;
import sharma.aditya.models.VisitingTeam;
import sharma.aditya.pojo.Match;

import java.util.List;

public class MapToPOJO {
    public List<Match> mapHomeTeam(List<HomeTeam> homeTeams) {
        return homeTeams.stream()
                .map(team -> new Match(team.getYear(), team.getTeam1(), team.getTeam1goals())).toList();
    }

    public List<Match> mapVisitingTeam(List<VisitingTeam> visitingTeams) {
        return visitingTeams.stream()
                .map(team -> new Match(team.getYear(), team.getTeam2(), team.getTeam2goals())).toList();
    }
}
