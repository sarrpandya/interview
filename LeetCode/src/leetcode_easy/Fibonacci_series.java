package leetcode_easy;

import java.util.Arrays;

public class Fibonacci_series {
	public static int[] fb(int n) {
		int[] arr1 = { 1 };
		if (n == 1) {
			return arr1;
		}
		int[] ans = new int[n];
		ans[0] = 1;
		ans[1] = 1;
		for (int i = 2; i < n; i++) {
			ans[i] = ans[i - 1] + ans[i - 2];
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] f_ans = Fibonacci_series.fb(n);
		System.out.println(Arrays.toString(f_ans));

	}

}
