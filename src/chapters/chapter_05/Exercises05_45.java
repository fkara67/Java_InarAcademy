package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		
		double mean = 0;
		double deviation = 0;
		double sumOfnumbers = 0;
		double sumOfSquares = 0;
		for (int i = 1; i <= 10; i++) {
			double number = input.nextDouble();
			sumOfnumbers += number;
			sumOfSquares += Math.pow(number, 2);
			
		}
		mean = sumOfnumbers / 10;
		deviation = Math.sqrt((sumOfSquares - Math.pow(sumOfnumbers, 2) / 10) / 9);
		System.out.println("The mean is " + mean);
		System.out.printf("The standart deviation is %2.5f" ,deviation);
	}

}
