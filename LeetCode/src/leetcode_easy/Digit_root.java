package leetcode_easy;

public class Digit_root {

	public static int digitRoot(int num) {
		return num - 9 * ((num - 1) / 9);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Digit_root.digitRoot(38));

	}

}
