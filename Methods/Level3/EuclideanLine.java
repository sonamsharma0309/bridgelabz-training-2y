import java.util.Scanner;

public class EuclideanLine {
    static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    static void equation(int x1,int y1,int x2,int y2){
        double m=(double)(y2-y1)/(x2-x1);
        double c=y1-m*x1;
        System.out.println("y = "+m+"x + "+c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt(),y1=sc.nextInt();
        int x2=sc.nextInt(),y2=sc.nextInt();
        System.out.println("Distance = "+distance(x1,y1,x2,y2));
        equation(x1,y1,x2,y2);
    }
}

