package lambdaexperssion;

public class FunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails e= new EmployeeDetails(1,"ajay");
		
		
		Function<String, Integer> obj= (a)->{
			return a.length();
		};
		
		System.out.println(obj.apply(null));
		
		Function<EmployeeDetails, Boolean> obj1= (e1)->{
			return e1.getName().contains("a");
		};
		System.out.println(obj1.apply(e));
	}

}
