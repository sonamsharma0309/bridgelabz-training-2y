import java.util.Random;

public class EmployeeBonus {
    static int[][] employees=new int[10][2]; 
    static int[][] newData=new int[10][3];  

    static void generateData(){
        Random r=new Random();
        for(int i=0;i<10;i++){
            employees[i][0]=10000+r.nextInt(90000); 
            employees[i][1]=1+r.nextInt(15); 
        }
    }

    static void calculateBonus(){
        for(int i=0;i<10;i++){
            double bonus=(employees[i][1]>5)?0.05:0.02;
            int b=(int)(employees[i][0]*bonus);
            int ns=employees[i][0]+b;
            newData[i][0]=employees[i][0];
            newData[i][1]=b;
            newData[i][2]=ns;
        }
    }

    static void display(){
        int total=0;
        System.out.println("Salary\tBonus\tNew Salary");
        for(int i=0;i<10;i++){
            System.out.println(newData[i][0]+"\t"+newData[i][1]+"\t"+newData[i][2]);
            total+=newData[i][1];
        }
        System.out.println("Total Bonus = "+total);
    }

    public static void main(String[] args) {
        generateData();
        calculateBonus();
        display();
    }
}

