package practice;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		float average = sum / n;
		System.out.println("Average: " + average);
		

	}

}
