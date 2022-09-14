package chapters.chapter_05;

public class Exercises05_18PaternD {

	public static void main(String[] args) {
		for (int row = 6; row > 0; row--) {
		
			for (int part = 1; part <= row; part++) {
				System.out.print(part + " ");
			}
			System.out.println();
		}
	}

}
