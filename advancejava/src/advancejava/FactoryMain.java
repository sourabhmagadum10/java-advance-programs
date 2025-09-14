package advancejava;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FactoryMethodEx.getFactoryMethod());
		FactoryMethodEx ex= FactoryMethodEx.getFactoryMethod();
		System.out.println(ex);
		FactoryMethodEx ex1= FactoryMethodEx.getFactoryMethod();
		System.out.println(ex1);
	}

}
