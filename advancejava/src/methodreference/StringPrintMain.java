package methodreference;

public class StringPrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPrint s= String::toUpperCase;
		String name=s.m1("santosh");
		System.out.println(name);
	}

}
