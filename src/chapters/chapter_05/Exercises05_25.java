package chapters.chapter_05;

public class Exercises05_25 {

	public static void main(String[] args) {
		
		for (int i = 10_000; i <= 100_000; i += 10_000) {
			double pi = 0;
			for (int i2 = 1; i2 <= i; i2++) {

				pi += 4 * Math.pow(-1, i2 + 1) / (2 * i2 - 1);
				
				

			}
			System.out.println("pi value for i = " + i + " is " + pi);

		}
		System.out.println("Java Value For PI İS " + Math.PI);
	}

}
