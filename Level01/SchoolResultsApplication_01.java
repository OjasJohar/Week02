import java.util.ArrayList; 
import java.util.List;
// Main class to test the program
public class SchoolResultsApplication_01{
	
	public static void main(String[] args){
		Student student1=new Student("John");
		
		//Creates subjects
		Subject subject1=new Subject("Maths");
		Subject subject2=new Subject("Science");
		
		//Add marks
		GradeCalculator marks1=new GradeCalculator(90, subject1);
		GradeCalculator marks2=new GradeCalculator(85, subject2);
		
		//displaying grades
		marks1.displayGrades(subject1);
		marks2.displayGrades(subject2);
	}
}
// Class representing a Student
class Student{
	private String name; 
 
    //Constructor
	public Student(String name) { 
        this.name = name;  
    } 
	//getter method
	public String getName() { 
        return name; 
    } 
}
// Class representing a Subject
class Subject{
	private String subjectName; 
	
    //parameterized constructor
	public Subject(String subjectName){ 
        this.subjectName = subjectName;    
    }
	//getter method
	public String getSubject(){
		return subjectName;
	}
}
// Class GradeCalculator
class GradeCalculator{
	private int marks;
	private List<Subject> subjects;
	
	//constructor
	public GradeCalculator(int marks, Subject subject){
		this.marks=marks;
		this.subjects = new ArrayList<>();
	}
	public String grades(){
		if(marks>80){
			return "A";
		}else if(marks>60){
			return "B";
		}else if(marks>40){
			return "C";
		}else
			return "F";
	}
	//method to display details
	public void displayGrades(Subject subject) { 
        subjects.add(subject); 
        System.out.println(subject.getSubject() + " has marks " + marks); 
		System.out.println("So The grade is : "+ grades());
    } 
}