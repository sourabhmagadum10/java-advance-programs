package advancejava;

public class Student implements Comparable {
	private int id;
	private String name;
	private String branch;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	public String toString() {
		return " id: " +id+" name:  "+name+ " branch: "+branch;
	}
	@Override
	public int compareTo(Object o) {
		Student s= (Student) o;
		return this.id -s.id ;
	}
	
	
}
