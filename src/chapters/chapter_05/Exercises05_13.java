package chapters.chapter_05;

public class Exercises05_13 {

	public static void main(String[] args) {
		int n = 0;
		
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		System.out.println("The largest integer n (such that n³ is less than 12000) is " + (n - 1));
		System.out.println("23³ = " + Math.pow(n, 3));
		
	}

}
