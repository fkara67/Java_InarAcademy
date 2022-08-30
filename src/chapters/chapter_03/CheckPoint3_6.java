package chapters.chapter_03;

import java.util.Scanner;

public class CheckPoint3_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your score and pay: ");
		double score = input.nextDouble();
		double pay = input.nextDouble();
		
		if ( score > 90) {
			pay = pay + (pay * 0.03);
			System.out.println("Your new pay = " + pay);
		}
			
		else {
			pay = pay + (pay * 0.01);
			System.out.println("Your new pay = " + pay);
			
		}
		 		
	}
}
