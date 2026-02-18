package practice;
import java.util.Scanner;

public class TollCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time of day in military time: ");
		int time = sc.nextInt();
		
		if (time < 600 || time >= 1800) {
			System.out.println("Toll is $1.55");
		} else if (time >= 600 && time < 1000) {
			System.out.println("Toll is $4.65");
			} else if (time >= 1000 && time < 1800) {
				System.out.println("Toll is $2.35");
		}

	}

}
