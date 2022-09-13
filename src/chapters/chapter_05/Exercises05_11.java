
package chapters.chapter_05;

public class Exercises05_11 {

	public static void main(String[] args) {
		int perLine = 10;
		int count = 0;
		
		for (int number = 100; number < 201; number++) {
			if(number % 5 == 0 ^ number % 6 == 0) {
				count++;
				if (count % perLine == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
		}
	}

}
