package leetcode_easy;

import java.util.Stack;

public class Sort_Stack {
	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		while (!s.isEmpty()) {
			int tmp = s.pop();
			while (!r.isEmpty() && r.peek() > tmp) {
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}

	public static void main(String[] args) {
		int[] s = { 3,2,5,1 };
		Stack<Integer> ss = new Stack<Integer>();
		for (int i : s) {
			ss.add(i);
		}
		System.out.println(Sort_Stack.sort(ss));
	}

}
