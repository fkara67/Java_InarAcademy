package weeks.week_03;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4 digit number: ");
		
		int number = input.nextInt();
		
		int unitsDigit = number % 10;
		int remainNumber = number / 10;
		int tensDigit = remainNumber % 10;
		remainNumber = remainNumber / 10;
		int hundredsDigit = remainNumber % 10;
		int thousandsDigit = remainNumber / 10;
		
		int newNumber = (unitsDigit * 1000) + (tensDigit * 100) + (hundredsDigit* 10) + (thousandsDigit);
		
		
		System.out.println("The new number is " + newNumber);
		
		
	}

}
