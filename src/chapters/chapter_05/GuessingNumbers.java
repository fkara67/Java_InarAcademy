package chapters.chapter_05;

import java.util.Scanner;

public class GuessingNumbers {

	public static void main(String[] args) {
		int number =(int)(Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		
		int guess = -1;
		while (number != guess) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			if (guess < number)
				System.out.println("Your guess is too low.");
			else if (guess > number)
				System.out.println("Your guess is too high.");
			
		}
		System.out.println("Yes, the number is " + number + "!");
	}

}
