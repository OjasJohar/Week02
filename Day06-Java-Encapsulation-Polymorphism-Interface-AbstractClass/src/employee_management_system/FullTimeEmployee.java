package employee_management_system;

public class FullTimeEmployee extends Employee implements Department{
    private String department;

    FullTimeEmployee(String employeeId, String name, int baseSalary, String department){
        super(employeeId, name, baseSalary);
        assignDepartment(department);
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary of full time employee: "+ getBaseSalary());
    }

    @Override
    public void assignDepartment(String department){
        this.department=department;
    }
    @Override
    public void getDepartmentDetails(){
        System.out.println("Full Time Employee's Department : "+ department);
    }
}
