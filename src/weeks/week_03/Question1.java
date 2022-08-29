package weeks.week_03;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a salary(in dollars) and year of service: ");
		
		double salary = input.nextDouble();
		double year = input.nextDouble();
		
		double bonus = salary * 0.05;
		
		if (year > 5) {
			System.out.println("Your net bonus amount is: " + bonus + "$");
			
		}
		else 
			System.out.println("Unfortunately,you have no bonus.");
		
			
		
	}

}
