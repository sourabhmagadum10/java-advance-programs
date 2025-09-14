package advancejava;

public class FactoryMethodEx {

	private int a;
	private  FactoryMethodEx( ) {
		
	}
	
	private FactoryMethodEx(int a) {
		this.a= a;
	}
	
	static FactoryMethodEx obj;
	public static FactoryMethodEx getFactoryMethod() {
		if(obj == null)
			obj= new FactoryMethodEx();
		else
			return null;
		return obj;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a= a;
	}
	
}
