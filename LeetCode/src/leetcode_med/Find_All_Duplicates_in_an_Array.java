package leetcode_med;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_All_Duplicates_in_an_Array {
	public static List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> al = new ArrayList<Integer>();
		for (int i : nums) {
			if (map.containsKey(i)) {
				al.add(i);
			} else {
				map.put(i, 1);
			}
		}

		return al;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(Find_All_Duplicates_in_an_Array.findDuplicates(arr));
	}

}
