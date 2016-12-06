package leetcode_med;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Sort_Characters_By_Frequency {
	public static String frequencySort(String s) {
		HashMap<Character, Integer> charFreqMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charFreqMap.containsKey(c)) {
				charFreqMap.put(c, charFreqMap.get(c) + 1);
			} else {
				charFreqMap.put(c, 1);
			}
			// charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
		}
		ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(charFreqMap.entrySet());
		list.sort(new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		//list.sort((Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2)->o1.getValue().compareTo(o2.getValue()));
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<Character, Integer> e : list) {
			for (int i = 0; i < e.getValue(); i++) {
				sb.append(e.getKey());
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabbcd";
		System.out.println(Sort_Characters_By_Frequency.frequencySort(str));
	}

}
