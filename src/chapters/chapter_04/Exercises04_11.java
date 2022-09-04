package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer (0 to 15): ");
		int decimal = input.nextInt();
		
	
	
		if (10 <= decimal && decimal <= 15 ) {
			char hex = (char)(decimal + 'a' - 10);
			System.out.println("The hex value for decimal value is " + hex);
		}
		else if (0 <= decimal && decimal < 10) {
			int hex = decimal;
			System.out.println("The hex value for decimal value is " + hex);
		}
		else 
			System.out.println(decimal + " is an invalid input!");
		
		

}
}