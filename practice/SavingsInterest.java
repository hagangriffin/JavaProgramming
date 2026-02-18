package practice;
import java.util.Scanner;

public class SavingsInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the starting amount $");
		double amount = sc.nextDouble();
		
		System.out.print("Enter the amount you will be saving per month $");
		double monthlyDeposit = sc.nextDouble();
		
		System.out.print("Enter the annual interest rate as a decimal: ");
		float rate = sc.nextFloat();
		
		System.out.print("Enter how many years you will be saving: ");
		int years = sc.nextInt();
		
		for (int year = 1; year <= years; year++) {
			amount += monthlyDeposit * 12;
			amount += amount * rate;
			
			System.out.println("After year " + year + " the account value is " + String.format("%.2f", amount));
			System.out.println("---------------------------------------------------------------");
		
		}
		System.out.println("\nThe final value after " + years + " years is $" + String.format("%.2f", amount));
	}

}
