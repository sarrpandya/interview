package leetcode_easy;

public class shortest_Distance {
	public static int shortestDistance(String[] words, String word1, String word2) {
		int m = -1;
		int n = -1;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			if (word1.equals(s)) {
				m = i;
			} else if (word2.equals(s)) {
				n = i;
			}
			if (m != -1 && n != -1)
				min = Math.abs(m - n);
		}

		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "practice", "makes", "perfect", "coding", "makes" };
		String word1 = "coding";
		String word2 = "makes";
		System.out.println(shortest_Distance.shortestDistance(words, word1, word2));

	}

}
