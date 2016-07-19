package leetcode_easy;

public class Power_of_Three {

	public static boolean isPowerOfThree(int n) {
		if (n < 1) {
			return false;
		}

		while (n % 3 == 0) {
			n /= 3;
		}

		return n == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power_of_Three.isPowerOfThree(8));

	}

}
