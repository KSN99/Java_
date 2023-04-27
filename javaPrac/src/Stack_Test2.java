package collection_Framework;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_Test2 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage:java Stack_Test2 \"EXPRESSION\"");
			System.out.println("Example:java Stack_Test2 \"((2+3)*1)+3\"");
			System.exit(0);;
		}
		
		Stack st = new Stack<>();
		String expression = args[0];
		
		System.out.println("expression: "+expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch == '(') {
					st.push(ch +"");
				} else if (ch==')') {
					st.pop();
				}
			}
			if (st.isEmpty()) {
				System.out.println("괄호가 일치");
			}else {
				System.out.println("dismatch");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다");
		}
	}

}
