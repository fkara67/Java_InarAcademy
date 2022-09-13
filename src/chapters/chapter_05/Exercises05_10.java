package chapters.chapter_05;

public class Exercises05_10 {

	public static void main(String[] args) {
		int perLine = 10;
		int count = 0;
		for (int number = 100; number < 1001; number++) {
			if (number % 30 == 0) {
				count++;
				if(count % perLine == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
		}
	}

}
