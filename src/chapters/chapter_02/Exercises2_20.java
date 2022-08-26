package chapters.chapter_02;
import java.util.Scanner;

public class Exercises2_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter balance and interest rate: ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double interest = balance * (annualInterestRate / 1200);
		interest = (int)(interest * 1000) / 1000.0;
		System.out.println("The interest is: " + interest);
		
		
	}

}
