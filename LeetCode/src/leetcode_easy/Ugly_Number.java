package leetcode_easy;

public class Ugly_Number {
	public static boolean isUgly(int num) {
		if (num == 0)
			return false;
		if (num == 1)
			return true;

		if (num % 2 == 0) {
			num = num / 2;
			return isUgly(num);
		}

		if (num % 3 == 0) {
			num = num / 3;
			return isUgly(num);
		}

		if (num % 5 == 0) {
			num = num / 5;
			return isUgly(num);
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		System.out.println(Ugly_Number.isUgly(n));
	}

}
