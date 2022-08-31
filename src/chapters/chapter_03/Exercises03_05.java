package chapters.chapter_03;
import java.util.Scanner;

public class Exercises03_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's number: ");
		System.out.println("(sunday is 0, monday is 1, ...saturday is 6)");
		int numberOfToday = input.nextInt();
		if (numberOfToday == 0)
			System.out.println("Today is sunday");
		else if (numberOfToday == 1)
			System.out.println("Today is monday");
		else if (numberOfToday == 2)
			System.out.println("Today is tuesday");
		else if (numberOfToday == 3)
			System.out.println("Today is wednesday");
		else if (numberOfToday == 4)
			System.out.println("Today is thursday");
		else if (numberOfToday == 5)
			System.out.println("Today is friday");
		else if ( numberOfToday == 6)
			System.out.println("Today is saturday");
		System.out.println("Enter the number of days elapsed since today: ");
		int numberOfElapsedDays = input.nextInt();
	
		int futureDay;
		
		if ((numberOfToday + numberOfElapsedDays) % 7 == 0)
			System.out.println(numberOfElapsedDays + " days after today, the day is: sunday");
		else if ((numberOfToday + numberOfElapsedDays) % 7 == 1)
			System.out.println(numberOfElapsedDays + " days after today, the day is: monday");
		else if ((numberOfToday + numberOfElapsedDays) % 7 == 2)
			System.out.println(numberOfElapsedDays + " days after today, the day is: tuesday");
		else if ((numberOfToday + numberOfElapsedDays) % 7 == 3)
			System.out.println(numberOfElapsedDays + " days after today, the day is: wednesday");
		else if ((numberOfToday + numberOfElapsedDays) % 7 == 4)
			System.out.println(numberOfElapsedDays + " days after today, the day is: thursday");
		else if ((numberOfToday + numberOfElapsedDays) % 7 == 5)
			System.out.println(numberOfElapsedDays + " days after today, the day is: friday");
		else if ((numberOfToday + numberOfElapsedDays) % 7 == 6)
			System.out.println(numberOfElapsedDays + " days after today, the day is: saturday");
		
		
			
		
			
		
		
	}

}
