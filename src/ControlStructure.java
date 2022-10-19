public class ControlStructure {

	public static void main(String[] args) {

		//if / else / else if
		int number = 2;
		if (number > 2) {
			System.out.println("Number is higher than 2");
		} else {
			System.out.println("Number is lower or equal than 2");
		}

		//switch
		int count = 3;
		switch (count) {
			case 0:
				System.out.println("Count is equal to 0");
				break;
			case 1:
				System.out.println("Count is equal to 1");
				break;
			default:
				System.out.println("Count is either negative, or higher than 1");
				break;
		}

		//for
		for (int i = 1; i <= 10; i++) {
			methodToRepeat("for method", i);
		}

		//while
		int whileCounter = 1;
		while (whileCounter <= 10) {
			methodToRepeat("while method", whileCounter);
			whileCounter++;
		}

		//break
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			methodToRepeat("for method + break", i);
		}

		//continue
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			methodToRepeat("for method + continue", i);
		}

	}

	private static void methodToRepeat(String method, int number) {
		System.out.println(String.format("Method: %s, count: %s", method, number));
	}

}
