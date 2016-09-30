package leetcode_easy;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 11, 15, 7 };
		int t = 9;
		int[] ans =(Two_Sum.twoSum(arr, t));
		System.out.println(Arrays.toString(ans));
	}

}
