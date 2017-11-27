
import java.util.Arrays;
import java.util.Scanner;

public class StairCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lineSize = sc.nextInt();
		long[] line = new long[lineSize];
		
		for (int i = 0; i < lineSize; i++) {
			line[i]=sc.nextLong();
		}
		
		int[] output = arrangeCoins(line);
		System.out.println(Arrays.toString(output));
		
	}

	private static int[] arrangeCoins(long[] coins) {
		int[] ouptput = new int[coins.length];
		
		for (int i = 0; i < coins.length; i++) {
			int rows=0, row_count=1;
			while(true) {
				coins[i]-=row_count;
				if(coins[i]<0) {
					break;
				}else {
					rows++;
					row_count++;
				}
			}
			ouptput[i]=rows;
		}
		return ouptput;
	}
	
}



/*

4
2
5
8
3

4
100
1000
10001
11111

*/
