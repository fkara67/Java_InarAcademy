package weeks.week_03;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ages of three people: ");
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		
		if (age1 < age2 && age2 < age3) {
			System.out.println("The oldest one is " + age3 + " the youngest one is " + age1);
			
		}
        if (age1 < age3 && age3 < age2) {
        	System.out.println("The oldest one is " + age2 + " the youngest one is " + age1);
        	
        }
        if (age2 < age1 && age1 < age3) {
        	System.out.println("The oldest one is " + age3 + " the youngest one is " + age2);
        	
        }
        if (age2 < age3 && age3 < age1) {
        	System.out.println("The oldest one is " + age1 + " the youngest one is " + age2);
        	
        }
        if ( age3 < age1 && age1 < age2) {
        	System.out.println("The oldest one is " + age2 + " the youngest one is " + age3);
        }
        if (age3 < age2 && age2 < age1) {
        	System.out.println("The oldest one is " + age1 + " the youngest one is " + age3);
        	
        }
	}

}
