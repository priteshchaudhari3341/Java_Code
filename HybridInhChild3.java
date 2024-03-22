package CoreJava;

public class HybridInhChild3 extends HybridInhChild1 {
	
	public void sum() {
		
		System.out.println("suming in child class3");
	}

	public static void main(String[] args) {
		
		HybridInhChild3 obj = new HybridInhChild3();
		
        obj.write();
		
		obj.read();
		
		obj.sum();

	}

}
