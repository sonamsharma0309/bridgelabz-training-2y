import java.util.*;

public class StudentGrades {
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = rand.nextInt(61) + 40;
        }
        return marks;
    }

    public static String getGrade(double per) {
        if (per >= 80) return "Level 4";
        else if (per >= 70) return "Level 3";
        else if (per >= 60) return "Level 2";
        else if (per >= 50) return "Level 1";
        else if (per >= 40) return "Level 1-";
        else return "Remedial";
    }

    public static String[][] calculateResults(int[][] marks) {
        String[][] result = new String[marks.length][5];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            String grade = getGrade(avg);
            result[i][0] = String.valueOf(marks[i][0]);
            result[i][1] = String.valueOf(marks[i][1]);
            result[i][2] = String.valueOf(marks[i][2]);
            result[i][3] = String.valueOf(Math.round(avg));
            result[i][4] = grade;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);
        String[][] res = calculateResults(marks);
        for (String[] r : res) 
            System.out.println("Physics: " + r[0] + ", Chemistry: " + r[1] + ", Math: " + r[2] + ", Avg: " + r[3] + ", Grade: " + r[4]);
    }
}
