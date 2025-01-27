package employee_management_system;

public abstract class Employee {

    private String employeeId;
    private String name;
    private int baseSalary;

    Employee(String employeeId, String name, int baseSalary){
        setEmployeeId(employeeId);
        setBaseSalary(baseSalary);
        setName(name);
    }

    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId=employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary=baseSalary;
    }

    abstract public void calculateSalary();

    public void displayDetails(){
        System.out.println("---Employee Details---");
        System.out.println("Employee ID  : "+getEmployeeId());
        System.out.println("Employee Name: "+getName());
        System.out.println("Base Salary  : "+getBaseSalary());
    }
}
