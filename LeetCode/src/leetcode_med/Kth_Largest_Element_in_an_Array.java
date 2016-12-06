package leetcode_med;

import java.util.Arrays;

public class Kth_Largest_Element_in_an_Array {
	public static int[] sort(int[] nums) {

		if (nums == null || nums.length == 0) {
			return null;
		}

		int length = nums.length;
		return quickSort(0, length - 1, nums);

	}

	private static int[] quickSort(int lowerIndex, int higherIndex, int[] nums) {

		int left = lowerIndex;
		int right = higherIndex;

		int pivot = nums[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (left <= right) {

			while (nums[left] < pivot) {
				left++;
			}
			while (nums[right] > pivot) {
				right--;
			}
			if (left <= right) {
				exchangeNumbers(left, right, nums);

				left++;
				right--;
			}
		}
		if (lowerIndex < right)
			quickSort(lowerIndex, right, nums);
		if (left < higherIndex)
			quickSort(left, higherIndex, nums);
		return nums;
	}

	private static void exchangeNumbers(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	public static void swap(int[] nums, int n1, int n2) {
		int tmp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 8, 2, 7, 5 };
		int k = 2;
		int[] ans = Kth_Largest_Element_in_an_Array.sort(nums);
		int pos = ans[ans.length - k];
		System.out.println(pos);

	}

}
