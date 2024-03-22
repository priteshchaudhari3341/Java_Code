package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		
		//maintains the insertion order
		
		//allowed duplicate elements
		
		// non syncronized
		
		//doubly linked list
		
		//allow duplicate element
		
				//ordered collection
				
				//allows null values
				
				List<String> lst = new java.util.LinkedList<String>();
				
				lst.add("sam");
				
				lst.add("ravi");
				
				lst.add("sunny");
				
				lst.add("bunny");
				
				lst.add("sam");
				
				lst.add("");
				
				lst.add("john");
				
				lst.add("johnny");
				
				//Iterator
				
				Iterator itr = lst.iterator();
				
				while(itr.hasNext()) {
					
					System.out.println(itr.next());
				}
		

	}

}
