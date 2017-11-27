import java.util.Scanner;

public class BitGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		int k = sc.nextInt();
		
		int maxOr=maxXor(left, right, k);
		
		System.out.println(maxOr);
	}

	private static int maxXor(int left, int right, int k) {
		int maxOr=0;
		int temp=1;
		for(int i=left ; i<right; i++) {
			for(int j=i+1; j<=right; j++) {
			   temp = i^j;
				if (maxOr<temp && temp<=k)
					maxOr = temp;
			}
		}
		return maxOr;
	}

}
/*
1
3
3

2
4
8
*/