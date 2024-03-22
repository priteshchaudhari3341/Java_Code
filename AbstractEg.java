package CoreJava;

abstract class AbstractEg {
	
	// non abstract classes - method body and signature
	
	// abstract classes - method signature
	
	public void dislaycolor() {
		
		String color = "pink";
		
		System.out.println("Displaying color in parent class" + " "+color);
	}
	
	abstract void display();
	

}
