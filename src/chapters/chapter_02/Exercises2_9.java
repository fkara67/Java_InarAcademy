package chapters.chapter_02;

import java.util.Scanner;

public class Exercises2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double averageAcceleration = (v1 - v0) / t;
		averageAcceleration = (int)(averageAcceleration * 100) / 100.0;
		System.out.println("The average acceleration is: " + averageAcceleration);
	}
}
