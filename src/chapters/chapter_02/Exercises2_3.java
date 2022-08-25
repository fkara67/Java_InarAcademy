package chapters.chapter_02;
import java.util.Scanner;

public class Exercises2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in feet: ");
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		System.out.println(feet + " feet is: " + meter + " meters");
		
		
	}

}
