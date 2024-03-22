package CoreJava;

public class CustomExceptions {
	
	public static void validateage(int age) {
		
		if(age<18) {
			
			// custom exceptions
			
			throw new ArithmeticException("Persion is not eligible for votting");
		}else {
			
			System.out.println("Persion is eligible for votting");
		}
	}

	public static void main(String[] args) {
		
		validateage(20);
		

	}

}
