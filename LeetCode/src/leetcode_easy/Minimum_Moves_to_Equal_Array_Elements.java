package leetcode_easy;

public class Minimum_Moves_to_Equal_Array_Elements {
	public static int minMoves(int[] nums) {
		if (nums.length == 0)
			return 0;
		int min = nums[0];
		for (int n : nums)
			min = Math.min(min, n);
		int res = 0;
		for (int n : nums)
			res += n - min;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		System.out.println(Minimum_Moves_to_Equal_Array_Elements.minMoves(arr));

	}

}
