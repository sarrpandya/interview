package leetcode_easy;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
	
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while (set.add(n)) {

			/*
			 * logic of adding the sum value and check if last value comp to 1 
			 */
			int sum = 0;
			while (n > 0) {
				sum += (int) Math.pow(n % 10, 2);
				n = n / 10;

			}
			n = sum;
		}
		return n == 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		System.out.println(Happy_Number.isHappy(n));

	}

}
