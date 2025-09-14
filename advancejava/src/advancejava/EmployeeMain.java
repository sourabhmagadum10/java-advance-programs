package advancejava;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeFactroyMethod obj= EmployeeFactroyMethod.getEmp();
		System.out.println(obj);
		obj.setEmpId(10);
		System.out.println(obj.getEmpId());
	}

}
