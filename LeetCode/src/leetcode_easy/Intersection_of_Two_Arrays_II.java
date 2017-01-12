package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {
	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums1) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : nums2) {
			if (map.containsKey(i)) {
				if (map.get(i) > 1) {
					map.put(i, map.get(i) - 1);
				} else {
					map.remove(i);
				}
				list.add(i);
			}
		}

		int[] result = new int[list.size()];
		int i = 0;
		while (i < list.size()) {
			result[i] = list.get(i);
			i++;
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 2, 1,3 };
		int[] b = { 2, 2,3,4};
		int[] _ans = Intersection_of_Two_Arrays_II.intersect(a, b);
		System.out.println(Arrays.toString(_ans));

	}

}
