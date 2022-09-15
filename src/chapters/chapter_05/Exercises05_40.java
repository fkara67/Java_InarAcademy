package chapters.chapter_05;

public class Exercises05_40 {

	public static void main(String[] args) {
		int numberOfHeads = 0;
		int numberOfTails = 0;
		for (int i = 0; i < 1_000_000; i++) {
			int headOrTail = (int)( Math.random()*2);
			
			if(headOrTail == 0) {
				numberOfHeads++;
			}
			else if (headOrTail == 1)
				numberOfTails++;
		}
		System.out.println("In 1 Million attempt\nNumber Of Heads: " + numberOfHeads + "\nNumber Of Tails: "
				+ numberOfTails);
	}

}
