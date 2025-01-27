package hospital_patient_management;

public class OutPatient extends Patient implements MedicalRecord {
    private final double consultationFee;
    private final String diagnosis;
    private final StringBuilder medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee, String diagnosis) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.diagnosis = diagnosis;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
