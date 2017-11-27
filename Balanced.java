import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Balanced {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String expressions[] = new String[size];
		for (int i = 0; i < size; i++) {
			expressions[i] = sc.nextLine();
		}
		int replaceSize = sc.nextInt();
		int[] maxReplacements = new int[replaceSize];
		for (int i = 0; i < size; i++) {
			maxReplacements[i] = sc.nextInt();
		}

		int[] output = balancedOrNot(expressions, maxReplacements);
		System.out.println(Arrays.toString(output));
	}

	private static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
		Stack<Character> st = new Stack<>();
		int[] isBalanced = new int[expressions.length];
		boolean isBal=true;
		for (int i = 0; i < expressions.length; i++) {
			
			for (int j = 0; j < expressions[i].length(); j++) {

				if (expressions[i].charAt(j) == '>') {
					if (st.isEmpty()) {
						if (maxReplacements[i] == 0) {
							isBal=false;
							isBalanced[i] = 0;
							break;
						} else {
							maxReplacements[i]--;
							continue;
						}
					} else {
						st.pop();
						continue;
					}
				} else {
					st.push('<');
				}
			}
			isBalanced[i] = st.isEmpty()&&isBal ? 1 : 0;
			st.clear();
			isBal=true;
		}

		return isBalanced;
	}
}

/*
2
<>>>
<>>>>
2
2
2
 
2
<>
<>><
2
1
0
 */