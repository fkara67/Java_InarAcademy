package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r1's center x-, y- coordinates, width and height: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		double r1Left = x1 - width1 / 2;
		double r1Right = x1 + width1 / 2;
		double r1Top = y1 + height1 / 2;
		double r1Bottom = y1 - height1 / 2;
		
		System.out.println("Enter r2's center x-, y- coordinates, width and height: ");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		double r2Left = x2 - width2 / 2;
		double r2Right = x2 + width2 / 2;
		double r2Top = y2 + height2 / 2;
		double r2Bottom = y2 - height2 / 2;
		
		if ((r1Right >= r2Right) && (r1Left <= r2Left) && (r1Top >= r2Top) && (r1Bottom <= r2Bottom))
			System.out.println("r2 is inside the r1");
		
		else if  ((r1Right < r2Left) || (r1Left > r2Right) || (r1Top < r2Bottom) || (r1Bottom > r2Top))
			System.out.println("r2 is not inside the r1 and does not overlap r1 ");
		else
			System.out.println("r2 overlaps r1");
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
	}

}
