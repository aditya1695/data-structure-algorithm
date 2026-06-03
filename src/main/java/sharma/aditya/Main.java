package sharma.aditya;

import com.fasterxml.jackson.databind.json.JsonMapper;
import sharma.aditya.mapper.MapToPOJO;
import sharma.aditya.models.ApiResponseHT;
import sharma.aditya.models.ApiResponseVT;
import sharma.aditya.pojo.Match;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String year = "2011";
        String team = "Barcelona";
        int pageNo = 1;
        int totalGoalsWhenHomeTeam;
        int totalGoalsWhenVisitingTeam;

        boolean isHomeTeam = true;
        List<Match> matches;
        String urlVisitingTeam = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team2=" + team + "&page=" + pageNo;
        String urlHomeTeam = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team1=" + team + "&page=" + pageNo;

        matches = fetchMatchDetails(urlHomeTeam, isHomeTeam);
        totalGoalsWhenHomeTeam = findTotalGoals(matches, year, team);
        matches = fetchMatchDetails(urlVisitingTeam, false);
        totalGoalsWhenVisitingTeam = findTotalGoals(matches, year, team);
        System.out.println("Answer(Total Goals): "+ (totalGoalsWhenHomeTeam+totalGoalsWhenVisitingTeam));

    }

    private static List<Match> fetchMatchDetails(String uri, Boolean isHomeTeam){

        JsonMapper mapper = new JsonMapper();
        ApiResponseHT apiResponseHT;
        ApiResponseVT apiResponseVT;
        List<Match> matches = new ArrayList<>();
        MapToPOJO mapToPOJO = new MapToPOJO();
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(isHomeTeam) {
                apiResponseHT = mapper.readValue(response.body(), ApiResponseHT.class);
                matches = mapToPOJO.mapHomeTeam(apiResponseHT.getData());
            }
            else {
                apiResponseVT = mapper.readValue(response.body(), ApiResponseVT.class);
                matches = mapToPOJO.mapVisitingTeam(apiResponseVT.getData());
            }


        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return matches;
    }

    private static int findTotalGoals(List<Match> matches, String year, String teamName) {
        return matches.stream().filter(match -> match.getYear().equals(year) && match.getTeam().equals(teamName))
                .mapToInt(Match::getGoals).sum();
    }
}