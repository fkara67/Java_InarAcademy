package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and legth of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double pi = 3.14159;
		double area = radius * radius * pi;
		double wolume = area * length;
		area = (area / 100) * 100;
		wolume = (wolume / 100) * 100;
		System.out.println("The area is: " + area + " The wolume is: " + wolume);
		
		
		
	}

}
