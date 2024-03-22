package CoreJava;

public class MethodOverridingChild {
	
	public void dislaycolor() {
		
	String color = "pink";
	
	System.out.println("Displaying color in child class" + " "+color);
}
	public static void main(String[] args) {
		
		MethodOverridingChild obj = new MethodOverridingChild();
		
		obj.dislaycolor();
		

	}

}
