import java.util.Scanner;

public class LargestSubsetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] input = new int[size];
		int[] output = new int[size];

		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}

		output = maxSubsetSum(input);
		for (int i : output) {
			System.out.println(i);
		}
	}

	private static int[] maxSubsetSum(int[] k) {
		int[] output = new int[k.length];
		for (int i = 0; i < k.length; i++) {
			int sum = 0;

			for (int j = 1; j <= k[i]; j++) {
				if (k[i] % j == 0)
					sum += j;
			}
			output[i] = sum;
		}
		return output;
	}
}
