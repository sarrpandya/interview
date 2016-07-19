package leetcode_easy;

import java.util.Arrays;

public class Move_Zeros {
	
	// i track 0 and j tracks non 0
	public static int[] moveZeroes(int[] nums) {
		int i = 0;
		int j = 0;

		while (j < nums.length) {
			if (nums[j] == 0) {
				j++;
			} else {
				nums[i] = nums[j];
				i++;
				j++;
			}
		}
//convert element into 0
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
