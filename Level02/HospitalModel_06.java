// Doctor class: Represents a doctor who can consult with multiple patients
import java.util.ArrayList;
import java.util.List;

// Demonstration
public class HospitalModel_06 {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Anush Tenguriya");
        Doctor doctor2 = new Doctor("Ojas Johar");

        // Create patients
        Patient patient1 = new Patient("Om Tamrakar");
        Patient patient2 = new Patient("Sejal Chouhan");

        // Associate doctors and patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display hospital information
        System.out.println(hospital.getHospitalName());

        System.out.println("Doctors:");
        for (Doctor doc : hospital.getDoctors()) {
            System.out.println("- " + doc.getName());
        }

        System.out.println("Patients:");
        for (Patient pat : hospital.getPatients()) {
            System.out.println("- " + pat.getName());
        }

        // Consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Check associations
        System.out.println(patient1.getName() + " is consulting with:");
        for (Doctor doc : patient1.getDoctors()) {
            System.out.println("- " + doc.getName());
        }

        System.out.println(patient2.getName() + " is consulting with:");
        for (Doctor doc : patient2.getDoctors()) {
            System.out.println("- " + doc.getName());
        }
    }
}
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional relationship
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting with " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " has no record of patient " + patient.getName());
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

// Patient class: Represents a patient who can consult with multiple doctors
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

// Hospital class: Acts as a container for doctors and patients
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public String getHospitalName() {
        return "Hospital: " + name;
    }
}