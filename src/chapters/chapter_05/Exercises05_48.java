package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_48 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		String oddP = "";
		for (int i = 0; i < s.length(); i += 2) {
			oddP += s.charAt(i);
		}
		System.out.println(oddP);
	}

}
