package practice;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NumberSwapNoVar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num1 = new ArrayList<>();
		List<Integer> num2 = new ArrayList<>();
		
		System.out.print("Enter first number: ");
		num1.add(sc.nextInt());
		System.out.print("Enter second number: ");
		num2.add(sc.nextInt());
		
		System.out.println("Before Swap: ");
		System.out.println("First Number: " + num1.get(0));
		System.out.println("Second Number: " + num2.get(0));
		
		num1.add(num2.get(0));
		num2.add(num1.get(0));
		
		num1.remove(0);
		num2.remove(0);
		
		System.out.println("After Swap: ");
		System.out.println("First Number: " + num1.get(0));
		System.out.println("Second Number: " + num2.get(0));
		
	}

}
