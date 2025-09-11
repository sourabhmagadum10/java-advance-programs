package advancejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student(4, "allen", "ENTC");
		Student s1= new Student(2, "mask", "CSC");
		Student s2= new Student(1, "jon", "BA");
		Student s3= new Student(3,"sanju","Mcom");
		
		List <Student> l1= new ArrayList<Student>();
		l1.add(s);
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
//		Collections.sort(l1);
//		System.out.println(l1);
		
//		Collections.sort(l1, new SortById());
//		System.out.println(l1);
		Collections.sort(l1, new SortByName());
		
		System.out.println("sdfghs"+l1);
	}

}
