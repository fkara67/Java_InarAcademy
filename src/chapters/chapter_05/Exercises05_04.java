package chapters.chapter_05;

public class Exercises05_04 {

	public static void main(String[] args) {
		String title = "Miles\tKilometers\n";
		String output = "";

		for (int miles = 1; miles < 11; miles++) {
			double kilometers = (int) (miles * 1.609 * 1000) / 1000.0;

			output += miles + "\t" + kilometers + "\n";
		}
		System.out.println(title + output);
	}

}
