package leetcode_easy;

import java.util.Arrays;

public class Move_Zeros {

	// i track 0 and j tracks non 0
	public static int[] moveZeroes(int[] nums) {
		int i = 0;

		for (int j = 1; j < nums.length; j++) {
			if (nums[j] == 0) {
				continue;
			} else {
				nums[i] = nums[j];
				i++;

			}
		}
		// convert element into 0
		while (i < nums.length) {
			nums[i] = 0;
			i++;
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
