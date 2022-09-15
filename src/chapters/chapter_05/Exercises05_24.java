package chapters.chapter_05;

public class Exercises05_24 {

	public static void main(String[] args) {
		double sum = 0;
		for (double s = 98.0; s > 0.0; s -= 2) {
			sum = sum +  s / (s+2);
			
			
		}
		System.out.printf("The sum of series of 1/3 + 3/5 + .....95/97 + 97/99 is \n%5.4f"
				,sum);
	}

}
