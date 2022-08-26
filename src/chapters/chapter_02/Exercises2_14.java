package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		System.out.println("Enter height in inches: ");
		double weightInPounds = input.nextDouble();
		double heightInInches = input.nextDouble();
		double weightInKilogram = weightInPounds * 0.45359237;
		double heightInMeters = heightInInches * 0.0254;
		double bodyMassIndex = weightInKilogram / (heightInMeters * heightInMeters);
		bodyMassIndex = (int)(bodyMassIndex * 100) / 100.0;
		System.out.println("Body Mass Index is: " + bodyMassIndex);
		
		

	}

}
