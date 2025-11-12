import java.util.*;
public class OnlineStreamingWatchHistory {
    static class Movie{ String title; String genre; Movie(String t,String g){this.title=t;this.genre=g;} public String toString(){return title;} }
    public static void main(String[] args){
        Stack<Movie> history = new Stack<>();
        List<Movie> all = new ArrayList<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();
        Movie m = new Movie("Frozen","Animation");
        all.add(m); upNext.add(m);
        // watch current
        Movie now = upNext.poll();
        history.push(now); genres.add(now.genre);
        System.out.println("Genres watched: " + genres);
    }
}
