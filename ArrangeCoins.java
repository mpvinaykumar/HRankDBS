

public class ArrangeCoins {

	public static void arrangeCoins(long[] coins) {

		for (int i = 0; i < coins.length; i++) {

			long d = 1 - (4 * 1 * -2 * coins[i]);
			long a = (long) Math.floor((-1 + Math.sqrt(d)) / 2);
			System.out.println("Arrange coins problem:" + a);
		}

	}

	public static void main(String[] args) {

		long coins[] = { 2, 5, 8, 3 };
		long coins2[] = { 100, 1000, 10001, 11111 };
		arrangeCoins(coins2);

	}

}
