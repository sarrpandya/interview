package leetcode_easy;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
	public static int majorityElement(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
		    if (entry.getValue() > (nums.length / 2)) {
			return entry.getKey();
		}
		}
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1,2,2, 1, 2, 2 };
		System.out.println(Majority_Element.majorityElement(nums));

	}

}
