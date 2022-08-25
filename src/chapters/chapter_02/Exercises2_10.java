package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms: ");
		System.out.println("Enter the initial temperature in degrees Celsius: ");
		System.out.println("Enter the final temperature in degrees Celsius: ");
		double theAmountOfWater = input.nextDouble();
		double initialTemperature = input.nextDouble();
		double finalTemperature = input.nextDouble();
		double neededEnergy = theAmountOfWater * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is: " + neededEnergy);
		
		

	}

}
