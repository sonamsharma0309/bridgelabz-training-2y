// 1. Program to Display Employee Details
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Sonam", 101, 50000);
        e.display();
    }
}
