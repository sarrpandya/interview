package leetcode_easy;

public class Repeated_Substring_Pattern {
	public static boolean repeatedSubstringPattern(String str) {
		String s = str + str;
		return s.substring(1, s.length() - 1).contains(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Repeated_Substring_Pattern.repeatedSubstringPattern("abab"));
	}

}
