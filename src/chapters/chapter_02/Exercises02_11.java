package chapters.chapter_02;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;
public class Exercises02_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		double numberOfYears = input.nextDouble();
		double numberOfBirthInSeconds = 7.0;
		double numberOfDeathInSeconds = 13.0;
		double numberOfImmigrantInSeconds = 45.0;
		
		double currentPopulation = 312_032_486;
		double secondsInYear = 60 * 60 * 24 * 365;
		
		double numberOfBirthInYear = secondsInYear / numberOfBirthInSeconds;
		double numberOfDeathInYear = secondsInYear / numberOfDeathInSeconds;
		double numberOfImmigrantInYear = secondsInYear / numberOfImmigrantInSeconds;
		currentPopulation = currentPopulation + (numberOfBirthInYear + numberOfImmigrantInYear - numberOfDeathInYear) * numberOfYears ;
		System.out.println("The population in " + (int) numberOfYears + " years is: " + (int)currentPopulation);
		
		
		

	}

}