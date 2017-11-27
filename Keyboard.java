
import java.util.Scanner;

public class Keyboard {

	static int getPosition(char [][] keys, int row, int col,char target) {
		if(row<0 || col <0 || row>keys.length || col>keys[row].length) {
			return 0;
		}
		if(keys[row][col]==target)
			return 1;
		
		for(int r=row-1;r<row+1;r++) {
			for(int c=col-1;c<col+1;c++) {
				
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] keyPad = new char[3][3];
		
		String input = sc.nextLine();
		String key = sc.nextLine();
		int sX, sY=-1; 
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				keyPad[i][j] = key.charAt(i+j);
				if(input.charAt(0)==key.charAt(i+j)) {
					sX=i;sY=j;
				}
			}
		}
		
		long timeTaken=0;
		for (int i = 1; i < input.length(); i++) {
			for(int r=0;r<3;r++) {
				for(int c=0;c<3;c++) {
					
				}
			}
		}
		
		

		
	}
}
