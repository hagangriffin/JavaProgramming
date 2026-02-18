package practice;
import java.util.Scanner;

public class FibonacciCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer to calculate its Fibonacci number: ");
		int n = sc.nextInt();
		int total = 0;
		int first = 0;
		int second = 0;
		int end_total = 0;
		System.out.println("Up to Nth Fibonacci number:");
		for (int i = 0; total <= n; i++) {
			if (i == 0) {
				total = 0;
				first = 0;
				second = 1;
			} else if (i == 1) {
				total = 1;
			} else {
				total = first + second;
				first = second;
				second = total;
			}
			if (total < n) {
				end_total += total;
				System.out.println("New Number: " + total);
			}
		}
		System.out.println("Sum of Fibonacci numbers up to " + n + "th is: " + end_total);
	}

}
