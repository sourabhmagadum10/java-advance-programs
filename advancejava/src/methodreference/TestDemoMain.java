package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Syntax for static method reference
		Demo d= TestDemo::print;
		d.m1();
		
		//Syntax for non-static method reference
		TestDemo t=  new TestDemo();
		Demo d1 =t::printf;
		d1.m1();
		
		List a= new ArrayList();
		a.add(10);
		a.add(20);
		a.add(12);
		a.add(15);
		a.add(25);
		Consumer c= System.out::println;
		a.forEach(c);
	}

}
