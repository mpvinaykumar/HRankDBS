public class Future {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" minNum1 is " + minNum(30, 35, 39));
		System.out.println(" minNum2 is " + minNum(3, 5, 1));
		System.out.println(" minNum3 is " + minNum(4, 5, 1));
		System.out.println(" minNum4 is " + minNum(10, 4, 1));
	}

	private static int minNum(int a, int k, int p) {
		int strength = k - a;
		if (strength <= 0)
			return -1;
		else {
			if (p < strength)
				return 1;
			else {
				return (p / strength) + 1;
			}
		}
	}
}
