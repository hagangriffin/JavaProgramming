package practice;
import java.util.Scanner;

public class ArrayCollector {

		public static void printArray(int[] array) {
			int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > count) {
                	count = array[i];
                }
            }
            System.out.println("The largest number is: " + count);
        }
        public static void main(String[] args) {
        	int[] arr = new int[5];
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter 5 numbers: ");
        	for (int i = 0; i < arr.length; i++) {
        		arr[i] = sc.nextInt();}
        	printArray(arr);

	}
}