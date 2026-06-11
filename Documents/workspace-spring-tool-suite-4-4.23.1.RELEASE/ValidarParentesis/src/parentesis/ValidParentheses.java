package parentesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
        System.out.println(validateParetheses("(())"));
    }
	
	private static boolean validateParetheses(String s) {
		boolean isCorrect = false;
		Map<Character, Character> mapCloseParenth = getClosePArentheses(); 
		Stack<Character> charStack = new Stack<>();
		
		for (int i = 0; i < s.toCharArray().length; i++) {
			if(s.toCharArray()[i] == '(' || s.toCharArray()[i] == '[' || s.toCharArray()[i] == '{') {
				charStack.push(s.toCharArray()[i]);
			}
			
			if(s.toCharArray()[i] == ')' || s.toCharArray()[i] == ']' || s.toCharArray()[i] == '}') {
				if(charStack.isEmpty()) {
					isCorrect = false;
					break;
				} 

				if(charStack.peek() != mapCloseParenth.get(s.toCharArray()[i])) {
					break;
				} 
				
				charStack.pop();
				isCorrect = true;
			}
			
		}
		
		if(charStack.isEmpty() && isCorrect) return true;
		
		return false;
	}

	private static Map<Character, Character> getClosePArentheses() {
		Map<Character, Character> mapCloseParenth = new HashMap<>();
		mapCloseParenth.put(')', '(');
		mapCloseParenth.put(']', '[');
		mapCloseParenth.put('}', '{');
		
		
		return mapCloseParenth;
	}
	
	
}
