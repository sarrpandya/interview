package leetcode_easy;

public class power_of_four {
	public static boolean isPowerOfFour(int num) {
		if (num < 1) {
			return false;
		}

		while (num % 4 == 0) {
			num /= 4;
		}

		return num == 1;

	}

	public static void main(String[] args) {
		System.out.println(power_of_four.isPowerOfFour(16));
	}
}
