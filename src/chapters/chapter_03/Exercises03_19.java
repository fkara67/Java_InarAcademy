package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three edge legths of triangle:  ");
		
		int edge1 = input.nextInt();
		int edge2 = input.nextInt();
		int edge3 = input.nextInt();
		
		int perimeter = edge1 + edge2 + edge3;
		
		if ((edge1 >= edge2 + edge3) || (edge2 >= edge1 + edge3) || (edge3 >= edge1 + edge2)) {
			System.out.println("The input is invalid.");
		}
		else if ((edge1 < edge2 + edge3) || (edge2 < edge1 + edge3) || (edge3 < edge1 + edge2))
			System.out.println("The perimeter of the triangle is " + perimeter);
		
		 
		
	}

}
