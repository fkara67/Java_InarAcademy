package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade (A to F except E): ");
		String letter = input.nextLine();
		
		char letter1 = letter.charAt(0);
		letter1 = Character.toUpperCase(letter1);
		
		if ('A' <= letter1 && letter1 <= 'F' && letter1 != 'E') {
			System.out.println("The numeric value for grade " + letter1 + " is ");
			
			
			switch(letter1) {
			case 'A' : System.out.println(4); break;
			case 'B' : System.out.println(3); break;
			case 'C' : System.out.println(2); break;
			case 'D' : System.out.println(1); break;
			case 'F' : System.out.println(0);}
		}	
		else 
		    System.out.println(letter + " is an invalid grade!");
		
	}
			
		}
		
			

	
		

