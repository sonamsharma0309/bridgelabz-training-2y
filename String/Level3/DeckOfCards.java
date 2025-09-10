import java.util.*;

class DeckOfCards {
    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    static String[] deck = new String[52];

    static void init() {
        int k = 0;
        for (String s : suits) for (String r : ranks) deck[k++] = r + " of " + s;
    }

    static void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            String t = deck[i]; deck[i] = deck[j]; deck[j] = t;
        }
    }

    static void distribute(int players, int n) {
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i+1) + ":");
            for (int j = 0; j < n; j++) System.out.println(" " + deck[i*n+j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt(), n = sc.nextInt();
        init(); shuffle(); distribute(players, n);
    }
}

