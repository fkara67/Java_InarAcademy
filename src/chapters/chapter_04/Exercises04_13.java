package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = input.next();
		char letter1 = letter.charAt(0);
		
		
		if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") ||
		    letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("ö") ||
		    letter.equalsIgnoreCase("ü")){
			
			System.out.println(letter + " is a vowel");
			}
		else if (Character.isLetter(letter1))
			System.out.println(letter + " is a constant");
		else
			System.out.println(letter + " is a invalid input");
		    
		
		
		
	}
}
