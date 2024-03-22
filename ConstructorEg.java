package CoreJava;

public class ConstructorEg {

	// default constructor

	ConstructorEg() {

	}

	// Constructor overloading

	ConstructorEg(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println(num3);
	}

	ConstructorEg(double num1, int num2, int num3, int num4, int num5) {
		double num6 = num1 + num2 + num3 + num4 + num5;
		System.out.println(num6);
	}

	public void testcase1() {
		System.out.println("Testcase1");
	}

	public void testcase2() {
		System.out.println("Testcase2");
	}

	public static void main(String[] args) {

		ConstructorEg obj = new ConstructorEg(12, 15);

		ConstructorEg obj1 = new ConstructorEg(12.45, 15, 16, 25, 30);
		obj.testcase1();
		obj.testcase2();

	}

}
