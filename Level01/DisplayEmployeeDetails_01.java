public class Main{
	
	public static void main(String[] args){
		//Create Employee object
		Employee employee=new Employee("Ojas Johar", 001, 100000);
		//Calling method
		employee.displayDetails();
	}
}

//Class Definition
//Creating class Employee
class Employee{
	//Creating Fields(Attributes) 
	String name;
    int	id, salary;
	
	//Parameterized Constructor
	Employee(String name, int id, int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	//Method to display employee details
	void displayDetails() { 
	    System.out.println("=== Employee Details ===");
		System.out.println("Name: "+ name +"\nId: "+ id +"\nSalary: "+ salary);
	}
}