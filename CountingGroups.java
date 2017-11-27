import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountingGroups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matrix[][] = new int[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int groups[] = new int[sc.nextInt()];

		for (int i = 0; i < groups.length; i++) {
			groups[i]=sc.nextInt();
		}

		int ouptut[] = countGroups(matrix, groups);
		System.out.println(Arrays.toString(ouptut));
	}

	private static int[] countGroups(int[][] m, int[] t) {
		HashMap<Integer, Integer> groupMap = new HashMap<>();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == 1) {
					int groupSize = DFS(m, i, j);
					
					if(groupMap.get(groupSize)!=null) {
						groupMap.put(groupSize, groupMap.get(groupSize)+1);
					}else {
						groupMap.put(groupSize, 1);
					}
				}
			}
		}
		
		//convert map to output array
		int[] output = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			if(groupMap.get(t[i]) != null)
				output[i]=groupMap.get(t[i]);
			else {
				output[i]=0;
			}
		}
		return output;
	}

	private static int DFS(int[][] matrix, int i, int j) {
		if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[i].length || matrix[i][j] == 0)
			return 0;
		matrix[i][j] = 0;
		int groupSize = 1;

		groupSize += DFS(matrix, i + 1, j);
		groupSize += DFS(matrix, i - 1, j);
		groupSize += DFS(matrix, i, j + 1);
		groupSize += DFS(matrix, i, j - 1);

		return groupSize;
	}
}

/*
10
10
1 1 1 1 1 1 1 1 1 1
1 1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 1 1 1
1 1 0 0 1 0 0 1 1 1
1 0 1 0 0 1 1 0 0 0
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1
5
1
10
20
2
6





5
5
1 0 1 1 0
0 1 0 0 1
1 0 1 1 0
1 0 1 1 0
0 1 0 0 1
5
1
2
3
4
5

*/