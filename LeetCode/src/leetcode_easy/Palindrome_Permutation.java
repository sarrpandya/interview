package leetcode_easy;

import java.util.HashSet;
import java.util.Set;

public class Palindrome_Permutation {

	/*
	 * Our approach is to check that each character appears an even number of
	 * times, allowing for only one characters to appear an odd number of times
	 * (a middle character). This is enough to determine if a permutation of the
	 * input string is a palindrome.
	 * 
	 * We iterate through each character in the input string, keeping track of
	 * the characters we’ve seen an odd number of times using a hash set
	 * unpairedCharacters.
	 * 
	 * As we iterate through the characters in the input string:
	 * 
	 * If the character is not in unpairedCharacters, we add it. If the
	 * character is already in unpairedCharacters, we remove it. Finally, we
	 * just need to check if less than two characters don’t have a pair.
	 */

	public static boolean palindromepurmatation(String str) {

		Set<Character> p_hashser = new HashSet<Character>();

		for (char c : str.toCharArray()) {
			if (p_hashser.contains(c)) {
				p_hashser.remove(c);
			} else {
				p_hashser.add(c);
			}
		}

		return p_hashser.size() <= 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "civic";

		System.out.println(Palindrome_Permutation.palindromepurmatation(str));

	}

}
