import java.util.Scanner;

public class BarChart2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int artScore, bobScore, calScore, danScore, eliScore;
		System.out.print("Introduceti scorul intr-un sezon lui Art: ");
		artScore = scanner.nextInt();
		System.out.print("Introduceti scorul intr-un sezon lui Bob: ");
		bobScore = scanner.nextInt();
		System.out.print("Introduceti scorul intr-un sezon lui Call: ");
		calScore = scanner.nextInt();
		System.out.print("Introduceti scorul intr-un sezon lui Dan: ");
		danScore = scanner.nextInt();
		System.out.print("Introduceti scorul intr-un sezon lui Eli: ");
		eliScore = scanner.nextInt();
		System.out.print("Scorurile sezonului" + "\n");

		printPlayerStats("Art ", artScore);
		printPlayerStats("Bob ", bobScore);
		printPlayerStats("Cal ", calScore);
		printPlayerStats("Dan ", danScore);
		printPlayerStats("Eli ", eliScore);

	}

	private static void printPlayerStats(String playerName, int bobScore) {
		System.out.print(playerName);
		for (int i = 1; i <= bobScore / 10; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}

}
