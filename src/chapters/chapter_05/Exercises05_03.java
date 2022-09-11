package chapters.chapter_05;

public class Exercises05_03 {

	public static void main(String[] args) {
		String output = "";
		String title = "Kilograms\t" + "Pounds\n";

		for (int kilo = 1; kilo < 200; kilo += 2) {
			double pounds = (int) (kilo * 2.2 * 100) / 100.0;

			output += kilo + "\t\t" + pounds + "\n";

		}
		System.out.println(title + output);
	}

}
