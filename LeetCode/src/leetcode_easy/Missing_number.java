package leetcode_easy;

public class Missing_number {
	public static int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		int n = nums.length;
		return n * (n + 1) / 2 -sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0,1,2,4 };
		System.out.println(Missing_number.missingNumber(arr));
	}

}
