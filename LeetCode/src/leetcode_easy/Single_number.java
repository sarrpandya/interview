package leetcode_easy;

import java.util.HashSet;
import java.util.Iterator;

public class Single_number {
	public static int singleNumber(int[] A) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int n : A) {
			if (!set.add(n))
				set.remove(n);
		}
		Iterator<Integer> it = set.iterator();
		return it.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
		System.out.println(Single_number.singleNumber(arr));
	}

}
