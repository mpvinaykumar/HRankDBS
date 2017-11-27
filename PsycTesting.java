import java.util.Arrays;
import java.util.Scanner;

public class PsycTesting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] input = new int[size];

		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}
		
		int lowSize = sc.nextInt();
		int[] lower = new int[lowSize];

		for (int i = 0; i < lowSize; i++) {
			lower[i] = sc.nextInt();
		}
		
		int upSize = sc.nextInt();
		int[] upper = new int[upSize];

		for (int i = 0; i < lowSize; i++) {
			upper[i] = sc.nextInt();
		}
		
		int[] output  = jobOffers(input,lower,upper);
		System.out.println(Arrays.toString(output));
	}

	private static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int[] result = new int[lowerLimits.length];
		
		for (int i = 0; i < upperLimits.length; i++) {
			int count=0;
			for (int j = 0; j < scores.length; j++) {
				if(scores[j]>=lowerLimits[i] && scores[j]<=upperLimits[i] ) {
					count++;
				}
				result[i]=count;
			}
		}
		return result;
	}
}

/*

5
1
3
5
6
8
1
2
1
6


3
4
8
7
2
2
4
2
8
4
 
 
 */
