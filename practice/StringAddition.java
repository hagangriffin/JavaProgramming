package practice;
import java.util.Scanner;

public class StringAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a kind of relative: ");
		String rl = sc.nextLine();
		System.out.print("Enter a kind of food: ");
		String food = sc.nextLine();
		System.out.print("Enter an adjective: ");
		String adjective = sc.nextLine();
		System.out.print("Enter a time period: ");
		String time = sc.nextLine();
		
		System.out.println("My " + rl + " says eating " + food + " will make me more " + adjective + " so I eat it every " + time + ".");
}}
