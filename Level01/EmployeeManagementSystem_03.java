public class  EmployeeManagementSystem_03{
	
	public static void main(String[] args){
		//Creating class object
		Employee employee=new Employee("Ojas", "111-211034", "Manager");
		Employee.displayDetails(employee);
		
		Employee employee1=new Employee("Om", "111-221030", "Analyst");
		Employee.displayDetails(employee1);
		
		Employee employee2=new Employee("Anush", "111-221031", "Developer");
		Employee.displayDetails(employee2);
		
		Employee.displayTotalEmployees();
	}
}
//Creating Employee class
class Employee{
	
	//static variable 
	static String companyName="Capgemini";
	static int totalEmployee;	
	//final variable 
	final String id;
	
	//Attributes(fields)
	String name, designation;

	//static method 
	public static void displayTotalEmployees(){
		System.out.println("Total Employees : "+ totalEmployee);
	}
	
	//parameterized constructor
	Employee(String name, String id, String designation){
		this.name=name;
		this.id=id;
		this.designation=designation;
		totalEmployee++;
	}
	//Method to display result
	public static void displayDetails(Employee employee){
		if(employee instanceof Employee){
		    System.out.println("-------Employee Details-------");
			System.out.println("Company Name        : "+companyName);//static variable
		    System.out.println("Employee Name       : "+employee.name);//non-static variable
		    System.out.println("Employee id         : "+employee.id);//non-static variable
			System.out.println("Employee designation: "+employee.designation);//non-static variable
		    System.out.println("--------------------------------");	
	    } else
			System.out.println("Object is not an instance of class ");	
	}
}