import java.util.ArrayList;
import java.util.List;

// Demonstration
public class UniversityFacultiesAndDepartment_05 {
    public static void main(String[] args) {
        // Create independent faculty members
        Faculty faculty1 = new Faculty("Dr. Ojas");
        Faculty faculty2 = new Faculty("Dr. Johar");

        // Create a university and add departments
        University university = new University("RGPV University");
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Add faculty members to the university (Aggregation)
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display information
        System.out.println(university.getUniversityName());
        System.out.println("Departments: ");
        for (Department d : university.getDepartments()) {
            System.out.println("- " + d.getName());
        }

        System.out.println("Faculty Members: ");
        for (Faculty f : university.getFacultyMembers()) {
            System.out.println("- " + f.getName());
        }

        // Deleting university (should delete associated departments)
        university.deleteUniversity();

        // Faculty members should still exist independently
        System.out.println("Faculty Members after university deletion: ");
        System.out.println("- " + faculty1.getName());
        System.out.println("- " + faculty2.getName());
    }
}

// Faculty class: Represents faculty members who can exist independently of a department
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class: Departments are part of the University (composition relationship)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// University class: Owns the departments (composition relationship) and aggregates faculty
class University {
    private String name;
    private List<Department> departments; // Composition relationship
    private List<Faculty> facultyMembers; // Aggregation relationship

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }

    
    public String getUniversityName() {
		String str="University: " + this.name;
        return str;
    }

    // Explicit cleanup to delete associated departments (Composition)
    public void deleteUniversity() {
        System.out.println("Deleting university: " + name);
        departments.clear();
        System.out.println("All departments deleted.");
    }
}
