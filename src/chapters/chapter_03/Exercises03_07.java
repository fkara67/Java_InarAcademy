package chapters.chapter_03;
import java.util.Scanner;

public class Exercises03_07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount as a decimal number such as 11.56: ");
		double amount = input.nextDouble();
		
		int totalCent = (int)(amount * 100);
		if (totalCent > 0) {
			if (totalCent > 1 )
			System.out.println("the total cents is : " + totalCent + " cents");
			else 
				System.out.println("the total cents is: " + totalCent + " cent");}
		int totalDollar = totalCent / 100;
		if (totalDollar > 0) {
			if (totalDollar > 1)
				System.out.println("the total dollars is: " + totalDollar + "dollars");
			else
				System.out.println("the total dollars is: " + totalDollar + "dollar");
		}
		int remainingCent = totalCent % 100;
		int totalQuarter = remainingCent / 25;
		if (totalQuarter > 0) {
			if (totalQuarter > 1)
				System.out.println("the total quarters is: " + totalQuarter + " quarters");
			else
				System.out.println("the total quarters is" + totalQuarter + " quarter");}
		remainingCent = remainingCent % 25;
		int totalDime = remainingCent / 10;
		if (totalDime > 0) {
			if (totalDime > 1)
				System.out.println("the total dimes is:" +totalDime + " dimes");
			else
				System.out.println("the total dimes is: " +totalDime + " dime");}
		remainingCent = remainingCent % 10;
		int totalNickel = remainingCent / 5;
		if (totalNickel > 0) {
			if (totalNickel > 1)
				System.out.println("the total nickels is: " + totalNickel + " nickels");
			else
				System.out.println("the total nickels is: " + totalNickel + " nickel");}
		int totalPenny = remainingCent % 5;
		if ( totalPenny > 0) {
			if (totalPenny > 1)
				System.out.println("the total pennies is: " + totalPenny + " pennies");
			else
				System.out.println("the total pennies is: " + totalPenny + " penny");}
			
		}
		
		
		
        	
		
		
		
		
		
		
	}


