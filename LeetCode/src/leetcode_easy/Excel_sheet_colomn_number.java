package leetcode_easy;

public class Excel_sheet_colomn_number {
	public static int titleToNumber(String s) {
		int result = 0;
		int t = 0;
		int i = s.length() - 1;
		while (i >= 0) {
			char c = s.charAt(i);
			result = result + (int) Math.pow(26, t) * (c - 'A' + 1);
			t++;
			i--;
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Excel_sheet_colomn_number.titleToNumber("AA"));

	}

}
