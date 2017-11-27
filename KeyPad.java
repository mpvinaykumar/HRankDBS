
public class KeyPad {

	private static int[][] arr = new int[3][3];

	public static int entryTime(String dailingKeys, String keys) {

		int z = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = keys.charAt(z);
				z++;
			}
		}
		int time = 0;
		char curclick = dailingKeys.charAt(0);

		for (int i = 1; i < dailingKeys.length(); i++) {
			if (curclick != dailingKeys.charAt(i)){
				time += calculateTime(curclick, dailingKeys.charAt(i));
			}	
			curclick = dailingKeys.charAt(i);
		}

		return time;
	}

	private static int calculateTime(int a, int b) {
		int x = 0;
		int y = 0;
		int nextx = 0;
		int nexty = 0;
		int time = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a == arr[i][j]) {
					x = i;
					y = j;
				} else if (b == arr[i][j]) {
					nextx = i;
					nexty = j;
				}
			}
		}
		if (Math.abs(x - nextx) < 2) {
			time = 1;
			if (Math.abs(y - nexty) >= 2)
				time = 2;
		} else {
			time = 2;
		}
		return time;
	}

	public static void main(String[] args) {
		System.out.println(entryTime("423692", "923857614"));
		System.out.println(entryTime("5111", "752961348"));
		System.out.println(entryTime("91566165", "639485712"));
	}
}