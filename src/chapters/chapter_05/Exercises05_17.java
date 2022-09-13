package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer from 0 to 15: ");
		int number = input.nextInt();
		
		for (int count = 1; count < number + 1; count++) {
			System.out.print(count);
			System.out.println(count + (count - 1) + count);
		}
	}

}
