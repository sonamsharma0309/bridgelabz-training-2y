import java.util.*;
public class SportsTournamentScheduler {
    static class Team{ String name; int points; Team(String n,int p){this.name=n;this.points=p;} public int hashCode(){return name.hashCode();} public boolean equals(Object o){return o instanceof Team && ((Team)o).name.equals(name);} public String toString(){return name+":"+points;} }
    public static void main(String[] args){
        Set<Team> teams = new HashSet<>();
        teams.add(new Team("T1",3)); teams.add(new Team("T2",6));
        Queue<String> matches = new LinkedList<>();
        matches.add("T1 vs T2");
        List<String> results = new ArrayList<>();
        TreeSet<Team> ranking = new TreeSet<>((a,b)-> Integer.compare(b.points,a.points));
        ranking.addAll(teams);
        System.out.println("Ranking: " + ranking);
    }
}
