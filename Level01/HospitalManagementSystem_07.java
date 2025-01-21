//craeting HospitalmanagementSystem class
public class HospitalManagementSystem_07{
	
	public static void main(String[] args){
		
	    Patient patient1=new Patient("Anush Tenguriya",21, "Headache");
		Patient.displayDetails(patient1);
		
		Patient patient2=new Patient("Ojas Johar",21, "Diariea");
		Patient.displayDetails(patient2);
		
		System.out.println("\nTotal Number of patients  :" + Patient.getTotalPatients());
	}
}
//creating Patient class
class Patient{
	static String hospitalName="AIMS";
	String name;
	int age;
	String ailment;
	final int patientId;
	static int totalPatients=0;
	
	//constructor
	Patient(String name, int age, String ailment){
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		totalPatients++;
		patientId=100+totalPatients;
	}
	
	//method to get total Patients
	public static int getTotalPatients(){
		return totalPatients;
	}
	
	//method to display details
	public static void displayDetails(Patient patient){
	    if(patient instanceof Patient){
		    System.out.println("\n-----Patient Details-----");
			System.out.println("Patient Name      :" + patient.name);
			System.out.println("Patient ID        :" + patient.patientId);
			System.out.println("Patient age       :" + patient.age);
			System.out.println("Patient ailment   :" + patient.ailment);
			System.out.println("Hospital Name     :" + patient.hospitalName);
	    }else{
			System.out.println("Given Object is not an instance of Patient class");
		}
	}
}