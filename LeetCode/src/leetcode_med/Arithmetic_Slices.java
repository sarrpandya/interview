package leetcode_med;

public class Arithmetic_Slices {
	public static int numberOfArithmeticSlices(int[] A) {
		int curr = 0, sum = 0;
		for (int i = 2; i < A.length; i++)
			if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
				curr += 1;
				sum += curr;
			} else {
				curr = 0;
			}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(Arithmetic_Slices.numberOfArithmeticSlices(arr));
	}

}
