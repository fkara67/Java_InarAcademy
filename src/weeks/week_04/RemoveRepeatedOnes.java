package weeks.week_04;

import java.util.Scanner;

public class RemoveRepeatedOnes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String first = input.nextLine();
		String last = "";

		for (int i = 0; i < first.length(); i++) {
			char ch = first.charAt(i);
			if (last.contains("" + ch) == false) {
				last += ch;
			}
		}
		System.out.println(last);

	}
}
