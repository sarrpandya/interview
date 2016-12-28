package leetcode_easy;

import java.util.HashMap;
import java.util.Map.Entry;

public class demo {
	public static char findTheDifference(String s, String t) {

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		Character ans = null;
		for (char c : t.toCharArray()) {
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		}
		for (char c1 : s.toCharArray()) {
			if (map1.get(c1) > 1) {
				map1.put(c1, map1.get(c1) - 1);
			} else {
				map1.remove(c1);
			}
		}
		for (Entry<Character, Integer> entry : map1.entrySet()) {
		    return entry.getKey().toString().charAt(0);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "abcde";
		System.out.println(demo.findTheDifference(s1, s2));

	}

}
