package CoreJava;

public class IfElseLadder {

	public static void ifelseladder(int marks) {

		if (marks < 35) {
			System.out.println("Fail");
		} else if (marks <= 35 && marks < 50) {
			System.out.println("Third grade");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("Second grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("First grade");
		} else if (marks >= 70) {
			System.out.println("Distiction grade");
		} else {
			System.out.println("Invalid grade");
		}
	}

	public static void main(String[] args) {

		ifelseladder(35);

	}

}
