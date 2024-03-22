package CoreJava;

public class HybridInhChild1 extends HybridInhParent{
	
public void read() {
		
		System.out.println("reading in child class1");
	}

	public static void main(String[] args) {
		
		
		HybridInhChild1 obj = new HybridInhChild1();
		
		obj.write();
		
		obj.read();
		

	}

}
