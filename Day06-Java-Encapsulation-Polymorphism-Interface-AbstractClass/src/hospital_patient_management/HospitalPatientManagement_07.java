package hospital_patient_management;

// Main class to test the implementation
public class HospitalPatientManagement_07 {
    public static void main(String[] args) {
        // Create an InPatient instance
        InPatient inPatient = new InPatient("P0034", "Ojas", 30, 500.0, 5, "Pneumonia");
        inPatient.addRecord("Admitted with severe symptoms.");
        inPatient.addRecord("Prescribed antibiotics.");

        // Create an OutPatient instance
        OutPatient outPatient = new OutPatient("P0035", "Johar", 40, 200.0, "Migraine");
        outPatient.addRecord("Routine checkup completed.");
        outPatient.addRecord("Medication prescribed for headaches.");

        // Display details and calculate bill dynamically
        System.out.println("--- InPatient Details ---");
        inPatient.getPatientDetails();
        inPatient.viewRecords();
        System.out.println("Total Bill: $" + inPatient.calculateBill());

        System.out.println("\n--- OutPatient Details ---");
        outPatient.getPatientDetails();
        outPatient.viewRecords();
        System.out.println("Total Bill: $" + outPatient.calculateBill());
    }
}
