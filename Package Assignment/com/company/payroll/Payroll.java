
package com.company.payroll;
import com.company.hr.Employee;
public class Payroll {
    public void calculateBonus(Employee e){
        double newSalary = e.getSalary() + e.getSalary()*0.1;
        e.setSalary(newSalary);
    }
}
