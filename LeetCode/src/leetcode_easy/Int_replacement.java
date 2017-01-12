package leetcode_easy;

public class Int_replacement {

	public static int integerReplacement(int n) {
		return (int) longReplacement(n);
	}

	public static long longReplacement(long n) {
		if (n < 3)
			return n - 1;
		if (n % 2 == 0)
			return longReplacement(n / 2) +1 ;
		else
			return Math.min(longReplacement(n - 1), longReplacement(n + 1)) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Int_replacement.integerReplacement(8));
	}

}
