package chapters.chapter_02;
import java.util.Scanner;
public class Exercises02_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 and y1: ");
		System.out.println("Enter x2 and y2: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double distance = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		distance = Math.pow(distance, 0.5);
		System.out.println("The distance between the two points is: " + distance);
		
		

	}

}
