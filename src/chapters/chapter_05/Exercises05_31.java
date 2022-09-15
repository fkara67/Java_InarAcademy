package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter annual percentage yield: ");
		double annualYield = input.nextDouble();
		System.out.println("Enter maturity period (number of months): ");
		int month = input.nextInt();
		System.out.println("Month\tCD Value");
		double monthlyYield = annualYield / 1200;
		double amountCD = amount;
		for (int m = 1; m <= month; m++) {
		
			amountCD = amountCD + amountCD * monthlyYield;
			System.out.printf("%-5d\t%-12.2f\n", m, amountCD);
		}

	}

}
