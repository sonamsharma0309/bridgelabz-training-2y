import java.util.*;

class BMIProgram {
    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][2];
        String[][] res = new String[10][4];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
            double bmi = arr[i][0] / ((arr[i][1] / 100) * (arr[i][1] / 100));
            res[i][0] = String.valueOf(arr[i][0]);
            res[i][1] = String.valueOf(arr[i][1]);
            res[i][2] = String.format("%.2f", bmi);
            res[i][3] = getStatus(bmi);
        }
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (String[] r : res) System.out.println(String.join("\t", r));
    }
}

