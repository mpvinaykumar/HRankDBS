public class MetroFestival {

	public static void main(String[] args) {

		int[] p = { 1, 1 };
		int[] x = { 1, 3 };
		int[] y = { 1, 1 };
		System.out.println("Test case 1 : " + findSutableLocation(p, x, y));

		int[] p1 = { 1, 1 };
		int[] x1 = { 1, 2 };
		int[] y1 = { 1, 2 };

		System.out.println("Test case 2 : " + findSutableLocation(p1, x1, y1));

		int[] p3 = { 1, 1, 1 };
		int[] x3 = { 5, 2, 3 };
		int[] y3 = { 3, 4, 7 };

		System.out.println("Test case 3 : " + findSutableLocation(p3, x3, y3));
	}

	private static int findSutableLocation(int[] p, int[] x, int[] y) {

		int sumX = 0;
		int sumY = 0;
		int arrlen = x.length;

		for (int i = 0; i < arrlen; i++)
			sumX += x[i] * p[i];

		for (int i = 0; i < arrlen; i++)
			sumY += y[i] * p[i];

		int avgSumX = sumX / arrlen;
		int avgSumY = sumY / arrlen;

		int sumMinimal = 0;
		for (int i = 0; i < arrlen; i++)
			sumMinimal += Math.abs(x[i] - avgSumX) + Math.abs(y[i] - avgSumY);
		return sumMinimal;
	}
}