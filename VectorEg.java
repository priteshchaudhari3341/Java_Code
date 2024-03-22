package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		
		        //syncronized in nature - syncronization process - locking of the process for the resources one by one
		
		        //allow duplicate element
		
				//ordered collection
				
				//allows null values
				
				Vector<String> v = new Vector<String> ();
				
				v.add("sam");
				
				v.add("ravi");
				
				v.add("sunny");
				
				v.add("bunny");
				
				v.add("sam");
				
				v.add("");
				
				v.add("john");
				
				v.add("johnny");
				
				//Iterator
				
				Iterator itr = v.iterator();
				
				while(itr.hasNext()) {
					
					System.out.println(itr.next());
				}
		

	}

}
