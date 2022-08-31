package chapters.chapter_02;
import java.util.Scanner;
public class Exercises02_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed in m/s: ");
		System.out.println("acceleration in m/s²: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		double runwayLength = ((speed * speed / (2 * acceleration)) * 100) / 100.0;
		System.out.println("The minimum runway length for this airplane is " + runwayLength);
		
		

	}

}
