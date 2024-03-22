package CoreJava;

public class InterfaceChildClass implements InterfaceEg {

	public void empName() {

		System.out.println("Employee name is Ravi");

	}

	public void empdept() {

		System.out.println("Employee dept is CSE");

	}

	public void empBU() {

		System.out.println("Employee BU is HR");

	}

	public static void main(String[] args) {

		InterfaceChildClass obj = new InterfaceChildClass();

		obj.empName();
		obj.empdept();
		obj.empBU();

	}

}
