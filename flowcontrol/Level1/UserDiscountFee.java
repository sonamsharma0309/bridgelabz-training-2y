import java.util.Scanner;

public class UserDiscountFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = fee * discountPercent / 100.0;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount);
        System.out.println("The final discounted fee is INR " + finalFee);
    }
}

