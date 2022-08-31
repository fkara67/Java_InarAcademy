package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides of the polygon: ");
		double sideNumber = input.nextDouble(); 
		
		System.out.println("Enter the length of one side of the polygon: ");
		double sideLength = input.nextDouble();
		
		double area = (sideNumber * sideLength * sideLength) / (4 * Math.tan(Math.PI / sideNumber));
		
		System.out.println("The area of the polygon is " + area);
		
		
		
	}

}
