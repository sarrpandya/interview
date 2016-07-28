package leetcode_easy;

import java.math.BigInteger;

public class Factorial {
	public static BigInteger fact(int n) {
		BigInteger fact = new BigInteger("1");
		BigInteger inc = new BigInteger("1");

		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);

		}

		return fact;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		System.out.println(Factorial.fact(n));

	}

}
