package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer from 1 to 15: ");
		int number = input.nextInt();

		if (number >= 1 && number <= 15) {
			for (int row = 1; row <= number; row++) {
				for (int whiteSpace = (number - row); whiteSpace > 0; whiteSpace--) {
					System.out.print("   ");
				}
				for (int part2 = row; part2 >= 1; part2--) {
					System.out.print("  " + part2);

				}
				for (int part3 = 2; part3 <= row; part3++) {
					System.out.print("  " + part3 + "");
				}
				System.out.println();
			}
			

		} else
			System.out.println("ıt is an invalid input!");
	}

}
