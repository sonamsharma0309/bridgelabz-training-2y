import java.util.*;
public class TemperatureConverter {
    static double toCelsius(double f){return (f-32)*5/9;}
    static double toFahrenheit(double c){return (c*9/5)+32;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:F->C  2:C->F");
        int ch=sc.nextInt();
        double val=sc.nextDouble();
        if(ch==1) System.out.println(toCelsius(val));
        else System.out.println(toFahrenheit(val));
    }
}

