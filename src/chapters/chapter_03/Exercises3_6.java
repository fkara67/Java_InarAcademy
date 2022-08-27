package chapters.chapter_03;
import java.util.Scanner;

public class Exercises3_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		System.out.println("Enter feet: ");
		System.out.println("Enter inches: ");
		
		double weight = input.nextDouble();
		double feet = input.nextDouble();
		double inches = input.nextDouble();
		
		final double KILOGRAMS_PER_POUNDS = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		final double METERS_PER_FEET = 0.3048;
		
		Double weightInKilogram = weight * KILOGRAMS_PER_POUNDS;
		Double heightInMeter = feet * 0.3048 + inches * 0.0254;
		double BMI =weightInKilogram / (heightInMeter* heightInMeter);
		
		System.out.println("BMI is " + BMI);
		if (BMI < 18.5)
			System.out.println("underweight");
		else if (BMI < 25)
			System.out.println("normal");
		else if (BMI < 30)
			System.out.println("overweight");
		else
			System.out.println("obese");
		
		
	}

}
