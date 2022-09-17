package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter first day of the year(sunday-0 and monday-1): ");
		int inputDay = input.nextInt();
		int dayNameNumber = inputDay;
		String firstDayName = "";
		String nameOfMonth = "";
		int numberOfDay = 0;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		int count = -1;
		for (int month = 1; month <= 12; month++) {
			switch (month) {

			case 1:
				numberOfDay = 31;
				nameOfMonth = "January";
				dayNameNumber = inputDay;
				dayNameNumber = (inputDay + 3) % 7;
				break;
			case 2:
				
				nameOfMonth = "February";
				if (isLeapYear) {
					dayNameNumber = (dayNameNumber + 1) % 7;
					numberOfDay = 29; }
				else
					numberOfDay = 28;
				
				break;
			case 3:
				numberOfDay = 31;
				nameOfMonth = "March";
				dayNameNumber = (dayNameNumber + 3) % 7;
				
				break;
			case 4:
				numberOfDay = 30;
				nameOfMonth = "April";
				dayNameNumber = (dayNameNumber + 2) % 7;
				
				break;
			case 5:
				numberOfDay = 31;
				nameOfMonth = "May";
				dayNameNumber = (dayNameNumber + 3) % 7;
				
				break;
			case 6:
				numberOfDay = 30;
				nameOfMonth = "June";
				dayNameNumber = (dayNameNumber + 2) % 7;
				
				break;
			case 7:
				numberOfDay = 31;
				nameOfMonth = "July";
				dayNameNumber = (dayNameNumber + 3) % 7;
				
				break;
			case 8:
				numberOfDay = 31;
				nameOfMonth = "August";
				dayNameNumber = (dayNameNumber + 3) % 7;
				
				break;
			case 9:
				numberOfDay = 30;
				nameOfMonth = "September";
				dayNameNumber = (dayNameNumber + 2) % 7;
				
				break;
			case 10:
				numberOfDay = 31;
				nameOfMonth = "October";
				dayNameNumber = (dayNameNumber + 3) % 7;
				
				break;
			case 11:
				numberOfDay = 30;
				nameOfMonth = "November";
				dayNameNumber = (dayNameNumber + 2) % 7;
				
				break;
			case 12:
				numberOfDay = 31;
				nameOfMonth = "December";
				

			}
		
			System.out.println("\n\t\t\t" + nameOfMonth + " " + year + 
					"\n           ---------------------------------------------------\n");
			System.out.println("       \tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			for (int j = 0; j < inputDay; j++) {
				System.out.print("    ");
				count++;
			}
	
			for (int i = 1; i <= numberOfDay; i++) {
				count++;
				if (count % 7 == 0) {
					System.out.println(i);
				}
				else
					System.out.printf("\t%4d  ", i);
			}
			
		
		}
	}

}
