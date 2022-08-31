package chapters.chapter_03;

import java.util.Scanner;

public class Exercises3_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1,x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = x2 * y1 - x1 * y2;
		double f = x4 * y3 - x3 * y4;
		
		
		double intersecx = (e * d - b * f) / (a *d - b * c);
		double intersecy = (a * f - e * c) / (a *d - b * c);
		intersecx = (int)(intersecx * 10000) / 10000.0;
	    intersecy = (int)(intersecy * 10000) / 10000.0;
		
		if ((a * d - b * c) == 0)
			System.out.println("The two lines are parallel");
		else
			System.out.println("The intersecting point is at (" + intersecx + "," + intersecy + ")");
		
			
		
	}

}
