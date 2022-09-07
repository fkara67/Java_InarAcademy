package chapters.chapter_03;

import java.util.Scanner;

public class Exercises03_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight and price for packace 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.println("Enter weight and price for packace 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double unitPrice1 = price1 / weight1;
		double unitPrice2 = price2 / weight2;
		
		if (unitPrice1 < unitPrice2)
			System.out.println("Packace1 has a better price");
		else if (unitPrice2 < unitPrice1)
			System.out.println("Packace2 has a better price");
		else
			System.out.println("Two packages have the same price.");

	}

}
