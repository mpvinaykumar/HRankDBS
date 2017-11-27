
public class IronMan {

	public static int ironMan(int p[]) {
		int charge = Math.abs(p[0]) + 1;
		int curr_power = charge;
		for (int i = 0; i < p.length; i++) {
			curr_power = curr_power + p[i];
			if (curr_power == 0) {
				charge += 1;
				curr_power+= 1;
			}
			if (curr_power < 0) {
				charge += Math.abs(curr_power)+1;
				curr_power += Math.abs(curr_power)+1;
			}
		}
		return charge;
	}

	public static void main(String[] args) {

		int arr[] = { -5, 4, -2, 3, 1, -1, -6, -1, 0, 5 };
		int arr1[] = { -5, 4, -2, 3, 1 };
		int arr2[] = { -5, 4, -2, 3, 1, -1, -6, -1, 0, -5 };
		System.out.println(ironMan(arr));
		System.out.println(ironMan(arr1));
		System.out.println(ironMan(arr2));
	}
}
