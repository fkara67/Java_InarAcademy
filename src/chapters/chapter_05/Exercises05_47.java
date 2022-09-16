package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		String s = input.next();
		String iSBN = "";
		if (s.length() != 12) {
			System.out.println(s + " is an invalid input");
			System.exit(0);
		}
		int inside = 0;
		int checksum = 0;
		for (int i = 0; i < 11; i += 2) {
			inside += Integer.parseInt(s.substring(i, i+1)) + 
					3 * Integer.parseInt(s.substring(i + 1, i + 2));
			
		}
		checksum = 10 - inside % 10;
		if (checksum == 10) {
			iSBN = s + 0;
		}
		else
			iSBN = s + checksum;
		System.out.println("The ISBN-13 number is " + iSBN);
		
			
	}
	

}
