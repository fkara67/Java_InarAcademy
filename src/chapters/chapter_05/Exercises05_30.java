package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter annual interest rate: ");
		double annualRate = input.nextDouble();
		System.out.println("Enter number of months: ");
		int month = input.nextInt();
		double monthlyRate = annualRate / 1200;
		int m = 1;
		double compoundValue = 0;
		while (m <= month) {
			compoundValue = (amount + compoundValue) * (1 + monthlyRate);
			
			m++;
		}
		System.out.printf("%5.2f",compoundValue);
	}

}
