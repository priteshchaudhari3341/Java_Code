package CoreJava;

public class MultiInhChild2 extends MultiInhChild1{
	
	public void open() {
		System.out.println("opening in child class2");
	}

	public static void main(String[] args) {
		
		MultiInhChild2 obj = new MultiInhChild2();
		
		//parent 
		obj.write();
		
		//child1
		obj.show();
		
		//child2
		obj.open();

	}

}
