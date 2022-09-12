package chapters.chapter_05;

public class Exercises05_06 {

	public static void main(String[] args) {
		String title = "Miles  \t  Kilometers   |   Kilometers  \t     Miles\t";
		System.out.println(title);
		
		for (int miles = 1, km = 20; miles < 11 && km < 66; miles++, km += 5) {
			System.out.printf(
					"%-10d%-10.3f", miles,(miles * 1.609));
			System.out.print("   |   ");
			System.out.printf(
					"%-18d%-7.3f\n", km,(km / 1.609));
			
		}
	}

}
