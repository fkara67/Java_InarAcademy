package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		
		int i = input.nextInt();
		
		System.out.println("The character for ASCII code " + i + " is " + (char)i );
		
		
		
	}

}
