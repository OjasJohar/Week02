import java.util.ArrayList;
import java.util.List;

class CompanyAndDepartments_03{
	
	public static void main(String []args){
		
		Company company1 = new Company("SAP Lab");
		Company company2 = new Company("Amazon");
		
		Department department1 = new Department("IT Department");
		Department department2 = new Department("Testing Department");
		Department department3 = new Department("HR Department");
		
		Employee employee1 = new Employee("OM Tamrakar");
		Employee employee2 = new Employee("Anush Tenguriya");
		Employee employee3 = new Employee("Ojas Johar");
		Employee employee4 = new Employee("Sejal Chauhan");
		
		department1.addEmployee(employee1);
		department1.addEmployee(employee2);
		department2.addEmployee(employee2);
		department2.addEmployee(employee3);
		department3.addEmployee(employee4);
		department3.addEmployee(employee3);
		
		company1.addDepartment(department1);
		company1.addDepartment(department2);
		company2.addDepartment(department3);
		company2.addDepartment(department1);
		
		company1.displayCompany();
		
		company1.deleteCompany();
		
		company2.displayCompany();
		
		company2.deleteCompany();
     	}
	}

class Company{
	private String companyName;
	private List<Department> departments;
	
	Company(String companyName){
		this.companyName = companyName;
		this.departments = new ArrayList<>();
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void addDepartment(Department department){
			departments.add(department);
	
	}
	
	public void displayCompany(){
		System.out.println("The company is : "+ companyName);
		for(Department department: departments){
			department.displayDepartment();
			System.out.println();
		}
		
	}
	public void deleteCompany(){
		departments.clear();
		System.out.println("The Company "+companyName+" is deleted!");
		System.out.println();
	}
	
}

class Department{
	private String departmentName;
	private List<Employee> employee;
	
	Department(String departmentName){
		this.departmentName = departmentName;
		this.employee = new ArrayList<>();
	}
	
	public void addEmployee(Employee employees){
		employee.add(employees);
	}
	
	public String getDepartmentName(){
		return departmentName;
	}
	public List<Employee> getEmployees(){
		return employee;
	}
	public void displayDepartment(){
		System.out.println("Departmenet is :"+departmentName);
		for(Employee employees: employee){
			employees.displayEmployeeDetails();
		}
	}
}

class Employee{
	
	private String employeeName;
	
	Employee(String employeeName){
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName(){
		return employeeName;
	}
	public void displayEmployeeDetails(){
		System.out.println("The Employee name : "+employeeName);
	}
}