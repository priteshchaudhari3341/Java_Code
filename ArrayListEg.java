package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {

	public static void main(String[] args) {
		
		//allow duplicate element
		
		//ordered collection
		
		//allows null values
		
		ArrayList<String> list = new ArrayList<String> ();
		
		list.add("sam");
		
		list.add("ravi");
		
		list.add("sunny");
		
		list.add("bunny");
		
		list.add("sam");
		
		list.add("");
		
		list.add("john");
		
		list.add("johnny");
		
		//Iterator
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		

	}

}
