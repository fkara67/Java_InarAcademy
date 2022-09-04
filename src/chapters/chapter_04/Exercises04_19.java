package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first nine digits of an ISBN: ");
		String first9digit = input.next();
		
		int dig1 = Integer.parseInt(first9digit.substring(0, 1)); 
		int dig2 = Integer.parseInt(first9digit.substring(1, 2));
		int dig3 = Integer.parseInt(first9digit.substring(2, 3));
		int dig4 = Integer.parseInt(first9digit.substring(3, 4));
		int dig5 = Integer.parseInt(first9digit.substring(4, 5));
		int dig6 = Integer.parseInt(first9digit.substring(5, 6));
		int dig7 = Integer.parseInt(first9digit.substring(6, 7));
		int dig8 = Integer.parseInt(first9digit.substring(7, 8));
		int dig9 = Integer.parseInt(first9digit.substring(8, 9));
		
		int dig10 =(dig1 * 1 + dig2 * 2 + dig3 * 3 + dig4 * 4 + dig5 * 5 + dig6 * 6 +
				dig7 * 7 + dig8 * 8 + dig9 * 9) %11;
		
		
		if (dig10 == 10)
			System.out.println(first9digit + "X");
		else 
			System.out.println(first9digit + dig10);
		
	}

}
