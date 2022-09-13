package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		int count = 0;
		int divisor = 2;
		String result = "";

		while (divisor <= n) {
			while (n % divisor == 0) {
				System.out.print(divisor + ",");
				n = n / divisor;
				
				}
			divisor++;

		}

	}

}
