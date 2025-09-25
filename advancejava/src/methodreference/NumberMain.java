package methodreference;

public class NumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number n= MathOperation::addFive;
		double c=n.num(12);
		System.out.println(c);
		
		Number n1= MathOperation::multiply;
		double d=n1.num(2);
		System.out.println(d);
		
		MathOperation m= new MathOperation();

		Number n3= m::divide;
		d=n3.num(10);
		System.out.println(d);

	}
	

}
