package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN: ");
		String first9 = input.next();
		int checksum = 0;
		int inside = 0;
		String iSBN10 = "";
		for (int i = 0; i < 9; i++) {
			inside += (Integer.parseInt(first9.substring(i, i + 1)) * (i + 1));
			checksum = inside % 11;
		}
		if (checksum == 10) {
			iSBN10 = first9 + "X";

		} else
			iSBN10 = first9 + checksum;
		System.out.println("The ISBN-10 number is " + iSBN10);
	}

}
