import java.util.Scanner;

public class Winner {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int andreaSize = sc.nextInt();
		int[] andrea = new int[andreaSize];
		
		for (int i = 0; i < andreaSize; i++) {
			andrea[i]=sc.nextInt();
		}
		
		int mariaSize = sc.nextInt();
		int[] maria = new int[mariaSize];
		
		for (int i = 0; i < mariaSize; i++) {
			maria[i]=sc.nextInt();
		}
		
		String even_odd = sc.next();
		
		System.out.println(winner(andrea,maria,even_odd));
	}

	private static String winner(int[] andrea, int[] maria, String s) {
		int start_index= s.equals("Even")?0:1;
		int andreaScore = 0,mariaScore =0;
		
		for (int i = start_index; i < andrea.length && i<maria.length; i+=2) {
			andreaScore+=andrea[i]-maria[i];
			mariaScore+=maria[i]-andrea[i];
		}
		if(andreaScore>mariaScore) {
			return "Andrea";
		}else if(andreaScore<mariaScore) {
			return "Maria";
		}else if(andreaScore==mariaScore) {
			return "Tie";
		}else {
			return null;
		}
		
	}

}

/*
3
1
2
3
3
2
1
3
Even

3
1
2
3
3
1
2
33
Odd

*/
