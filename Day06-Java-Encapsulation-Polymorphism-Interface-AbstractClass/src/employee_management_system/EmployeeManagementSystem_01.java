package employee_management_system;

public class EmployeeManagementSystem_01 {
    public static void main(String[] args){
        FullTimeEmployee fullTimeEmployee =new FullTimeEmployee("111AS034", "Ojas Johar", 75000, "IT");
        fullTimeEmployee.displayDetails();
        fullTimeEmployee.calculateSalary();
        System.out.println("Department : "+ fullTimeEmployee.getDepartment());

        PartTimeEmployee partTimeEmployee =new PartTimeEmployee("111AS002", "Anush Sharma", 10000, "Sales");
        partTimeEmployee.displayDetails();
        partTimeEmployee.calculateSalary();
        System.out.println("Department : "+ partTimeEmployee.getDepartment());
    }
}
