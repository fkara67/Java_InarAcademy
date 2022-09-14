package chapters.chapter_05;

public class Exercises05_18PaternC {

	public static void main(String[] args) {
		for (int row = 1; row <= 6; row++) {
			for(int white = 6 - row; white > 0; white--) {
				System.out.print("  ");
			}
			for (int part = row; part >= 1; part--) {
				System.out.print(part + " ");
			}
			System.out.println();
		}
	}

}
