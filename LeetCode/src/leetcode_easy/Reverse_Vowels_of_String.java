package leetcode_easy;

import java.util.ArrayList;

public class Reverse_Vowels_of_String {
	public static String reverseVowels(String s) {
		ArrayList<Character> ac = new ArrayList<Character>();
		ac.add('a');
		ac.add('e');
		ac.add('i');
		ac.add('o');
		ac.add('u');
		ac.add('A');
		ac.add('E');
		ac.add('I');
		ac.add('O');
		ac.add('U');

		char[] c = s.toCharArray();
		int i = 0;
		int j = s.length()-1;
		while (i < j) {
			if (!ac.contains(c[i])) {
				i++;
				continue;
			}
			if (!ac.contains(c[j])) {
				j--;
				continue;
			}
			char t = c[i];
			c[i] = c[j];
			c[j] = t;

			i++;
			j--;
		}
		return new String(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "leetcode";
		System.out.println(Reverse_Vowels_of_String.reverseVowels(str));

	}

}
