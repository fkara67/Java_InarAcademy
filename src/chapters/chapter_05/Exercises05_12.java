package chapters.chapter_05;

public class Exercises05_12 {

	public static void main(String[] args) {
		int n = 0;
		
		while (Math.pow(n, 2) < 12000) {
			n++;
		}
		System.out.println("The smallest integer n (such that n² is greater than 12000) is " + n);
		System.out.println("109²= " + Math.pow(n - 1, 2));
		System.out.println("110² = " + Math.pow(n, 2));
		
	}

}
