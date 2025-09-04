import java.util.Scanner;

class StudentVoteChecker {
    public static boolean canVote(int age) {
        if (age < 0) {
            System.out.println("Invalid age entered.");
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = sc.nextInt();

            if (canVote(age))
                System.out.println("Student " + i + " is eligible to vote.");
            else
                System.out.println("Student " + i + " is NOT eligible to vote.");
        }
    }
}

