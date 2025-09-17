class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;
    private String name, designation;
    private final int id;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 201, "Manager");
        Employee e2 = new Employee("Sara", 202, "Developer");
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
