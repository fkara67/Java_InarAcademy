package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y- coordinates: ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.println("The point is " + ((y < 100 && y > 0 && x + 2 * y < 200) ? "" : "not ") + "in the triangle");
		
	
		
		
		
	}

}
