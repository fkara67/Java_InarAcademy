package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = input.nextLine();

		if (s1.length() > s2.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		String common = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				common += s1.charAt(i);

			}

		}
		if (common == "") {
			System.out.println(s1 + " and " + s2 + " have no common prefix");

		} else {
			System.out.println("The common prefix is \"" + common + "\"");
		}
	}

}
