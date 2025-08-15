public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 5000;
        double rate = 5; // per year
        double time = 2; // years

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }
}

