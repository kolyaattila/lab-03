import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int artScore, bobScore, calScore, danScore, eliScore;
		System.out.print("Introduceti scorul lui Art: ");
		artScore = scanner.nextInt();
		System.out.print("Introduceti scorul lui Bob: ");
		bobScore = scanner.nextInt();
		System.out.print("Introduceti scorul lui Call: ");
		calScore = scanner.nextInt();
		System.out.print("Introduceti scorul lui Dan: ");
		danScore = scanner.nextInt();
		System.out.print("Introduceti scorul lui Eli: ");
		eliScore = scanner.nextInt();
		System.out.print("Scorurile jocului" + "\n");

		printPlayerStats("Art ", artScore);
		printPlayerStats("Bob ", bobScore);
		printPlayerStats("Cal ", calScore);
		printPlayerStats("Dan ", danScore);
		printPlayerStats("Eli ", eliScore);

	}

	private static void printPlayerStats(String playerName, int bobScore) {
		System.out.print(playerName);
		for (int i = 1; i <= bobScore; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}

}
