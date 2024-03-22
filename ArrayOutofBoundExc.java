package CoreJava;

public class ArrayOutofBoundExc {

	public static void main(String[] args) {
		
		try {
			
			int a[] = new int[5];
			
			a[8] = 90;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}

	}

}
