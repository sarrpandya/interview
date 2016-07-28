package leetcode_easy;

public class Prime_number {

	public static boolean isPrimeNumber(int n) {

		if (n <= 1) {
			return false;
		}
		for (int j = 2; j < n; j++) {
			if (n % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i = 1; i <= n; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);

			}
		}

	}

}
