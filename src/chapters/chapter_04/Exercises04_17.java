package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		System.out.println("Enter first three letters of a month(with the first letter in uppercase): ");
		String month = input.next();
		
	    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	    	if (month.equals("Feb"))
	    		System.out.println(month + " " + year + " has 29 days.");
	    	}
	    else if (month.equals("Feb"))
	    	System.out.println(month + " " + year + " has 28 days.");
	    switch(month) {
	    case "Apr":
	    case "Jun":
	    case "Sep":
	    case "Nov":
	    	System.out.println(month + year + "has 30 days.");
	    	break;
	    case "Jan":
	    case "Mar":	
	    case "May":
	    case "Jul":
	    case "Aug":
	    case "Oct":
	    case "Dec":
	    	System.out.println(month + " " + year + " has 31 days.");
	    }	
	    	
	}

}
