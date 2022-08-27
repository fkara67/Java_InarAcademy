package chapters.chapter_02;
import java.util.Scanner;
public class CountingMonetaryUnits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount as a decimal number,such as 11.56");
		double amount = input.nextDouble();
		
		int totalcent = (int)(amount * 100);
		System.out.println("The number of totalcent is: " + totalcent);
		
		int totaldollar = totalcent / 100;
		System.out.println("The number of dollars is: " + totaldollar);
		int remainingcent = totalcent % 100; //remainingcent %= 100
		
		int totalquarter = remainingcent / 25;
		System.out.println("The number of quarters is: " + totalquarter);
		remainingcent = remainingcent % 25;
		
		int totaldime = remainingcent / 10;
		System.out.println("The number of dimes is: " + totaldime);
		remainingcent = remainingcent % 10;
		
		int totalnickel = remainingcent / 5;
		System.out.println("The number of nickels is: " + totalnickel);
		
		int totalpenny = remainingcent % 5;
		System.out.println("The number of pennies is: " + totalpenny);
		
	
				
		
		
	}
	  

}
