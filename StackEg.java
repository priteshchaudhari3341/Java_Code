package CoreJava;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		
		//LIFO
		
		//push, pop, search, sort
		
		Stack<Integer> stk = new Stack<>();
		
		boolean result = stk.empty();
		
		System.out.println(result);
		
		//push the elements to the stack
		
		stk.push(89);
		
		stk.push(45);
		
		stk.push(20);
		
		stk.push(12);
		
		stk.push(100);
		
		//print the elements of the stack
		
		System.out.println("Elements in the stack:"+ stk);
		
        boolean result1 = stk.empty();
		
		System.out.println(result1);
		

	}

}
