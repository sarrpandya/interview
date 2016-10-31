package leetcode_easy;

import java.util.HashSet;
import java.util.Set;

public class Longest_Palindrome {
	public static int longestPalindrome(String s) {
		
		Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        int odd = set.size();
        return s.length() - (odd == 0 ? 0 : odd - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Longest_Palindrome.longestPalindrome("dccaweweccdxyz"));
	}

}
