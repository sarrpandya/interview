package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {
	public static List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> res = new ArrayList<>();
		res.add(new ArrayList<Integer>());

		//Arrays.sort(S);
		for (int i : S) {
			List<List<Integer>> tmp = new ArrayList<>();
			for (List<Integer> sub : res) {
				List<Integer> a = new ArrayList<>(sub);
				a.add(i);
				tmp.add(a);
			}
			res.addAll(tmp);
		}
		return res;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
 		System.out.println(subset.subsets(arr));
	}

}
