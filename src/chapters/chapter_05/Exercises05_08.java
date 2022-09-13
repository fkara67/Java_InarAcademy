package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();

		double maxScore = 0;
		String nameOfMax = "";
		System.out.println("Enter each student's name and score: ");

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Student " + (i + 1) + ":\nName:");
			String name = input.next();
			System.out.println("\nScore: ");
			int score = input.nextInt();

			if (score > maxScore) {
				maxScore = score;
				nameOfMax = name;
			}

		}
		System.out.println("The name of the student with the highest score is " + nameOfMax);
	}

}
