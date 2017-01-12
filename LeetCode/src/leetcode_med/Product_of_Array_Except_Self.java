package leetcode_med;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0, tmp = 1; i < nums.length; i++) {
			result[i] = tmp;
			tmp *= nums[i];
		}
		for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
			result[i] *= tmp;
			tmp *= nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[] ans = Product_of_Array_Except_Self.productExceptSelf(arr);
		System.out.println(Arrays.toString(ans));
	}

}
