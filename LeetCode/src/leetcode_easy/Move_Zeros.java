package leetcode_easy;

import java.util.Arrays;

public class Move_Zeros {

	// i track 0 and j tracks non 0
	public static int[] moveZeroes(int[] nums) {
		int j = 0;
		// int j = 0;

		// while (j < nums.length) {
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {
				continue ;
			} else {
				nums[j] = nums[i];
				j++;
			}
		}
		// convert element into 0
		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}
		return nums;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 3, 12 };
		int[] ans = Move_Zeros.moveZeroes(arr);
		System.out.println(Arrays.toString(ans));
	}

}
