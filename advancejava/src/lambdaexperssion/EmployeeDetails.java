package lambdaexperssion;

public class EmployeeDetails {

	private int eId;
	private String name;
	
	public EmployeeDetails(int eId, String name) {
		super();
		this.eId = eId;
		this.name = name;
	}
	
	public EmployeeDetails() {
		
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
