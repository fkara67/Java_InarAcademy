package chapters.chapter_03;
import java.util.Scanner;

public class Exercises03_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		System.out.println("(for ax+by=e and cx+dy=f statements)");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		if (a * d - b * c == 0 ) {
			System.out.println("The equation has no solution.");	
		}
		else 
			System.out.println("x is " + x + " y is " + y);
	}

}
