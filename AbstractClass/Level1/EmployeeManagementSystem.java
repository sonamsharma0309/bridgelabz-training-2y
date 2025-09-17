class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1001, "Aman", 50000, "Engineering");
        Employee e2 = new PartTimeEmployee(1002, "Sara", 250, 80, "HR"); // 250 per hour, 80 hours
        Department.assignDepartment(e1, "Engineering");
        Department.assignDepartment(e2, "HR");
        Employee[] employees = {e1, e2};
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println("-------------------------");
        }
        Employee.displayTotalEmployees();
    }
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    private static int totalEmployees = 0;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        totalEmployees++;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", BaseSalary: " + baseSalary);
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

class FullTimeEmployee extends Employee {
    private String department;
    public FullTimeEmployee(int employeeId, String name, double baseSalary, String department) {
        super(employeeId, name, baseSalary);
        this.department = department;
    }
    @Override
    public double calculateSalary() {
        // simple: baseSalary + 20% allowance
        return getBaseSalary() * 1.20;
    }
    public String getDepartment() { return department; }
    public void setDepartment(String d) { department = d; }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    private String department;
    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked, String department) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public String getDepartment() { return department; }
    public void setDepartment(String d) { department = d; }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
    static void assignDepartment(Employee e, String dept) {
        if (e instanceof FullTimeEmployee) ((FullTimeEmployee)e).setDepartment(dept);
        else if (e instanceof PartTimeEmployee) ((PartTimeEmployee)e).setDepartment(dept);
    }
}
