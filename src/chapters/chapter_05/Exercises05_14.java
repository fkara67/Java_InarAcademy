package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first positive integer: ");
		int int1 = input.nextInt();
		System.out.println("Enter second positive integer: ");
		int int2 = input.nextInt();

		if (int2 < int1) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
		int gcd = int1;
		int d = int1;

		while (d > 0) {
			
			if (int1 % d == 0 && int2 % d == 0) {
				gcd = d;
				break;
			}
			d--;

		}
		System.out.println("The greatest common divisor for " + int1 + " and " + int2 + " is " + gcd);
	}

}
