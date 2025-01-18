import java.util.Scanner;

public class PersonImpl_03{
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the First name of person:");
		String firstName=scanner.nextLine(); 

		//taking input
		System.out.println("Enter the Last name of person:");
		String lastName=scanner.nextLine();	

		//taking input
		System.out.println("Enter the address:");
		String address=scanner.nextLine();

        //taking input
		System.out.println("Enter the mobile number:");
		String mobileNumber=scanner.nextLine();			

        //creating class object with parameterized constructor
		System.out.println("\nObject created using parameterized constructor:");
        Person person1=new Person(firstName,lastName,address,mobileNumber);
		person1.displayDetails();
         
        //creating class object with copy constructor
		System.out.println("\nObject created using copy constructor:");
        Person person2=new Person(person1);
        person2.displayDetails();	

        scanner.close();		
	}
}
class Person{
	String firstName;
	String lastName;
	String address;
    String mobileNumber;
	
	//parameterized constructor
	Person(String firstName, String lastName, String address, String mobileNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.mobileNumber=mobileNumber;
	}
	
	//copy constructor
	Person(Person p){
		this.firstName=p.firstName;
		this.lastName=p.lastName;
		this.address=p.address;
		this.mobileNumber=p.mobileNumber;
	}
	
	public void displayDetails(){
		System.out.println("-----Person Details-----");
		System.out.println("First Name     : " + firstName);
		System.out.println("Last Name      : " + lastName);
		System.out.println("Address        : " + address);
		System.out.println("Mobile Number  : " + mobileNumber);
		System.out.println("----------------------");
	}
}