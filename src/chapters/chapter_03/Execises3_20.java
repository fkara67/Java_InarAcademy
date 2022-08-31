package chapters.chapter_03;

import java.util.Scanner;

public class Execises3_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		System.out.println("Enter the wind speed in miles per hour: ");
		
		double temperature = input.nextDouble();
		double speed = input.nextDouble();
		
		double windChill = (35.74) + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));
		windChill =(int)(windChill * 10000) / 10000.0;
		if ((temperature > -58 && temperature < 41) && (speed >= 2))
				System.out.println("The wind chill index is " + windChill);
		
		else if (!((temperature > -58 && temperature < 41) && (speed >= 2)))
				System.out.println(" the temperature and/or wind speed is invalid");
		
		
	}

}
