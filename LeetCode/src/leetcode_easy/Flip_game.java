package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class Flip_game {
	public static List<String> generatePossibleNextMoves(String s) {
		List<String> result = new ArrayList<String>();

		if (s == null)
			return result;

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] && arr[i] == '+') {
				arr[i] = '-';
				arr[i + 1] = '-';
				result.add(new String(arr));
				arr[i] = '+';
				arr[i + 1] = '+';
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "++++";
		System.out.println(Flip_game.generatePossibleNextMoves(str));

	}

}
