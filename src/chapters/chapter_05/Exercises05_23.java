package chapters.chapter_05;

public class Exercises05_23 {

	public static void main(String[] args) {
		double leftToRight = 0.0;
		for (double n = 1.0; n <= 50000.0; n++) {
			leftToRight += 1 / n;
			
		}
		System.out.println("Left to Right Sum: " + leftToRight);
			
	double rightToLeft = 0.0;
	for (double n = 50000.0; n >= 1.0; n--) {
		rightToLeft += 1 / n;
		
	}
	System.out.println("Right to Left Sum: " + rightToLeft);

}
}