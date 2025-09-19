
// Problem 3: Company and Departments (Composition)
import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void showEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showDepartment() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class Problem3_CompanyDepartments {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        d2.addEmployee(new Employee("Charlie"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
    }
}
