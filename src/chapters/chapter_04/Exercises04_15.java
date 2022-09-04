package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = input.nextLine();
		
		int number = 0;
		
		char letter1 = letter.charAt(0);
		letter1 = Character.toUpperCase(letter1);
		
		if (Character.isLetter(letter1)) {
			if (letter1 <= 'C')
				number = 2;
			else if (letter1 <= 'F')
				number = 3;
			else if (letter1 <= 'I')
				number = 4;
			else if (letter1 <= 'L')
				number = 5;
			else if (letter1 <= 'F')
				number = 3;
			else if (letter1 <= 'O')
				number = 6;
			else if (letter1 <= 'S')
				number = 7;
			else if (letter1 <= 'V')
				number = 8;
			else if (letter1 <= 'Z')
				number = 9;
			System.out.println("The corresponding number is " + number);
		}
		
		else 
			System.out.println(letter1 + " is an invalid input!");
		
	}

}
