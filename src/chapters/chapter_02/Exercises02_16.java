package chapters.chapter_02;
import java.util.Scanner;
public class Exercises02_16 {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the side of the hexagon: ");
		double side = input.nextDouble();
		double area =3 * Math.pow(3, 0.5) / 2 * side * side;
		area = (int)(area * 1000) / 1000.0;
		System.out.println("The area of the hexagon is: " + area);
		
	
		
		

	}

}
