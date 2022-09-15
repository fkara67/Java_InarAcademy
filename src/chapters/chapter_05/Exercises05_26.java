package chapters.chapter_05;

public class Exercises05_26 {

	public static void main(String[] args) {

		for (int i = 10_000; i <= 100_000; i += 10_000) {
			double eT = 1;
			double e = 1;
			for (double i2 = 1; i2 <= i; i2++) {
				eT *= 1 / i2;
				e += eT;
			}
			System.out.println("e value for i = " + i + " is " + e);
		}
		System.out.println("Java Value For E is " + Math.E);

	}

}
