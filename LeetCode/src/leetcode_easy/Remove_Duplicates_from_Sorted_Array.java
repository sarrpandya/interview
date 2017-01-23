package leetcode_easy;

import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_Array {
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2 };
		System.out.println(Remove_Duplicates_from_Sorted_Array.removeDuplicates(arr));

	}

}
