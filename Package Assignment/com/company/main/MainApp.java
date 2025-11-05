
package com.company.main;
import com.company.hr.Employee;
import com.company.payroll.Payroll;
public class MainApp {
    public static void main(String[] args){
        Employee e = new Employee(1, "Sonam", "HR", 50000);
        Payroll p = new Payroll();
        p.calculateBonus(e);
        System.out.println("Employee: " + e.getName() + ", Dept: " + e.getDepartment() + ", Salary after bonus: " + e.getSalary());
    }
}
