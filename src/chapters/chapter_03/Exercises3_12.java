package chapters.chapter_03;

import java.util.Scanner;

public class Exercises3_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit integer: ");
		int integer = input.nextInt();
		
		int firstDigit = integer % 10;
		int thirdDigit = integer / 100;
		
		if (firstDigit == thirdDigit) {
			System.out.println(integer + " is a palindrome.");
		}
		else {
			System.out.println(integer + " is not palindrome.");
		}
	}

}
