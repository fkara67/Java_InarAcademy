package chapters.chapter_05;

public class Exercises05_05 {

	public static void main(String[] args) {
		String titles = "Kilograms\tPounds\t  |\t Pounds\t\tKilograms";
		
		System.out.println(titles);
		for (int kilograms = 1, pounds = 20; kilograms < 200 && pounds < 516; kilograms += 2, pounds += 5) {
			
			System.out.printf("%-15d%7.1f", kilograms,(kilograms * 2.2));
			System.out.print(" 	  |	 ");
			System.out.printf("%-8d%16.2f\n", pounds, (pounds / 2.2));
		}

		

	}

}
