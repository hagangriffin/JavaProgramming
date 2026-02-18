package practice;
import java.util.Scanner;

public class NumberSwapWithVar {

	public static void main(String[] args) {
		int num1;
		int num2;
		int savedNum;
		
		System.out.println("Enter two integers to swap: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Before swapping: ");
		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);
		
		savedNum = num1;
		num1 = num2;
		num2 = savedNum;
		
		System.out.println("After swapping: ");
		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);

	}

}
