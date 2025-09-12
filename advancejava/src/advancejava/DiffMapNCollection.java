package advancejava;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DiffMapNCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<Integer>();
		/*
		 * Differnence is access the data from map is faster than collection
		 */
		for(int i= 0; i<1000; i++) {
			al.add(i);	
		}
		long start1= System.nanoTime();
		al.contains(900);
		long end1= System.nanoTime();
		
		HashMap<Integer, Integer> ma= new HashMap<Integer, Integer>();
		for(int i= 0; i<1000; i++) {
			ma.put(i, i);
		}
		
		long start= System.nanoTime();
		
		ma.get(1000);
		
		long end= System.nanoTime();
		
		if((end1-start1 )>(end- start))
			System.out.println("Map is faster " + (end-start));
		 
		else 
			System.out.println("List is faster " +end1);
	}

}
