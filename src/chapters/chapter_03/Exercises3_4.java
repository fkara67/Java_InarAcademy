package chapters.chapter_03;

public class Exercises3_4 {

	public static void main(String[] args) {
		int x = (int)((Math.random() * 12) + 1);
		System.out.println(x);
		
		if (x == 1) 
			System.out.println("january");
		else if (x == 2)
			System.out.println("february");
		else if (x == 3) {
			System.out.println("march");
			
		}

		else if (x == 4)
			System.out.println("april");
		else if (x == 5)
			System.out.println("may");
		else if (x == 6)
			System.out.println("june");
		else if (x == 7)
			System.out.println("july");
		else if (x == 8)
			System.out.println("august");
		else if (x == 9)
			System.out.println("september");
		else if (x == 10)
			System.out.println("october");
		else if (x == 11)
			System.out.println("november");
		else 
		    System.out.println("december");
		    
		}
	}


