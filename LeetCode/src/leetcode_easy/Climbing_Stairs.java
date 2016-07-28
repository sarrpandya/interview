package leetcode_easy;

public class Climbing_Stairs {
	public static int climbStairs(int n) {
		if (n < 0) {
			return 0;
		}
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < n + 1; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Climbing_Stairs.climbStairs(2));

	}

}
