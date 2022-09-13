package chapters.chapter_05;

public class Exercises05_18 {

	public static void main(String[] args) {
		for (int row = 1; row <= 6; row++) {

			for (row = 1; row <= 6; row++) {
				System.out.print(" " + row);

			}
			for (int white = 1; white > 6; white++) {
				System.out.print("------ ");
			}
			System.out.println();
		}
	}

}
