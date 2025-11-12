import java.util.*;
public class OnlineGamingTournamentTracker {
    static class Player{ String id; int score; Player(String id,int s){this.id=id;this.score=s;} public int hashCode(){return id.hashCode();} public boolean equals(Object o){return o instanceof Player && ((Player)o).id.equals(id);} public String toString(){return id+"("+score+")";} }
    static class Match{}
    static class Result{}
    static class Score implements Comparable<Score>{ String id; int points; Score(String id,int p){this.id=id;this.points=p;} public int compareTo(Score o){ return Integer.compare(o.points,this.points); } public String toString(){return id+":"+points;} }
    public static void main(String[] args){
        Set<Player> players = new HashSet<>();
        players.add(new Player("P1",10)); players.add(new Player("P2",20));
        Queue<Match> matches = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();
        leaderboard.add(new Score("P2",20)); leaderboard.add(new Score("P1",10));
        System.out.println("Leaderboard: " + leaderboard);
    }
}
