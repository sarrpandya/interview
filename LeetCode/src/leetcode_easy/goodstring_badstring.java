package leetcode_easy;

public class goodstring_badstring {
	public static String gbstring(String str) {
		str = str + " ";
		int l =str.length();
		String ans = ""; 
		char ch1, ch2;

		for (int i = 0; i < l-1; i++) {
			ch1 = str.charAt(i); 
			ch2 = str.charAt(i + 1);

			if (ch1 != ch2) {
				ans = ans + ch1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(goodstring_badstring.gbstring("Javvaa abbcc"));

	}

}
