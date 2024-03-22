package CoreJava;

public class HierChildClass_2 extends HeirParent{
	
public void mul() {
		
		System.out.println("multplying in child class2");
	}

	public static void main(String[] args) throws InterruptedException {
		
		HierChildClass_2 obj = new HierChildClass_2();
		
		obj.mul();
		obj.sum();

	}

}
