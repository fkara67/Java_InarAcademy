package chapters.chapter_03;
import java.util.Scanner;

public class Exercises03_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b and c (for ax²+bx+c=0 statement): ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double r1 = (-b + Math.pow(b*b-4*a*c, 0.5)) / 2 * a;
		double r2 = (-b - Math.pow(b*b-4*a*c, 0.5)) / 2 * a;
		r1 = (int)(r1 * 1000) / 1000.0;
		r2 = (int)(r2 * 1000) / 1000.0;
		
		double discriminant = b * b - 4 * a * c;
		
		if (discriminant > 0) {
			System.out.println("The equation has two roots: " + r1 + "and" + r2);
		}
		if (discriminant == 0) {
			System.out.println("The equation has one root: " + r1);
		}
		if (discriminant < 0) {
			System.out.println("The equation has no real roots.");
			
		}
	}
}
