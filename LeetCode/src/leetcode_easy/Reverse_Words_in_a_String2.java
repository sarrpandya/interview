package leetcode_easy;

public class Reverse_Words_in_a_String2 {

	public static char[] rev(char[] ch) {
		int i = 0;
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == ' ') {
				reverse(ch, i, j - 1);
				i = j + 1;
			}
		}
		reverse(ch, i, ch.length - 1);
		reverse(ch, 0, ch.length - 1);

		return ch;

	}

	public static void reverse(char[] s, int i, int j) {
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple is  red is the color";
		char[] ch = str.toCharArray();
		String ans = String.valueOf(Reverse_Words_in_a_String2.rev(ch));
		System.out.println(ans);

	}

}
