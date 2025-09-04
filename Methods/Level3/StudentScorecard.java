import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // PCM
        int[] total = new int[n];
        double[] average = new double[n];
        double[] percentage = new double[n];

        // Generate random marks and calculate total, avg, percentage
        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(100); // Physics
            marks[i][1] = rand.nextInt(100); // Chemistry
            marks[i][2] = rand.nextInt(100); // Math

            total[i] = marks[i][0] + marks[i][1] + marks[i][2];
            average[i] = Math.round((total[i] / 3.0) * 100.0) / 100.0;
            percentage[i] = Math.round(((total[i] / 300.0) * 100) * 100.0) / 100.0;
        }

        // Display scorecard
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-12s%-10s\n", "Student", "Physics", "Chem", "Math", "Total", "Average", "Grade");
        for (int i = 0; i < n; i++) {
            String grade = getGrade(percentage[i]);
            System.out.printf("%-10s%-10d%-10d%-10d%-10d%-12.2f%-10s\n", "Student" + (i + 1), marks[i][0], marks[i][1], marks[i][2], total[i], average[i], grade);
        }

        sc.close();
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }
}
