package chapters.chapter_05;

public class Exercises05_19 {
	 
	
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		
		for(int row = 0; row <= 7; row++) {
			
			for (int white = 1 ; white <= 7 - row ; white++) {
				System.out.printf("%4s"," - ");
			}
			
			for (int part1 = 0; part1 <= row; part1++) {
				number1 = (int)Math.pow(2, part1);
				System.out.printf("%4d",number1);
			}
			for (int part2 = row - 1; part2 >= 0; part2--) {
				number2 = (int)Math.pow(2, part2);
				System.out.printf("%4d",number2);
			}
			
			System.out.println();
		}
	}

}
