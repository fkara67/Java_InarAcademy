package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount, for example, 11.56: ");
		String amount = input.nextLine();
		
		String numberOfDollars = amount.substring(0,amount.indexOf('.'));
		String remainingCents = amount.substring(amount.indexOf('.') + 1);
		
		int remainingCents1 = Integer.parseInt(remainingCents);
		int numberOfQuarters = remainingCents1 / 25;
		remainingCents1 %= 25;
		int numberOfDimes = remainingCents1 / 10;
		remainingCents1 %= 10;
		int numberOfNickels = remainingCents1 / 5;
		int numberOfpennies = remainingCents1 % 5;
		
		System.out.println("Your amount " + amount + " consists of" + 
		"\n" + numberOfDollars + "dollars" + 
		"\n" + numberOfQuarters + "quarters" +
		"\n" + numberOfDimes + "dimes" +
		"\n" + numberOfNickels + "nickels" +
		"\n" + numberOfpennies + "pennies");
	}

}
