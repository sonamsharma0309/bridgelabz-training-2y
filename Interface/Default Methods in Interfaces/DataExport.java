// Scenario 2: Data Export Feature
interface ReportExporter {
    void exportToCSV();
    void exportToPDF();

    // New default method added for JSON export
    default void exportToJSON() {
        System.out.println("Exporting report to JSON (default implementation).");
    }
}

class SalesReport implements ReportExporter {
    public void exportToCSV() {
        System.out.println("Sales report exported to CSV.");
    }

    public void exportToPDF() {
        System.out.println("Sales report exported to PDF.");
    }
}

class EmployeeReport implements ReportExporter {
    public void exportToCSV() {
        System.out.println("Employee report exported to CSV.");
    }

    public void exportToPDF() {
        System.out.println("Employee report exported to PDF.");
    }

    // Override JSON export
    public void exportToJSON() {
        System.out.println("Employee report exported to JSON format (custom implementation).");
    }
}

public class DataExport {
    public static void main(String[] args) {
        ReportExporter sales = new SalesReport();
        sales.exportToCSV();
        sales.exportToPDF();
        sales.exportToJSON();

        ReportExporter emp = new EmployeeReport();
        emp.exportToCSV();
        emp.exportToPDF();
        emp.exportToJSON();
    }
}