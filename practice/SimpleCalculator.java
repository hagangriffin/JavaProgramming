package practice;
import java.util.Scanner;

class ReturnVal { //A class to hold multiple return values
	public int x;
	public int y;
	public char op;
	
	public ReturnVal(int x, int y, char op) { //Could be changed to any number of values
		this.x = x;
		this.y = y;
		this.op = op;
}
}

public class SimpleCalculator {
	
	
	public static ReturnVal calc() {
		Scanner sc = new Scanner(System.in);
		ReturnVal RetVal;
		
		System.out.print("Enter the first number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int y = sc.nextInt();
		
		System.out.print("Enter the operation: ");
		char op = sc.next().charAt(0);
		
		RetVal = new ReturnVal(x, y, op); //Saves the values to class object
		
		return RetVal; //Return the class object
	}
	
	public static void operate(ReturnVal input) { //Import in the class and access values through input.___
		
		switch(input.op) {
		case '+':
			System.out.print("X plus Y is: ");
			System.out.println(input.x + input.y);
			break;
		case '-':
			System.out.print("X minus Y is: ");
			System.out.println(input.x - input.y);
			break;
		case '*':
			System.out.print("X multiplied by Y is: ");
			System.out.println(input.x * input.y);
			break;
		case '/':
			System.out.print("X divided by Y is: ");
			System.out.println(input.x / input.y);
			break;
		}
	}

	public static void main(String[] args) {
		operate(calc());
		
	}

}
