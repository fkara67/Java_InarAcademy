package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a Celsius degree: ");
		double Celsius = input.nextDouble();
		double fahrenheit = (9.0 / 5) * Celsius + 32;
		System.out.print(Celsius + " celsisus" + " is " + fahrenheit + " fahrenheit ");
		
		
		
	}
	

}
