package leetcode_easy;

import java.util.HashMap;
import java.util.Stack;

public class Valid_Parentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.add(c);
			} else if (c == ')') {
				if (stack.size() == 0 || stack.pop() != '(') {
					return false;
				}
			} else if (c == ']') {
				if (stack.size() == 0 || stack.pop() != '[') {
					return false;
				}
			} else if (c == '}') {
				if (stack.size() == 0 || stack.pop() != '{') {
					return false;
				}
			} 
		} // for i
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Valid_Parentheses.isValid("()[]{}"));
	}

}
