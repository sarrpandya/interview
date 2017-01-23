package leetcode_easy;

public class Longest_Common_Prefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
				j++;
			}

			if (j == 0) {
				return "";
			}
			prefix = prefix.substring(0, j);
		}

		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "aabab", "aab", "aa", "aaba" };
		System.out.println(Longest_Common_Prefix.longestCommonPrefix(str));

	}

}
