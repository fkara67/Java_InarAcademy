package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilogram = pounds * 0.454;
		System.out.println(pounds + " pounds is: " + kilogram + " kilograms");
		
		
	}

}
