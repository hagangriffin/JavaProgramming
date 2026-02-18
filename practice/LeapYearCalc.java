package practice;
import java.util.Scanner;

public class LeapYearCalc {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year to check if it's a leap year: ");
		year = sc.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
					} else {
						System.out.println(year + " is not a leap year.");
                    }
				}
			}
		}

	}
