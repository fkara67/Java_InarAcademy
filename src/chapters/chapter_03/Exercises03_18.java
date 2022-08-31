package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight to be shipped in pounds: ");
		double weight = input.nextDouble();
		
		double cost;
		
		if (weight <= 1) {
			cost = 3.5;
		System.out.println("The shipping cost is " + cost);
	}
		else if (weight <= 3) {
			cost = 5.5;
			System.out.println("The shipping cost is " + cost);
		}
		else if (weight <= 10) {
			cost = 8.5;
			System.out.println("The shipping cost is " + cost);
		}
		else if (weight <= 20) {
			cost = 10.5;
			System.out.println("The shipping cost is " + cost);
		}
		else if (weight > 50)
			System.out.println("The package cannot be shipped.");
	}
}
