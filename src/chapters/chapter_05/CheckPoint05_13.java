package chapters.chapter_05;

public class CheckPoint05_13 {

	public static void main(String[] args) {
		long sum1 = 0;
		int i = 0;
		while (i <= 1000) {
			sum1 += i;
			i++;
		}
		System.out.println(sum1);
		
		long sum2 = 0;
		int i2 = 0;
		do {
			sum2 += i2;
			i2++;
		}while(i2 <= 1000);
		System.out.println(sum2);
	}

}
