class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private String name, ailment;
    private int age;
    private final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Ankit", 30, "Fever", 501);
        Patient p2 = new Patient("Ritu", 25, "Cold", 502);
        p1.displayPatientDetails();
        p2.displayPatientDetails();
        Patient.getTotalPatients();
    }
}
