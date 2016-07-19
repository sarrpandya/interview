package leetcode_easy;

import java.util.ArrayList;

public class Longest_increasing_subsequence {

	/*
	 * for each num in nums if(list.size()==0) add num to list 
	 * else if(num >last element in list) add num to list
	 * else replace the element in the
	 * list which is the smallest but bigger than num (Binary serach algo)
	 */

	public static int LIS(int[] arr) {
		if (arr.length == 0 || arr == null)
			return 0;

		ArrayList<Integer> al = new ArrayList<>();

		for (int n : arr) {
			if (al.size() == 0) {
				al.add(n);
			} else if (n > al.get(al.size() - 1)) {
				al.add(n);
			} else {
				int i = 0;
				int j = al.size() - 1;

				while (i < j) {
					int mid = (i + j) / 2;
					if (n > al.get(mid)) {
						i = mid + 1;
					} else {
						j = mid;
					}
				}
				al.set(j, n);
			}
		}
		return al.size();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9,1,3,7,5,0,20 };
		System.out.println(Longest_increasing_subsequence.LIS(arr));
	}

}
