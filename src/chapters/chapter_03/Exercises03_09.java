package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int first9Digit = input.nextInt();
		
		int digit1 = first9Digit / 100_000_000;
		int remainDig = first9Digit % 100_000_000;
		int digit2 = remainDig / 10_000_000;
		remainDig %= 10_000_000; 
		int digit3 = remainDig / 1_000_000;
		remainDig %= 1_000_000;
		int digit4 = remainDig / 100_000;
		remainDig %= 100_000;
		int digit5 = remainDig / 10_000;
		remainDig %= 10_000;
		int digit6 = remainDig / 1000;
		remainDig %= 1000;
		int digit7 = remainDig / 100;
		remainDig %= 100;
		int digit8 = remainDig / 10;
		int digit9 = remainDig % 10;
		
		int digit10 =(digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 +
				digit7 * 7 + digit8 * 8 + digit9 * 9) %11;
		
		if (digit10 == 10) {
		System.out.println("The ISBN number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 +
				digit7 + digit8 + digit9 + "X");
		}
		else
			System.out.println("The ISBN number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 +
					digit7 + digit8 + digit9 + digit10);
		
		
	}

}
