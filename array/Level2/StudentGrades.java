import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            int p, c, m;
            while (true) {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                p = sc.nextInt();
                System.out.print("Enter Chemistry marks: ");
                c = sc.nextInt();
                System.out.print("Enter Maths marks: ");
                m = sc.nextInt();
                if (p >= 0 && c >= 0 && m >= 0) break;
                System.out.println("Invalid input, try again.");
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentage[i] = (p + c + m) / 3.0;
            if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else if (percentage[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(physics[i] + "\t" + chemistry[i] + "\t\t" + maths[i] + "\t" +
                               String.format("%.2f", percentage[i]) + "\t\t" + grade[i]);
        }
    }
}
