package CoreJava;

public class HybridInhChild2 extends HybridInhParent{
	
public void mul() {
		
		System.out.println("multiplaying in child class2");
	}

	public static void main(String[] args) {
		
HybridInhChild2 obj = new HybridInhChild2();
		
		obj.write();
		
		obj.mul();
		

	}

}
