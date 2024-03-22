package CoreJava;

public class EncapsulationEg {

	// data - private

	// this is used to refer to current class instance variables

	private String name;

	private int EmpSalary;

	// setter method

	public void setName(String name) {

		this.name = name;

	}

	// getter method

	public String getname() {

		return name;

	}

	// setter method

	public void setSal(int sal) {

		this.EmpSalary = sal;

	}

	// getter method

	public int getSal() {

		return EmpSalary;

	}
}
