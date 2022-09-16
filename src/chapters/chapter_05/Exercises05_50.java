package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_50 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		int upperCaseCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
			
		}
		System.out.println("The number of uppercase letters is " + upperCaseCount);
	}

}
