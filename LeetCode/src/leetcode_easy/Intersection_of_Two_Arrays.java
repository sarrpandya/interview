package leetcode_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Intersection_of_Two_Arrays {

	public static int[] interOfTwoArray(int[] num1, int[] num2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i : num1) {
			set1.add(i);
		}
		HashSet<Integer> set2 = new HashSet<Integer>();
		for (int i : num2) {
			set2.add(i);
		}
		Iterator<Integer> itr = set1.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			if (!set2.contains(i)) {
				itr.remove();

			}

		}
		int[] ans = new int[set1.size()];
		int i = 0;
		for (int x : set1) {
			ans[i++] = x;
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = { 1, 2, 2, 1 };
		int[] def = { 2, 2 };
		int[] f_ans = Intersection_of_Two_Arrays.interOfTwoArray(abc, def);
		System.out.println(Arrays.toString(f_ans));

	}

}
