
public class TwoCircles {

	public static void main(String[] args) {
		String[] lines = { "12 0 21 14 0 23",
						"0 45 8 0 94 9",
						"35 0 13 10 0 38",
						"0 26 8 0 9 25"};
		
		/*String[] lines = { "0 5 9 0 9 7",
				"0 15 11 0 20 16",
				"26 0 10 39 0 23",
				"37 0 5 30 0 11",
				"41 0 0 28 0 13"};*/
		
		String[] output = circles(lines);

		for (String op : output) {
			System.out.println(op);
		}
	}

	private static String[] circles(String[] info) {
		int xdiff = 0, ydiff = 0, rdiff = 0, rsum = 0;
		double distance = 0.0;
		String[] result = new String[info.length];
		for (int i = 0; i < info.length; i++) {
			String[] circles = info[i].split(" ");
			xdiff = Integer.parseInt(circles[0]) - Integer.parseInt(circles[3]);
			ydiff = Integer.parseInt(circles[1]) - Integer.parseInt(circles[4]);
			rdiff = Integer.parseInt(circles[2]) - Integer.parseInt(circles[5]);
			rdiff = Math.abs(rdiff);
			rsum = Integer.parseInt(circles[2]) + Integer.parseInt(circles[5]);

			distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);

			if (rsum < distance) {
				result[i] = "Disjoint-Outside";
				continue;
			} else if (rsum == distance) {
				result[i] = "Touching";
				continue;
			} else if (rdiff < distance && distance < rsum) {
				result[i] = "Intersecting";
				continue;
			} else if (rdiff == distance) {
				result[i] = "Touching";
				continue;
			}else if (rdiff > distance) {
				result[i] = "Disjoint-Inside";
				continue;
			}else {
				result[i] = "Concentric";
				continue;
			}

		}
		return result;
	}
}


