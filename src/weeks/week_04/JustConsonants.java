package weeks.week_04;

import java.util.Scanner;

public class JustConsonants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		int l = s.length();
		String result = "";

		for (int i = 0; i < l; i++) {
			char harf = s.charAt(i);

			if (!(harf == 'a' || harf == 'e' || harf == 'o' || harf == 'i' || harf == 'u' ||
					harf == 'A' || harf == 'E' || harf == 'O' || harf == 'I' || harf == 'U')) {
				System.out.print(harf);
			}

		}
	}
}