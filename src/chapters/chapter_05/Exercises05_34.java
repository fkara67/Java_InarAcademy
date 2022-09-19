package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_34 {

	public static void main(String[] args) {

		for (int compCount = 0, userCount = 0; Math.abs(compCount - userCount) < 2;) {
			int computerNum = (int) (Math.random() * 3);

			Scanner input = new Scanner(System.in);
			System.out.println("Enter 0 or 1 or 2 : ");
			System.out.println("scissor(0), rock(1), paper(2)");

			int userNum = input.nextInt();

			if (computerNum == 0 && userNum == 1 || computerNum == 1 && userNum == 2
					|| computerNum == 2 && userNum == 0) {
				System.out.println("The computer is scissor. You are rock. You won. ");
				userCount++;
			}

			if (computerNum == 1 && userNum == 0 || computerNum == 2 && userNum == 1
					|| computerNum == 0 && userNum == 2) {
				System.out.println("The computer is rock. You are scissor. You lost. ");
				compCount++;
			}

			if (computerNum == userNum)
				System.out.println("The computer and you are the same. So it is a draw.");
			if (compCount - userCount == 2)
				System.out.println("\nIn total computer won!");
			if (userCount - compCount == 2)
				System.out.println("\nIn total you won!");

		}

	}

}
