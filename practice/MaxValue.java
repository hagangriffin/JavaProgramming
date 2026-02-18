package practice;
import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		int[] numbers;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of values you want to compare: ");
		int n = sc.nextInt();
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter value " + (i + 1) + ": ");
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		System.out.println("The maximum value entered is: " + max);
		}
		

	}

}
