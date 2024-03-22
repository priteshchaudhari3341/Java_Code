package CoreJava;

public class HeirParent {
	
	//throws keywords - declares the exception - it will tell the user that there might be a type of exception.
	
	public void sum() throws InterruptedException {
		
		System.out.println("summing in parent class");
		
		Thread.sleep(5000);
	}

}
