package chapters.chapter_04;

public class Exercises04_25 {

	public static void main(String[] args) {
		int letter1 = (int)(Math.random() * 26 + 65);
		int letter2 = (int)(Math.random() * 26 + 65);
		int letter3 = (int)(Math.random() * 26 + 65);
		char letter1_1 = (char)letter1;
		char letter2_2 = (char)letter2;
		char letter3_3 = (char)letter3;
		int digits = (int)(Math.random() * 9000 + 1000);
		
		
		System.out.println("The random plate number is " + letter1_1 + letter2_2 + letter3_3 + " " + digits);
	}

}
