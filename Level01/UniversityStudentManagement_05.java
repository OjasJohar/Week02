public class  UniversityStudentManagement_05{
	
	public static void main(String[] args){
		//Creating class object
		Student student=new Student("Ojas Johar", 111034, 'C');
		Student.displayDetails(student);
		
		Student student1=new Student("Anush Tenguriya", 111002, 'C');
		Student.displayDetails(student1);
		
		System.out.println("After updating grades : ");
		student.updateGrades('A');
		student1.updateGrades('B');
		Student.displayDetails(student);
		Student.displayDetails(student1);
		
		//Calling from class(student) becoz of static method.
		Student.displayTotalStudents();
	}
}
//Creating Student class
class Student{
	
	//static variable 
	static String universityName="TIT";
	static int totalStudents;
		
	//final variable 
	final int rollNumber;
	
	//Attributes(fields)
	char grade;
	String name;

	//static method 
	public static void displayTotalStudents(){
		System.out.println("Total number of students enrolled : "+ totalStudents);
	}
	
	//Parameterized constructor
	Student(String name, int rollNumber, char grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		totalStudents++;
	}
	//Method to update grades
	public void updateGrades(char grade){
		this.grade=grade;
	}
	//Method to display details
	public static void displayDetails(Student student){
		if(student instanceof Student){
		    System.out.println("------Student Details-----");
			System.out.println("Student Name    : "+student.name);//non-static variable
		    System.out.println("Roll Number     : "+student.rollNumber);//non-static variable
		    System.out.println("Grade           : "+student.grade);//non-static variable
			System.out.println("University Name : "+universityName);//static variable
		    System.out.println("--------------------------------");	
	    } else
			System.out.println("Object is not an instance of class ");	
	}
}	