package advancejava;

public class Employee {
	private int empid;
	private String name;
	private String place;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid= empid;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place= place;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public Employee(int empid, String name, String place, int age) {
		super();
		this.empid= empid;
		this.name= name;
		this.place= place;
		this.age= age; 
	}
	

}
