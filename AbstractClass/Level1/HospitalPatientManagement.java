class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(701, "Rohit", 45, "Appendicitis", 5);
        Patient p2 = new OutPatient(702, "Meera", 30, "Flu", 1);
        Patient[] patients = {p1, p2};
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            System.out.println("Records: "); 
            if (p instanceof MedicalRecord) ((MedicalRecord)p).viewRecords();
            System.out.println("-------------------");
        }
    }
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    public Patient(int patientId, String name, int age){ this.patientId = patientId; this.name = name; this.age = age; }
    public int getPatientId(){ return patientId; }
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public void getPatientDetails(){ System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age); }
    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private int daysAdmitted;
    private java.util.List<String> records = new java.util.ArrayList<>();
    public InPatient(int id, String name, int age, String diagnosis, int days) {
        super(id,name,age);
        this.diagnosis = diagnosis; this.daysAdmitted = days;
        addRecord("Admitted for: " + diagnosis);
    }
    @Override public double calculateBill() { return daysAdmitted * 2000 + 5000; } // room+treatment
    @Override public void addRecord(String record){ records.add(record); }
    @Override public void viewRecords(){ for (String r: records) System.out.println(r); }
}

class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private java.util.List<String> records = new java.util.ArrayList<>();
    public OutPatient(int id, String name, int age, String diagnosis, int visits) {
        super(id,name,age);
        this.diagnosis = diagnosis;
        addRecord("Visit: " + diagnosis);
    }
    @Override public double calculateBill(){ return 500; } // consultation
    @Override public void addRecord(String record){ records.add(record); }
    @Override public void viewRecords(){ for (String r: records) System.out.println(r); }
}
