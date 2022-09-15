package chapters.chapter_05;

public class Exercises05_27 {

	public static void main(String[] args) {
		int perLine = 10;
		int count = 0;
		for (int year = 101; year <= 2100; year++) {
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (isLeapYear) {
				count++;

				if (count % perLine == 0) {
					System.out.println(year);
				} else {
					System.out.print(year + " ");
				}
			}
		}
	}

}
