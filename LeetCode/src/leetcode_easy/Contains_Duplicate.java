package leetcode_easy;

import java.util.HashSet;

public class Contains_Duplicate {
	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.add(i)) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 2,3 };
		System.out.println(Contains_Duplicate.containsDuplicate(arr));

	}

}
