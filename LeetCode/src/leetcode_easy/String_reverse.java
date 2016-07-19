package leetcode_easy;

public class String_reverse {

	public String reverseString(String str) {

		if (str.length() == 1) {
			return str;
		} else {

			return reverseString(str.substring(1)) + str.charAt(0);

		}
	}

	public static void main(String a[]) {
		String_reverse srr = new String_reverse();
		System.out.println("Result: " + srr.reverseString("sau"));
	}
}
