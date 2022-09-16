package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else if (Character.isLetter(ch)) {
				consonantCount++;
			}

		}

		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + consonantCount);
	}

}
