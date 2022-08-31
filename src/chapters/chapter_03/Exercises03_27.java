package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x- and y- coordinates: ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double bx = 0 - 0;
		double by = 100 - 0;
		double cx = 200 - 0;
		double cy = 0 - 0;
		double x1 = x - 0;
		double y1 = y - 0;
		double d = 0 * 0 - 200 * 100;
		double WA = (x * 100 + y * 200 + 0 - 200 * 100) / -200 * 100;
		double WB = (x * 0 - y * 0) / d;
		double WC = (y * 0 - x * 100) / d;
		
	
		
		if ((WA < 0 && WA > 1) && (WB < 0 && WB > 1) && (WC < 0 && WC > 1)){
			System.out.println("The point is in the triangle");
		}
		else 
			System.out.println("The point is not in the triangle");
		
		
		
	}

}
