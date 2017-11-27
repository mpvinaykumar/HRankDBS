
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lineSize = sc.nextInt();
		int[] line = new int[lineSize];
		
		for (int i = 0; i < lineSize; i++) {
			line[i]=sc.nextInt();
		}
		int track = sc.nextInt();		
		
		int timeTaken =waitingTime(line,track);
		
		System.out.println("time taken:"+timeTaken);
		
	}

	private static int waitingTime(int[] tickets, int p) {
		int time=0;
		Queue<Integer> que = new LinkedList<>();		
		for (int i = 0; i < tickets.length; i++) {
			que.add(i);
		}
		while (true) {
			Integer popValue = que.poll();
			if(popValue== null){
				break;
			}else {
				tickets[popValue]-=1;
				time++;
			}
			if(popValue==p && tickets[popValue]==0 ) {
				break;
			}
			else if(tickets[popValue]>0) {
				que.add(popValue);
			}
		}
		return time;
	}
}


/*

5
2
6
3
4
5
2

4
1
1
1
1
0

4
5
5
2
3
3



*/
