package advancejava;

public class EmployeeFactroyMethod {
	
	private String name;
	private int empId;
	private int salary;
	
	private EmployeeFactroyMethod() {
		
	}
	
	private EmployeeFactroyMethod(int empId, String name, int salary) {
		this.empId= empId;
		this.name= name;
		this.salary= salary;
	}
	
	static EmployeeFactroyMethod obj;
	
	public static EmployeeFactroyMethod getEmp() {
		obj= new EmployeeFactroyMethod();
		return obj;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setEmpId(int empId) {
		this.empId= empId;
	}
	
	public void setSalary(int salary) {
		this.salary= salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
}
