package CoreJava;

public class CheckEvenorOdd {

	public void evenodd(int num) {

		if (num % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}

	public static void main(String[] args) {
		
		CheckEvenorOdd obj = new CheckEvenorOdd();
		
			obj.evenodd(8);

	}

}
