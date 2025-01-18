import java.util.Scanner;

//Creating Student report class
public class Main{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the name of student : ");
		//taking input from the user
		String name= input.nextLine();
		
		System.out.println("Enter the roll number : ");
		//taking input from the user
		int rollNumber= input.nextInt();
		
		System.out.println("Enter the marks(0-100): ");
		//taking input from the user
		int marks=input.nextInt();
		
	    Student student=new Student(name, rollNumber, marks);
		
		student.calculateGrade();
		
		//Closing Scanner class
		input.close();
	}
}
//Creating class Student
class Student{
	//creating name, rollnumber, marks attributes
	String name;
	int rollNumber, marks;
	char grades;
	
	//constructor
	Student(String name, int rollNumber, int marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	//method to calculate grades
	void calculateGrade(){
		displayDetails();
		if(marks>89)
			grades='A';
		else if(marks>79)
			grades='B';
		else if(marks>69)
			grades='C';
		else if(marks>59)
			grades='D';
		else
			grades='F';
		System.out.println("Grades   : "+ grades);
		System.out.println("------------------------");
	}
	
	//method to displaying details of Student
	void displayDetails(){
		//method to display the result
		System.out.println("===Students's Details===");
		System.out.println("Name     : "+ name);
		System.out.println("Roll No. : "+ rollNumber);
		System.out.println("Marks    : "+ marks);
	}
}