package leetcode_easy;

public class Shortest_Word_Distance {

	public static int shortest_d(String[] str, String w1, String w2) {
		int first = -1;
		int second = -1;
		int ans = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains(w1)) {
				first = i;
			} else if (str[i].contains(w2)) {
				second = i;
			}

		}
		ans = Math.max(ans, Math.abs(first - second));
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "practice", "makes", "perfect", "coding", "makes" };
		String w1 = "practice";
		String w2 = "coding";
		System.out.println(Shortest_Word_Distance.shortest_d(str, w1, w2));
	}

}
