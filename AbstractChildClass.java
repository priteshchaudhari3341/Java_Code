package CoreJava;

public class AbstractChildClass extends AbstractEg{
	
	void display() {
		
		System.out.println("Displaying in child class");
	}

	public static void main(String[] args) {
		
		AbstractChildClass obj = new AbstractChildClass();
		
		obj.display();
		
		obj.dislaycolor();

	}

}
