package chapters.chapter_03;

public class CheckPoint03_20 {

	public static void main(String[] args) {
		double x = 8;
		boolean check1 = Math.abs(x - 5) < 4.5;
		
		boolean check2 = Math.abs(x - 5) > 4.5;
		System.out.println("check1 is " + check1 + " check2 is " + check2);
	}

}
