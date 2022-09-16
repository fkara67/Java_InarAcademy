package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer (0 ends the input): ");
		int data = input.nextInt();
		
		int maxCount = 0;
		int max = 0;
		while (data != 0) {
			System.out.println("Enter an integer (0 ends the input): ");
			data = input.nextInt();
			if (data > max) {
				max = data;
				maxCount = 1;
			}
			else if (data == max) {
				maxCount++;
			}
			
			
				
		}
		System.out.println("Largest number is " + max + 
				"\nThe occurrence count of the largest number is " + maxCount);
		
	}

}
