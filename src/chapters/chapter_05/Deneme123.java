package chapters.chapter_05;

import java.util.Scanner;

public class Deneme123 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	    //Get user input = number of lines to print in a pyramid
	    System.out.println("Enter a number between 1 and 15: ");
	    int numLines = s.nextInt();

	    for (int row = 1; row <= numLines; row++){

	        //print out n-row # of spaces
	        for (int col = 1; col <= numLines-row; col++){
	            System.out.print(" \t");
	        }
	        //print out digits = 2*row-1 # of digits printed
	        for (int dig= 1; dig <= 2*row-1; dig++){
	            System.out.print(row + "\t");
	           
	        }
	              
	    System.out.println();

	

		
	
		
	    }	
		

	}
}