package hospital_patient_management;

public class InPatient extends Patient implements MedicalRecord {
    private final double dailyRate;
    private final int daysAdmitted;
    private final String diagnosis;
    private final StringBuilder medicalHistory;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted, String diagnosis) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.diagnosis = diagnosis;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: ");
        System.out.println(medicalHistory.toString());
    }
}


