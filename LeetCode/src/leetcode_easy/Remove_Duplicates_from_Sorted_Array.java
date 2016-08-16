package leetcode_easy;

import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_Array {
	public static int removeDuplicates(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int temp : nums) {
			set.add(temp);
		}
		return set.size();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2 };
		System.out.println(Remove_Duplicates_from_Sorted_Array.removeDuplicates(arr));

	}

}
