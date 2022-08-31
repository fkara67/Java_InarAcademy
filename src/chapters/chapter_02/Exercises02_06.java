package chapters.chapter_02;
import java.util.Scanner;
public class Exercises02_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int firstDigit = number % 10;
		int remainNumber = number / 10;
		int secondDigit = remainNumber % 10;
		int thirdDigit = remainNumber / 10;
		int sumOfDigits = firstDigit + secondDigit + thirdDigit;
		System.out.println("The sum of the digits of this number is: " + sumOfDigits);
		
	}

}
