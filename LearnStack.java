package List;

import java.util.Stack;

public class LearnStack {

	private static String item;

	public static void main(String[] args) {
		Stack<String> animals=new Stack<String>();
		animals.push(item="Lion");
		animals.push(item="dog");
		animals.push(item="cat");
		animals.push(item="horse");
		System.out.println("Stack:" +animals);
		
		System.out.println(animals.peek());
		animals.pop();
		System.out.println("Stack:" +animals);
		System.out.println(animals.peek());
	}

}
