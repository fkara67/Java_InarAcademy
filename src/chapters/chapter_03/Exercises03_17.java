package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_17 {

	public static void main(String[] args) {
		int computerNum = (int) (Math.random() * 3);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 0 or 1 or 2 : ");
		System.out.println("scissor(0), rock(1), paper(2)");

		int userNum = input.nextInt();

		if (computerNum == 0 && userNum == 1) {
			System.out.println("The computer is scissor. You are rock. You won. ");
		}
		if (computerNum == 1 && userNum == 2)
			System.out.println("The computer is rock. You are paper. You won. ");
		if (computerNum == 2 && userNum == 0)
			System.out.println("The computer is paper. You are scissor. You won. ");
		if (computerNum == 1 && userNum == 0)
			System.out.println("The computer is rock. You are scissor. You lost. ");
		if (computerNum == 2 && userNum == 1)
			System.out.println("The computer is paper. You are rock. You lost. ");
		if (computerNum == 0 && userNum == 2)
			System.out.println("The computer is scissor. You are paper. You lost. ");
		if (computerNum == userNum)
			System.out.println("The computer and you are the same. So it is a draw.");

		

	}

}
