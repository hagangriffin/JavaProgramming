package practice;
import java.util.Scanner;

public class Bidding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice = 'y';
		int bid = 0;
		while (choice == 'y') {
			System.out.println("The bid is at $" + bid + "\nWould you like to place a bid? (y/n)");
			choice = sc.next().charAt(0);
			if (choice == 'y') {
				System.out.println("You have bid");
				bid += 10;
				}
				else if (choice == 'n') {
					System.out.println("Bidding ended at $" + bid);
					break;
				
				}
			}
		}

	}