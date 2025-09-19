
// Self Problem 2: University with Faculties and Departments (Composition and Aggregation)
import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

class DepartmentU {
    private String deptName;

    public DepartmentU(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() { return deptName; }
}

class University {
    private String name;
    private List<DepartmentU> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentU d : departments) {
            System.out.println("- " + d.getDeptName());
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getName());
        }
    }
}

public class Problem5_UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University uni = new University("Global University");

        DepartmentU d1 = new DepartmentU("Computer Science");
        DepartmentU d2 = new DepartmentU("Physics");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();
    }
}
