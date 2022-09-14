package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Loan Amount: ");
		int loan = input.nextInt();

		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		double annualInterestRate = 0 ;
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.println("Interest Rate\t Monthly Payment\t Total Payment");
		for ( annualInterestRate = 5.000; annualInterestRate <= 8.000; annualInterestRate += 0.125) {
			double monthlyPayment = loan * monthlyInterestRate / 
					(1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
			double totalPayment = monthlyPayment * years * 12;
			System.out.printf("%-8.3f\t %-20.2f\t %-20.2f\n", annualInterestRate,monthlyPayment,totalPayment);
		}
	}

}
