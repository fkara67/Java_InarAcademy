package chapters.chapter_05;

public class Exercises05_33 {

	public static void main(String[] args) {
		System.out.println("The perfect numbers between 0 and 10000 is ");
		for (int number = 6; number < 10000; number++) {
			int sumOfProperDivisor = 0;
			for (int divisor = number - 1; divisor > 0; divisor--) {
				if (number % divisor == 0) {
					sumOfProperDivisor += divisor;
				}
				
				}
			if (sumOfProperDivisor == number) {
				
				System.out.println(number);

			}
		}
	}

}
