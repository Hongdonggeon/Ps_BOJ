import java.util.HashMap;

public class ScoreTable {
    private HashMap<String, int[]> table = new HashMap<>();
    String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    int[][] scores = {{1,11}, {2},{3},{4},{5},{6},{7},{8},{9},{10},{10},{10},{10}};
    ScoreTable() {
        for(int i=0; i< ranks.length; i++) {
            table.put(ranks[i], scores[i]);
        }
    }

    public int[] score(Card card) {
        return table.get(card.getRank());
    }
}


