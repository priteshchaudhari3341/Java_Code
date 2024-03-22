package CoreJava;

public class HierChildClass_1 extends HeirParent{

	public void sub() {
		
		System.out.println("substrcting in child class");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		HierChildClass_1 obj = new HierChildClass_1();
		
		obj.sum();
		obj.sub();

	}

}
