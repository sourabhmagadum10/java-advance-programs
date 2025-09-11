package advancejava;

import java.util.Comparator;

public class SortByName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s= (Student)o1;
		Student s1= (Student) o2;
		return s.getName().compareTo(s1.getName());
		
	}

}
