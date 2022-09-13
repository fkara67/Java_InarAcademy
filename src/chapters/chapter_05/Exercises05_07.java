package chapters.chapter_05;

public class Exercises05_07 {

	public static void main(String[] args) {
		double total4 = 0;
		double tuition = 10_000;

		for (int year = 0; year < 15; year++) {
			tuition *= 1.05;

			if (year == 10) {
				System.out.printf("The Tuition will be $%.2f in ten years", tuition);

			}
			if (year > 10) {
				total4 += tuition;
			}

		}

		System.out.printf("\nTotal cost of 4 years' worth of tuition after 10 year $%.2f", total4);
	}

}
