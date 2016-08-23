package leetcode_easy;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove_Element {
	public static int removeElement(int[] nums, int val) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al_new = new ArrayList<Integer>();
		for (int i : nums) {
			al.add(i);
		}
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) != val) {
				al_new.add(al.get(i));
			}
		}
		return al_new.size();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		int[] arr = { 2,3,3,2};
		int val = 3;

		System.out.println(Remove_Element.removeElement(arr, val));

	}

}
