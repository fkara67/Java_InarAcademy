package chapters.chapter_03;
import java.util.Scanner;

public class Exercises3_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three different integers: ");
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();
		int integer3 = input.nextInt();
		
		if (integer1 < integer2 && integer2 < integer3)
			System.out.println(integer1 + "<" + integer2 + "<" + integer3 );
		if(integer2 < integer1 && integer1 < integer3)
			System.out.println(integer2 + "<" + integer1 + "<" + integer3);
		if (integer3 < integer2 && integer2 < integer1)
			System.out.println(integer3 + "<" + integer2 + "<" + integer1);
		if (integer1 < integer3 && integer3 < integer3)
			System.out.println(integer1 + "<" + integer3 + "<" + integer2);
		if (integer2 < integer3 && integer3 < integer1)
			System.out.println(integer2 + "<" + integer3 + "<" + integer1);
		if (integer3 < integer1 && integer1 < integer2)
			System.out.println(integer3 + "<" + integer1 + "<" + integer2);
		else
			System.out.println("you entered incorrectly.It must be three different integers. ");
		
		
	}			
}
