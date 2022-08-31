package chapters.chapter_02;
import java.util.Scanner;
public class Exercises02_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a monthly saving amount: ");
		double monthlySavingAmount = input.nextDouble();
		double annualInterestRate = 0.05;
		double monthlyInterestRate = 0.05 / 12;
		double afterFirstMonthValue = monthlySavingAmount * (1 + monthlyInterestRate);
		double afterSecondMonthValue = (monthlySavingAmount + afterFirstMonthValue) * (1 + monthlyInterestRate);
		double afterThirdMonthValue = (monthlySavingAmount + afterSecondMonthValue) * (1 + monthlyInterestRate);
		double afterForthMonthValue = (monthlySavingAmount + afterThirdMonthValue) * (1 + monthlyInterestRate);
		double afterFifthMonthValue = (monthlySavingAmount + afterForthMonthValue) * (1 + monthlyInterestRate);
		double afterSixthMonthValue = (monthlySavingAmount + afterFifthMonthValue) * (1 + monthlyInterestRate);
		afterSixthMonthValue = (int)(afterSixthMonthValue * 100) / 100.0;
		System.out.println("After the sixth month, the account value is: " + afterSixthMonthValue);
		
		
		
		
		
		 
		
		

	}

}
