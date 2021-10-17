import java.util.*;

class Program1 {
    public int HOME_TEAM_WON = 1;

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBest = "";
        
        // create hashmap to store scores
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put(currentBest, 0);
        
        // logic
        for (int idx = 0; idx < competitions.size(); idx++) {
            ArrayList<String> competition = competitions.get(idx);
            int result = results.get(idx);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

            // helper method
            updateScores(winningTeam, 3, scores);

        }

        return currentBest;
    }

    // create helper function
}