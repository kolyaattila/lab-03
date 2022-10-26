import java.util.Scanner;

public class QuizScoreStatistics {

	public static final int STOP_KEY = 99;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberInsert = 0, counter = 0, maxNumber = 0, minNumber = 0, sum = 0;

		System.out.println("Introducerea notei 99 va fi iesirea din program");

		while (numberInsert != STOP_KEY) {
			System.out.print("Introduceti nota: ");
			numberInsert = scanner.nextInt();

			if (numberInsert >= 10 || numberInsert < 0)
				System.out.println("Nota invalida! ");
			else {
				counter++;

				if (counter == 1) {
					minNumber = numberInsert;
					maxNumber = numberInsert;
				}

				if (numberInsert < minNumber) {
					minNumber = numberInsert;
				}
				if (numberInsert > maxNumber) {
					maxNumber = numberInsert;
				}
				sum = numberInsert + sum;
			}
		}
		System.out.println("Numarul de note introduse : " + counter);
		System.out.println("Media notelor:  " + sum / counter);
		System.out.println("Maximul este:  " + maxNumber);
		System.out.println("Minimul este:  " + minNumber);

	}

}
