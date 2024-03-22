package CoreJava;

public class StringsEg {

	public static void main(String[] args) {
		
		String S1 = "Delhi";
		
		String S2 = "Zoo";
		
		//Split
		
		String [] arrstr = S1.split(",");
		
		for(String a : arrstr) {
		
			System.out.println(a);	
		}
		
		//equals - checking if the Strings are same
		
		System.out.println(S1.equals(S2));//boolean value - false
		
		//EqualsIgnorecase
		
		System.out.println(S1.equalsIgnoreCase(S2));//true
		
		System.out.println(S1 == S2);
		
		//merging of 2 string - concatenation
		
		System.out.println(S1.concat(S2));
		
		//sub string
		
		//System.out.println(S1.substring(5));
		
		//comparesTo
		
		//if s1 > s2 - positive number
		//if s1 < s2 - negative number
		//if s1 == s2 - return 0
		
		System.out.println(S1.compareTo(S2));
		
		//contains
		
		System.out.println(S1.contains("Zoo"));//true
		
		//ends with
		
		System.out.println(S1.endsWith("i"));//false
		
		//replace
		
		System.out.println(S1.replace("New", "Old"));
		
		//join
		
		String S3 = "Bangalore";
		
		String S4 = S3.join("/", "Mysore");
		
		System.out.println(S4);
		
		System.out.println(S1.isEmpty());
		
		

	}

}
