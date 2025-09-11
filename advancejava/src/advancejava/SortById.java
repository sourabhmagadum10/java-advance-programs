package advancejava;

import java.util.Comparator;

public class SortById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s= (Student) o1;
		Student s1= (Student)o2;
		return s.getId()- s1.getId();
	}

}
