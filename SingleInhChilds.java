package CoreJava;

public class SingleInhChilds extends SingleInhParent{
	
	public void read() {
		
		System.out.println("Reading in child class");
	}

	public static void main(String[] args) {
		
		
		SingleInhChilds obj = new SingleInhChilds();
		
		obj.display();
		
		obj.read();
		

	}

}
