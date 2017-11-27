import java.util.Scanner;

public class ConsecutiveSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num=sc.nextLong();
		
		System.out.println(consecutive(num));
	}

	private static int consecutive(long num) {
		long startRef=1, endRef=1, sum=1;
		int count =0;
		while (startRef<=num/2) {
			if(sum<num) {
				endRef++;
				sum+=endRef;
			}else if(sum>num) {
				sum-=startRef;
				startRef++;
			}else if(sum==num) {
				count++;
				sum-=startRef;
				startRef++;				
			}
		}
		
		return count;
	}

}
