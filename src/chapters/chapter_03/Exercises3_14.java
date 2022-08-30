package chapters.chapter_03;

import java.util.Scanner;

public class Exercises3_14 {

	public static void main(String[] args) {
		int flipOfCoin = (int)(Math.round(Math.random()));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a guess number (heads:0 or tails:1): ");
		int guess = input.nextInt();
		System.out.println("The flip of coin is " + flipOfCoin);
		
		
		if(guess == flipOfCoin) {
			System.out.println("The guess is correct!");
		}
		else
			System.out.println("The guess is incorrect!");
		
		
		
		
		
		
	}

}
