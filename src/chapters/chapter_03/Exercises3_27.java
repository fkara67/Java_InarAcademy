package chapters.chapter_03;

import java.util.Scanner;

public class Exercises3_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x- and y- coordinates: ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if ((x < 100 && x>0) && (y < 50 && y > 0)){
			System.out.println("The point is in the triangle");
		}
		else 
			System.out.println("The point is not in the triangle");
		
		
		System.out.println(7 % 10);	
	}

}
