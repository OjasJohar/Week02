import java.util.ArrayList;
import java.util.List;

// UniversityManagementSystem class: Demonstrates the interactions among students, professors, and courses
public class UniversityManagementSystem_08 {
	
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Anush Tenguriya");
        Student student2 = new Student("Ojas Johar");

        // Create professors
        Professor professor1 = new Professor("Dr. Vivek Sharma");
        Professor professor2 = new Professor("Dr. Manoj Tyagi");

        // Create courses
        Course course1 = new Course("Computer Science ");
        Course course2 = new Course("Mathematics ");

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display course information
        System.out.println("Courses and their professors:");
        System.out.println(course1.getName() + " - Taught by: " + course1.getProfessor().getName());
        System.out.println(course2.getName() + " - Taught by: " + course2.getProfessor().getName());

        System.out.println("\nStudents enrolled in courses:");
        for (Student s : course1.getStudents()) {
            System.out.println(s.getName() + " is enrolled in " + course1.getName());
        }
        for (Student s : course2.getStudents()) {
            System.out.println(s.getName() + " is enrolled in " + course2.getName());
        }

        System.out.println("\nProfessor's assigned courses:");
        for (Course c : professor1.getCourses()) {
            System.out.println(professor1.getName() + " teaches " + c.getName());
        }
        for (Course c : professor2.getCourses()) {
            System.out.println(professor2.getName() + " teaches " + c.getName());
        }

        System.out.println("\nStudent's enrolled courses:");
        for (Course c : student1.getCourses()) {
            System.out.println(student1.getName() + " is enrolled in " + c.getName());
        }
        for (Course c : student2.getCourses()) {
            System.out.println(student2.getName() + " is enrolled in " + c.getName());
        }
    }
}

class Student {
    private String studentName;
    private List<Course> courses;

    public Student(String name) {
        this.studentName = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return studentName;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Ensure bidirectional relationship
        }
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Professor class: Represents a professor who can teach multiple courses
class Professor {
    private String professorName;
    private List<Course> courses;

    public Professor(String name) {
        this.professorName = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return professorName;
    }

    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setProfessor(this); // Ensure bidirectional relationship
        }
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Course class: Represents a course with enrolled students and an assigned professor
class Course {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
