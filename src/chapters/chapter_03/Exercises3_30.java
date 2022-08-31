package chapters.chapter_03;

import java.util.Scanner;

public class Exercises3_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		long zoneOffset = input.nextLong();
		
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours / 24;
		
		currentHour = currentHour + zoneOffset;

		if (currentHour >= 12 && currentHour < 24)
			System.out.println("The current time is " + currentHour % 12 + ":" + currentMinutes + ":" + currentSecond + " GMT " + zoneOffset + " PM");
		
		
		
		
		
		
		
		
	}

}
