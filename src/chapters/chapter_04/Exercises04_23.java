package chapters.chapter_04;

import java.util.Scanner;

public class Exercises04_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.println("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double PayRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:(e.g., 0.20 instead of %20");
		double federalTaxRate = input.nextDouble();
		System.out.println("Enter state tax withholding rate:(e.g., 0.09 instead of %9");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = PayRate * hours;
		double federalWitholding = grossPay * federalTaxRate;
		double stateWitholding = grossPay * stateTaxRate;
		double totaldeduction = federalWitholding + stateWitholding;
		System.out.println(
		    "Employee Name: " + name + 
		    "\nHours Worked: " + hours + 
		    "\nPay Rate: $" + PayRate +
		    "\nGross Pay: $" + grossPay +
		    "\nDeductions: " + 
		    "\n   Federal Withholding (%" + federalTaxRate * 100 + "): " + "$" + federalWitholding + 
		    "\n   State Withholding (%" + stateTaxRate * 100 + "): " + "$" + stateWitholding + 
		    "\n   Total Deduction: $" + (federalWitholding + stateWitholding) + 
		    "\nNet Pay: $" + (grossPay - totaldeduction)    );
		    
		
	}

}
