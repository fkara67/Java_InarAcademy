package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		int integer = input.nextInt();
		
		
		System.out.println("Is " + integer + "divisible by 5 and 6? " + (integer % 5 == 0 && integer % 6 == 0));
		System.out.println("Is " + integer + "divisible by 5 or 6? " + (integer % 5 == 0 || integer % 6 == 0));
		System.out.println("Is " + integer + "divisible by 5 or 6,but not both? " + (integer % 5 == 0 ^ integer % 6 == 0));
		
	}

}
