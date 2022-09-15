package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int decimal = input.nextInt();
		
		String octal = "";
		
		for (int i = decimal; i > 0; i /= 8) {
			octal = i % 8 + octal;
		}
		System.out.println(octal);
	}

}
