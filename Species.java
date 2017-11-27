
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Species {

	static List<String> animalList = new LinkedList<>();
	static List<String> mamalList = new LinkedList<>();

	static Scanner sc = new Scanner(System.in);
	
	static void addMamal() {

		StringBuilder push = new StringBuilder();
		push.append(sc.next());
		push.append(" " + 4 + "\n");
		push.append(sc.next() + "\n");
		int food_types = sc.nextInt();
		push.append(food_types + ":");
		for (int j = 0; j < food_types; j++) {
			push.append(" " + sc.next());
		}
		push.append("\n");
		mamalList.add(push.toString());
	}

	public static void main(String[] args) {
		int lineSize = sc.nextInt();

		for (int i = 0; i < lineSize; i++) {
			String species = sc.next();
			if (species.equals("M")) {
				addMamal();
			} else if (species.equals("A")) {
				animalList.add((sc.next() + " " + sc.nextInt() + "\n"));
			}
		}
		for (String animal : animalList) {
			System.out.println(animal);
		}
		
		for (String mamal : mamalList) {
			System.out.println(mamal);
		}
	}
}


/*

4
M
Chicky
Mono
1
Choco
A
Kritty
5
M
Swojza
Marsu
2
Choco
Olive
A
Wuzoo
8

*/
