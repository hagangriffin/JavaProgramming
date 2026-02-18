package practice;
import java.util.Scanner;

public class StringDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("Enter the number of parts to divide the string into: ");
		int parts = sc.nextInt();
		int len = input.length();
		if (len % parts != 0) {
            System.out.println("The string cannot be evenly divided into " + parts + " parts.");
            return;
        } else {
        	int partlen = len / parts;
        	System.out.println("The divided parts are: ");
			for (int i = 0; i < len; i += partlen) {
				String part = input.substring(i, i + partlen);
				System.out.println(part);
			}
        	
        	
        	
        }

	}

}
