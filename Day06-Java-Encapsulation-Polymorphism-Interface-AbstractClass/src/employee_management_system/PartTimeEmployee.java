package employee_management_system;

public class PartTimeEmployee extends Employee implements Department{
    private String department;

    PartTimeEmployee(String employeeId, String name, int baseSalary, String department){
        super(employeeId, name, baseSalary);
        assignDepartment(department);
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public void calculateSalary(){
        System.out.println("Salary of part time employee : "+ getBaseSalary()/2);
    }

    @Override
    public void assignDepartment(String department){
        this.department=department;
    }

    @Override
    public void getDepartmentDetails(){
        System.out.println("Part Time Employee's Department : "+ department);
    }
}
