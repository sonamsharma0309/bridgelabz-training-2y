import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] castVotes = {"A", "B", "A", "C", "A", "B", "C", "A", "B", "C"};
        
        for (String v : castVotes)
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        
        String winner = Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey();
        
        System.out.println("Vote Results: " + votes);
        System.out.println("Winner: " + winner);
    }
}