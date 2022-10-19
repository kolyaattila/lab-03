public class IncreasedProduction {

	public static void main(String[] args) {

		double partsProduced = 4000;
		boolean limitExceededForSalaryRaise = false;

		for (int i = 0; i < 24; i++) {
			double increaseMonthly = partsProduced * 6 / 100;
			partsProduced = partsProduced + increaseMonthly;
			System.out.println(String.format("Month: %s, production: %s", i, partsProduced));
			if (partsProduced > 7000 && !limitExceededForSalaryRaise) {
				limitExceededForSalaryRaise = true;
				System.out.println("Worker deserves a raise!");
			}

		}

	}

}
