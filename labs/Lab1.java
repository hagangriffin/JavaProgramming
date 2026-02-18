package labs;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter the line to be reversed:");
		String str = sc.nextLine();
		char strlist[] = new char[str.length()];
		
		System.out.println("Enter the character to count:");
		char ch = sc.next().charAt(0);
		
		for (int i = 0; i < str.length(); i++) {
			strlist[i] = str.charAt(i);
		}
		System.out.println("The reversed line is:");
		for (int x = strlist.length - 1; x >= 0; x--) {
			System.out.print(strlist[x]);
		}
		
		for (int j = 0; j < strlist.length; j++) {
			if (strlist[j] == ch) {
				count += 1;
			}
				}
		System.out.println("\nThe number of letter " + ch + " is: " + count);
	}


}
