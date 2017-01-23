package leetcode_easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Third_Maximum_Numbe {
	public static int thirdMax(int[] nums) {

		int max, mid, small, count;
		max = mid = small = Integer.MIN_VALUE;
		count = 0; // Count how many top elements have been found.

		for (int x : nums) {
			// Skip loop if max or mid elements are duplicate. The purpose is
			// for avoiding right shift.
			if (x == max || x == mid) {
				continue;
			}

			if (x > max) {
				// right shift
				small = mid;
				mid = max;

				max = x;
				count++;
			} else if (x > mid) {
				// right shift
				small = mid;

				mid = x;
				count++;
			} else if (x >= small) { // if small duplicated, that's find,
										// there's no shift and need to increase
										// count.
				small = x;
				count++;
			}
		}

		// "count" is used for checking whether found top 3 maximum elements.
		if (count >= 3) {
			return small;
		} else {
			return max;
		}
	}

	/*
	 * int ans = 0; List<Integer> al =
	 * Arrays.stream(nums).boxed().collect(Collectors.toList());
	 * TreeSet<Integer> ts = new TreeSet<Integer>(al); for (int i = 0; i < 3;
	 * i++) { ans = Collections.max(ts); ts.remove(ans); } return ans;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 2, 1, 4, 5 };
		System.out.println(Third_Maximum_Numbe.thirdMax(arr));

	}

}
