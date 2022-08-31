package chapters.chapter_03;

import java.util.Scanner;

public class Exercises3_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter circle1'center x-, y- coordinates and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.println("Enter circle2'center x-, y- coordinates and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double distanceCenter = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		if (r1 < r2) {
			double temp = r1;
			r1 = r2;
			r2 = temp;
		}
		if (distanceCenter <= r1 - r2)
			System.out.println("Circle2 is inside circle1");
		else if (distanceCenter <= r1 + r2)
			System.out.println("Circle1 overlaps cirle1");
		else
			System.out.println("Circle2 does not overlap circle1 and is not inside circle1");
		
		
		
		
		
		
		
	}

}
