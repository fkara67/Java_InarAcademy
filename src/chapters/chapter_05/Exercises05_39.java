package chapters.chapter_05;

public class Exercises05_39 {

	public static void main(String[] args) {
		double comission = 0;
		double comission1 = 0, comission2 = 0, comission3 = 0;
		double sales;
		for (sales = 0.01; comission <= 25000; sales += 0.01) {
			if (sales >= 0.01 && sales <= 5000)
				comission1 = sales * 8 / 100;
			if (sales >= 5000.01 && sales <= 10000)
				comission2 = (sales - 5000) * 10 / 100;
			if (sales >= 10000.01)
				comission3 = (sales - 10000) * 12 / 100;
			comission = comission1 + comission2 + comission3;

		}
		System.out.printf("The minimum sales amount for income of $30000 is %2.2f", sales);

	}

}
