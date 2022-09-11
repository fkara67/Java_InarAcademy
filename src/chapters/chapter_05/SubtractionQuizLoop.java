package chapters.chapter_05;

import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {

		long startsTime = System.currentTimeMillis();
		int count = 0;
		int correctCount = 0;
		String output = "";
		Scanner input = new Scanner(System.in);

		while (count < 5) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.println("What is " + num1 + "-" + num2 + "?");
			int answer = input.nextInt();
			
			if (num1 - num2 == answer) {
				System.out.println("Yes, you are correct!\n");
				correctCount++;
			}
			else {
				System.out.println("No, you are wrong.\n" + num1 + "-" + num2 + " should be " + (num1 - num2) + "\n");
				}
			
			output += "\n" + num1 + "-" + num2 + "=" + answer + ((num1 - num2 == answer)? " correct" : " wrong");
			count++;
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startsTime;
		System.out.println("\nCorrect Count: " + correctCount + 
				"\nTest Time: " + testTime / 1000 + " seconds\n" + output);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	}
