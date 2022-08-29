package chapters.chapter_03;

import java.util.Scanner;

public class Exercises3_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer leaving a space between: ");
		int digit1 = input.nextInt();
		int digit2 = input.nextInt();
		int digit3 = input.nextInt();
		int digit4 = input.nextInt();
		int digit5 = input.nextInt();
		int digit6 = input.nextInt();
		int digit7 = input.nextInt();
		int digit8 = input.nextInt();
		int digit9 = input.nextInt();
		
		double checksum =(digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) * 0.11;
		checksum = (int)checksum;
		int digit10 = (int)(checksum / 10);
		System.out.println("The ISBN number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + digit10);
		
		
		
	}

}
