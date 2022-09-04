package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		String status = input.next();
		
		char major = Character.toUpperCase(status.charAt(0));
		char year = status.charAt(1);
		
		String sectionName = "";
		String yearName = "";
		
		if ((major == 'M' || major == 'C' || major == 'I') &&
				(year == '1' || year == '2' || year == '3' || year == '4'))  {
		
			switch(major) {
			case 'M': sectionName = "Mathematics";             break;
			case 'C': sectionName = "Computer Science";        break;
			case 'I': sectionName = "Information Technology";   }  
		
			switch(year)  {
			case '1': yearName = "Freshman";    break;
			case '2': yearName = "sophomore";   break;
			case '3': yearName = "junior";      break;
			case '4': yearName = "senior";      }
		
			System.out.println(sectionName + " " + yearName);
		}
		else
			System.out.println("Invalid input!");
		
		

		
		
}
}