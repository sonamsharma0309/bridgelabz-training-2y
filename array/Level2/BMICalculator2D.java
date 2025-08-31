import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double h, w;
            while (true) {
                System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
                h = sc.nextDouble();
                System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
                w = sc.nextDouble();
                if (h > 0 && w > 0) break;
                System.out.println("Invalid input, try again.");
            }
            personData[i][0] = h;
            personData[i][1] = w;
            personData[i][2] = w / (h * h);
            if (personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + "\t" + personData[i][1] + "\t" +
                               String.format("%.2f", personData[i][2]) + "\t" + weightStatus[i]);
        }
    }
}

