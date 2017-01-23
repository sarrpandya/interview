package leetcode_easy;

import java.util.HashMap;

public class valid_anagram {
	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			if (map.containsKey(c1)) {
				map.put(c1, map.get(c1) + 1);
			} else {
				map.put(c1, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char c2 = t.charAt(i);
			if (map.containsKey(c2)) {
				if (map.get(c2) > 1) {
					map.put(c2, map.get(c2) - 1);
				} else {
					map.remove(c2);
				}
			} else {
				return false;
			}
		}

		if (map.size() > 0)
			return false;

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "abbc";
		String two = "babcf";
		System.out.println(valid_anagram.isAnagram(one, two));

	}

}
