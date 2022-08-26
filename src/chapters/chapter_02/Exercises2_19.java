package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points of a triangle:  [like(x1, y1)(x2, y2)(x3, y3)]");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		double x3 =input.nextDouble();
		double y3 = input.nextDouble();
		double side1 = Math.pow((Math.pow(y1-x1, 2) + Math.pow(y2-x2, 2)), 0.5);
		double side2 = Math.pow((Math.pow(y1-x1, 2) + Math.pow(y3-x3, 2)), 0.5);
		double side3 = Math.pow((Math.pow(y2-x2, 2) + Math.pow(y3-x3, 2)), 0.5);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		area = (int)(area * 100) / 100.0;
		System.out.println("the area of the triangle is: " + area);
		

	}

}
