package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
	}

}
