package chapters.chapter_05;

public class Exercises05_39 {

	public static void main(String[] args) {
		double income = 0;
		double sales;
		for (sales = 0; income <= 2500; sales++) {
			if (sales <= 5000)
				income += sales * 8 / 100;
			if (sales > 5000 && sales <= 10000)
				income += (sales - 5000) * 10 / 100;
			if (sales > 10000)
				income += (sales - 10000) * 12 / 100;
			
		}
		System.out.println("The minimum sales amount for income of $30000 is " + sales);

	}

}
