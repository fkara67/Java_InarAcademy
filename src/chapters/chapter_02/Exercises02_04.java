package chapters.chapter_02;
import java.util.Scanner;
public class Exercises02_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilogram = pounds * 0.454;
		System.out.println(pounds + " pounds is: " + kilogram + " kilograms");
		
		
	}

}
