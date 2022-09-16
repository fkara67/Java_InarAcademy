package chapters.chapter_05;

public class Exercises05_43 {

	public static void main(String[] args) {
		String combination = "";
		int count = 0;
		int i2 = 0;
		for (int i1 = 1; i1 <= 7; i1++) {

			for (i2 = 2; i2 <= 7; i2++) {

				if (i1 != i2 && i2 > i1) {
					combination += i1 + " " + i2 + "\n";
					count++;

				}

			}

		}

		System.out.print("Combinations: \n" + combination + "\nThe total number of all combinations is " + count);
	}

}
