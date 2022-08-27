package weeks.week_02;
import java.util.Scanner;
public class diff21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number(n): ");
		int n = input.nextInt();
		
		int diff = 21 - n;
		if (diff < 0)
			System.out.println("diff(21)= " + (-diff));
		else
			System.out.println("diff(21)= " + diff);
		
	}

}
