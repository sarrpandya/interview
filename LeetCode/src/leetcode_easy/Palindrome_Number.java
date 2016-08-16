package leetcode_easy;

import java.util.HashSet;
import java.util.Set;

public class Palindrome_Number {
	public static boolean isPalindrome(int x) {
		int palindrome = x;
		int reverse = 0;
		if (palindrome < 0) {
			return false;
		}
		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		if (x == reverse) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 121;
		System.out.println(Palindrome_Number.isPalindrome(p));

	}

}
