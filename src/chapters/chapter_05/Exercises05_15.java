package chapters.chapter_05;

public class Exercises05_15 {

	public static void main(String[] args) {
		
		final int PER_LINE = 10;
		int count = 0;
		for(int i = 32; i < 127; i++, count++) {
			
			if(count % 10 == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");
			
		}
	}

}
