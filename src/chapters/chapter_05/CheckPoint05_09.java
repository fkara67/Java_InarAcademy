package chapters.chapter_05;

public class CheckPoint05_09 {

	public static void main(String[] args) {
		int noppl = 10;
		int count = 1;
		for (int i = 1; i < 101; i++, count++) {
			if (count % noppl == 0)
				System.out.println(i);
			else
				System.out.print(i + "    ");
		}

	}
}