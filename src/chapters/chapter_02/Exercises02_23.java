package chapters.chapter_02;
import java.util.Scanner;
public class Exercises02_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		System.out.println("Enter the miles per gallon: ");
		System.out.println("Enter the prices per gallon: ");
		double distance = input.nextDouble();
		double milesPerGallon = input.nextDouble();
		double pricePerGallon = input.nextDouble();
		double costOfDriving = distance / milesPerGallon * pricePerGallon;
		costOfDriving = (int)(costOfDriving * 100) / 100.0;
		System.out.println("The cost of driving is: " + costOfDriving);
		
		
		
	}

}
