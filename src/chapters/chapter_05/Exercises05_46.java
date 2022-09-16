package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.next();
		String reversedS = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			reversedS += ch;
		}
		System.out.println("The reversed string is " + reversedS);
	}

}
