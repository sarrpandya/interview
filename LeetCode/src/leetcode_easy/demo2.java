package leetcode_easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class demo2 {

	public static StringBuilder r_d(String str) {

		TreeSet<Character> set2 = new TreeSet<Character>();

		char[] ch = str.toCharArray();
		for (char c : ch) {
			set2.add(c);
		}
		StringBuilder sb = new StringBuilder();
		Iterator<Character> it = set2.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
		}
		return sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(demo2.r_d("adba"));
	}

}
