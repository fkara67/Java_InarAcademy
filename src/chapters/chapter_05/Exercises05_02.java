package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long startsTime = System.currentTimeMillis();
		int correctCount = 0;

		for (int count = 0; count < 10; count++) {
			int num1 = (int) (Math.random() * 16);
			int num2 = (int) (Math.random() * 16);
			System.out.println("What is " + num1 + "+" + num2 + "?");
			int answer = input.nextInt();

			if (answer == num1 + num2) {
				correctCount++;
				System.out.println("You are correct!\n");
			} else {
				System.out.println("You are wrong! " + num1 + "+" + num2 + " should be " + (num1 + num2) + "\n");
			}

		}
		long endsTime = System.currentTimeMillis();
		int testTime = (int) (endsTime - startsTime);

		System.out.println("Correct Count is " + correctCount + "\nTest Time is " + testTime / 1000 + " seconds");
	}

}
