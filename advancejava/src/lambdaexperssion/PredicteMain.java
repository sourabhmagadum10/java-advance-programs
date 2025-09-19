package lambdaexperssion;

import java.time.LocalDate;
import java.util.Date;

public class PredicteMain {
// functional program
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails obj1= new EmployeeDetails(1,"Vijay");
		Supplier<Integer> obj= ()->{
			return 10;
		};
		
		System.out.println(obj.get());
		
		Supplier<Date> d= ()->{
			return new Date();
		};
		System.out.println(d.get());
		
		Supplier<LocalDate> d1= ()->{
			return LocalDate.now();
		};
		System.out.println(d1.get());
		
		Supplier<EmployeeDetails> emp = ()->{
			return obj1;
		};
		
		System.out.println(emp.get().geteId());
	}

}
