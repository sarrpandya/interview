package leetcode_easy;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Remove_all_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,4};
		List<Integer> al= Arrays.stream(arr).boxed().collect(Collectors.toList());
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		System.out.println(ts);
		//String[] strings = list.stream().toArray(String[]::new);
		//arraylist to array
	}

}
