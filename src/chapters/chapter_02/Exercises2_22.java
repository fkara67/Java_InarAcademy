package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in integer, for example "
				+ "1156 for 11 dollars and 56 cents: ");
		int amount = input.nextInt();
		
		
		
		int totalDollar = amount / 100;
		System.out.println("The number of total dollars is: " + totalDollar);
		int remainingCent = amount % 100;
		
		int totalQuarter = remainingCent / 25;
		System.out.println("The number of total quarters is: " + totalQuarter);
		remainingCent = remainingCent % 25;
		
		int totalDime = remainingCent / 10;
		System.out.println("The number of total dimes is: " + totalDime);
		remainingCent = remainingCent % 10;
		
		int totalNickel = remainingCent / 5;
		System.out.println("The number of total nickels is: " + totalNickel);
		
		int totalPenny = remainingCent % 5;
		System.out.println("The number of total pennies is: " + totalPenny);
		
		
		
		
	}

}
