package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g. 2012): ");
		int year = input.nextInt();
		
		System.out.println("Enter month: 3-12:(january and february are counted as months 13 and 14 of the previous year");
		int month = input.nextInt();
		
		System.out.println("Enter the day of the month: 1-31: ");
		int dayOfMonth = input.nextInt();
		
		int dayOfWeek = ((dayOfMonth + (26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7;
		
		if (dayOfWeek == 0)
			System.out.println("Day of week is Saturday");
		else if (dayOfWeek == 1)
			System.out.println("Day of week is Sunday");
		else if (dayOfWeek == 2)
			System.out.println("Day of week is Monday");
		else if (dayOfWeek == 3)
				System.out.println("Day of week is Tuesday");
		else if (dayOfWeek == 4)
				System.out.println("Day of week is Wednesday");
		else if (dayOfWeek == 5)
				System.out.println("Day of week is Thursday");
		else if (dayOfWeek == 6)
				System.out.println("Day of week is Friday");
   
				
		
		
	}

}
