package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Social Security Number in the format DDD-DD-DDDD: ");
		String ssn = input.next();
		
		if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-' &&
				Character.isDigit(ssn.charAt(0)) &&
				Character.isDigit(ssn.charAt(1)) && 
				Character.isDigit(ssn.charAt(2)) &&
				Character.isDigit(ssn.charAt(4)) &&
				Character.isDigit(ssn.charAt(5)) &&
				Character.isDigit(ssn.charAt(7)) &&
				Character.isDigit(ssn.charAt(8)) &&
				Character.isDigit(ssn.charAt(9)) &&
				Character.isDigit(ssn.charAt(10))) 
			System.out.println(ssn + " is a valid social security number.");
	
		else 
			System.out.println(ssn + " is an invalid social security number.");
	}

}
