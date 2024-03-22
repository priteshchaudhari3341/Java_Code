package CoreJava;

public class MethodOverloading {
	
	//add method with 2 parameters
	
	public void add (int a, int b) {
		
		int c = a + b;
		
		System.out.println(c);
	}
	
	//add method with 3 parameters
	
		public void add (int a, int b, int c) {
			
			int d = a + b + c;
			
			System.out.println(d);
		}
		
		//add method with 4 parameters
		
			public void add (int a, int b, int c, int d) {
				
				int e = a + b + c + d;
				
				System.out.println(e);
			}
			
			//add method with 4 parameters
			
			public void add (int a, double b, int c, float d) {
				
				double e = a + b + c + d;
				
				System.out.println(e);
			}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.add(5, 6);
		obj.add(1, 2, 3);
		obj.add(4, 5, 6, 7);
		obj.add(3, 2453.2654, 8, 325476);

	}

}
