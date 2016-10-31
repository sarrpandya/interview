package leetcode_easy;

import java.util.HashSet;
import java.util.Set;

public class Valid_Palindrome {
	public static boolean palindromepurmatation(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
 
		for(int i = 0; i < s.length() ; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				return false;
			}
		}
 
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abb";
		System.out.println(Valid_Palindrome.palindromepurmatation(str));
	}

}
