package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {
	public static List<String> fizzBuzz(int n) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if ((i % 3) == 0 && (i % 5) == 0) {
				al.add("FizzBuzz");
			} else if (i % 5 == 0) {
				al.add("Buzz");
			} else if (i % 3 == 0) {
				al.add("Fizz");
			} else {
				al.add(String.valueOf(i));
			}
		}
		return al;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fizz_Buzz.fizzBuzz(15));

	}

}
