package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int direction = input.nextInt();
		
		if (direction == 0) {
			System.out.println("Enter the dollar amount: ");
			double dollar = input.nextDouble();
			double exchange0 = dollar * rate;
			System.out.println("$" + dollar + " is " + exchange0);
		}
		else if (direction == 1) {
			System.out.println("Enter the RMB amount: ");
			double RMB = input.nextDouble();
			double exchange1 = (int)((RMB / rate) * 100) / 100.0;
			System.out.println(RMB + "yuan is $" + exchange1);
		}
		else 
			System.out.println("Incorrect input!");
		
		
			
	}

}
