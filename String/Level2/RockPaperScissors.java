import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        return (n == 0) ? "rock" : (n == 1) ? "paper" : "scissors";
    }

    public static int checkWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return 1;
        return -1;
    }

    public static String[][] playGames(int rounds) {
        Scanner sc = new Scanner(System.in);
        String[][] results = new String[rounds][3];
        int userWins = 0, compWins = 0;
        for (int i = 0; i < rounds; i++) {
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            int res = checkWinner(user, comp);
            if (res == 1) userWins++;
            else if (res == -1) compWins++;
            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = (res == 0) ? "Draw" : (res == 1) ? "User Wins" : "Computer Wins";
        }
        double userPer = (userWins * 100.0) / rounds;
        double compPer = (compWins * 100.0) / rounds;
        System.out.println("User Wins: " + userWins + " (" + userPer + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPer + "%)");
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        sc.nextLine();
        String[][] res = playGames(rounds);
        for (String[] r : res) System.out.println("User: " + r[0] + ", Comp: " + r[1] + ", Result: " + r[2]);
    }
}

