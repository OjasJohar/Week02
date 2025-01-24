import java.util.ArrayList;
import java.util.List;

public class SchoolAndStudentsWithCourses_04{
	
	public static void main(String[] args){
		
		Student student1=new Student("Anush Tenguriya");
		Student student2=new Student("Ojas Johar");
		Student student3=new Student("Om Tamrakar");
		Student student4=new Student("Sejal Chouhan");
		
		Course course1=new Course("Computer Science");
		Course course2=new Course("Artificial Intelligence");
		Course course3=new Course("Data Science");
		Course course4=new Course("Machine learning");
		
		School school=new School("TIT");
		
		
		//enrolling student in a course
		school.enrollStudent(student1);
		school.enrollStudent(student2);
		school.enrollStudent(student3);
		school.enrollStudent(student4);
		
		student1.enrollCourse(course1);
		student1.enrollCourse(course2);
		student1.enrollCourse(course3);
		
		student2.enrollCourse(course1);
		student2.enrollCourse(course2);
		
		student3.enrollCourse(course3);
		student3.enrollCourse(course1);
		student3.enrollCourse(course4);
		
		student4.enrollCourse(course1);
		student4.enrollCourse(course2);
		
		
		System.out.println("\nSchool Name: " + school.getSchoolName());
		System.out.println("Students who study in school:" );
		for(Student s: school.getStudents()){
			System.out.println("\nStudent Name:" + s.getStudentName());
			System.out.println("Enrolled courses: ");
			for(Course c: s.getCourses()){
				System.out.println(c.getCourseName());
			}
		}		
	}
}

class Student{
	private String studentName;
	private List<Course> courses;
	
	Student(String studentName){
		this.studentName=studentName;
		courses=new ArrayList<>();
	}
	
	public void enrollCourse(Course course){
		if(!courses.contains(course)){
			courses.add(course);
			course.enrollStudent(this);
		}
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public String getStudentName(){
		return this.studentName;
	}
}

class Course{
	private String courseName;
	private List<Student> students;
	
	Course(String courseName){
		this.courseName=courseName;
		students=new ArrayList<>();
	}
	
	public void enrollStudent(Student student){
		if(!students.contains(student)){
			students.add(student);
			student.enrollCourse(this);
		}
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public String getCourseName(){
		return courseName;
	}		
}

class School{
	private String schoolName;
	private List<Student> students;
	
	School(String schoolName){
		this.schoolName=schoolName;
		students=new ArrayList<>();
	}
	
	public void enrollStudent(Student student){
		if(!students.contains(student)){
			students.add(student);
		}
	}
	
	public String getSchoolName(){
		return this.schoolName;
	}
	
	public List<Student> getStudents(){
		return students;
	}
}