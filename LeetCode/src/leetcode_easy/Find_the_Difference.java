package leetcode_easy;

public class Find_the_Difference {
	public static char findTheDifference(String s, String t) {
		char ans = 0;
		for (int i = 0; i < s.length(); i++) {
			ans ^= s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			ans ^= t.charAt(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "abcde";
		System.out.println(Find_the_Difference.findTheDifference(s, t));

	}

}
