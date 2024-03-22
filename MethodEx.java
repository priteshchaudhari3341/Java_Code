package CoreJava;

public class MethodEx {

	// data - instance variable
	String s = "Core Java";
	static int n = 100;

	public static void add() {

		// a b c are the local variable

		// method body

		int a = 7;
		int b = 5;
		int c = a + b;

		System.out.println(c);
		
	}

	public void sub(int x, int y) {

		// parameterized method

		int z = x - y;
		System.out.println(z);

		// subtraction
		/*
		 * int x = 9; int y = 6;
		 * 
		 * 
		 * int z = x - y; System.out.println(z);
		 * 
		 * if (x==y) { System.out.println("x is equal to y");
		 * 
		 * }else { System.out.println("x is not equal to y"); }
		 */

	}

	public static void main(String[] args) {

		// object initialization and creation

		MethodEx obj = new MethodEx();
		add();
		obj.sub(7, 3);
		obj.sub(9, 3);
		System.out.println(obj);

	}

}
