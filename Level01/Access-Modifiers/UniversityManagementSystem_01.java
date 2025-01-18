// Main class to test the implementation
public class UniversityManagementSystem_01 {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(35, "Om", 8.5);
        System.out.println("Initial CGPA: " + student.getCGPA());

        // Modify CGPA using setter
        student.setCGPA(8.7);
        System.out.println("Updated CGPA: " + student.getCGPA());

        System.out.println("\nPostgraduate Student Example:");
        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(34, "Ojas", 8.4, "Artificial Intelligence");
        pgStudent.displayDetails();
    }
}

// Base class: Student
class Student {
    public int rollNumber;        // Public attribute
    protected String name;        // Protected attribute
    private double CGPA;          // Private attribute

    // Constructor
     Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.setCGPA(CGPA);      // Using setter 
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA with validation
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please provide a value between 0.0 and 10.0.");
        }
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String topic; // Attribute specific to PostgraduateStudent

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String topic) {
        super(rollNumber, name, CGPA); // Call to the parent constructor
        this.topic = topic;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // Accessing public member
        System.out.println("Name: " + name);             // Accessing protected member
        System.out.println("CGPA: " + getCGPA());        // Accessing private member via getter
        System.out.println("Thesis Topic: " + topic);
    }
}
