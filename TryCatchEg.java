package CoreJava;

public class TryCatchEg {

	public static void main(String[] args) {
		
		try {
			
			// code to be executed
			
			int data = 100/0;
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}finally {
			
			//mandatory  code to be executed
			
			System.out.println("Exit the browser");
		}
	

	}

}
