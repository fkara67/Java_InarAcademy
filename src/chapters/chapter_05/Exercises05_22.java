package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.println("Number of Years: ");
		int year = input.nextInt();
		System.out.println("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = loan * monthlyInterestRate / 
				(1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
		double totalPayment = monthlyPayment * year * 12;
		System.out.printf("Monthly Payment: %10.2f", monthlyPayment);
		System.out.printf("\nTotal Payment: %10.2f",totalPayment);
		System.out.println("  ");
		System.out.println("\nPayment#\t Interest\t Principal\t Balance");
		
		double balance = loan;
		for (int month = 1; month <= year * 12; month++) {
			
			
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance -=principal;
			
			System.out.printf("%-10d\t %-9.2f\t%7.2f\t\t%8.2f\n",month, interest,principal,balance);
			
		}
	}

}
