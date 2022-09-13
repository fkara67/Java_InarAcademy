package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		int maxScore = 0;
		int secondMaxScore = 0;
		String maxName = "";
		String secondMaxName = "";
		System.out.println("Enter each student's name and score: ");
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Student " + (i+1) + "\nName: ");
			String name = input.next();
			System.out.print("\nScore: ");
			int score = input.nextInt();
			if (score > maxScore) {
				secondMaxScore = maxScore;
				secondMaxName = maxName;
				maxScore = score;
				maxName = name;
			}
			else if (score > secondMaxScore) {
				secondMaxScore = score;
				secondMaxName = name;
			}
		}
		System.out.println("The name of the student with the highest score is " + maxName + 
				"\nThe name of the student with the second highest score is " + secondMaxName);
	}

}
