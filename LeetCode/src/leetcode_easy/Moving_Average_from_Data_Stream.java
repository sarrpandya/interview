package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class Moving_Average_from_Data_Stream {
	int outerSize = 0;
	List<Integer> ls;

	/** Initialize your data structure here. */
	public Moving_Average_from_Data_Stream(int size) {
		outerSize = size;
		ls = new ArrayList<Integer>();
	}

	public double next(int val) {
		ls.add(val);
		if (ls.size() > outerSize)
			ls.remove(0);// remove 0 th

		int sum = 0;
		for (int n : ls)
			sum += n;

		return (double) sum / ls.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
