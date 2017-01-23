package leetcode_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ransom_number {
	public static boolean canConstruct(String ransomNote, String magazine) {

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		ArrayList<Character> al = new ArrayList<Character>();
		for (char c : ransomNote.toCharArray()) {
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		}
		for (char c1 : magazine.toCharArray()) {
			if (!map1.containsKey(c1)) {
				al.add(c1);
			}
			else if (map1.get(c1) > 1) {
				map1.put(c1, map1.get(c1) - 1);
			} else {
				map1.remove(c1);
			}
		}

		if (!map1.isEmpty()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ransom_number.canConstruct("aa", "aab"));
	}

}
