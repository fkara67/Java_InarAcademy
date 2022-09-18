package weeks.week_04;

public class EqualsIgnoreCasePractice {

	public static void main(String[] args) {
		String temp = "Inar Academy";
		String temp2 = "inar academy";
		System.out.println("Temp is " + temp);
		System.out.println("Temp2 is " + temp2);
		System.out.println("Is Temp and Temp2 equal when you ignore the capitalization?");
		System.out.println(temp.equalsIgnoreCase(temp2));
	}

}
