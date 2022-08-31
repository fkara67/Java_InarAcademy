package chapters.chapter_02;
import java.util.Scanner;
import java.util.concurrent.Future;
public class Exercises02_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		System.out.println("Enter annual interest rate: ");
		System.out.println("Enter number of years: ");
		double investmentAmount = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double numberOfYears = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
		futureInvestmentValue = (int)(futureInvestmentValue * 100) / 100.0;
		System.out.println("The accumulated value of future investment is: " + futureInvestmentValue);
		
		
	}

}
