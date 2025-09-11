import java.util.*;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=1,high=100,guess;
        String feedback="";
        while(!feedback.equals("correct")){
            guess=low+(int)(Math.random()*(high-low+1));
            System.out.println("Is it "+guess+"? (high/low/correct)");
            feedback=sc.next();
            if(feedback.equals("high")) high=guess-1;
            else if(feedback.equals("low")) low=guess+1;
        }
        System.out.println("Guessed correctly!");
    }
}

