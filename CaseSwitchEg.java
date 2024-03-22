package CoreJava;

public class CaseSwitchEg {

	public static void main(String[] args) {
		
		int number = 100;
		
		//switch expression
		
		switch(number) {
		
		//case statement
		case 10:
			System.out.println("10");
		break;
		case 20:
			System.out.println("20");
		break;
		case 30:
			System.out.println("30");
		break;
		case 40:
			System.out.println("40");
		break;
		
		//deafault statement 
		
		default:System.out.println("not is 10 nor 20 nor 30 nor 40");
		
		}
	}

}
