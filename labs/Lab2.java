package labs;
import java.util.Scanner;

	
	class BankAccount {
		String acc_num;
		String acc_name;
		double balance;
		
		BankAccount(String acc_num, String acc_name, double balance) {
			this.acc_num = acc_num;
			this.acc_name = acc_name;
			this.balance = balance;
		}
	}
public class Lab2 {
	
	public static void displayAccountDetails(BankAccount account) {
		System.out.println("Account Number: " + account.acc_num);
		System.out.println("Account Name: " + account.acc_name);
		System.out.println("Account Balance: " + account.balance);
	}
	
	public static BankAccount deposit(BankAccount account) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		double amount = sc.nextDouble();
		account.balance += amount;
		System.out.println("Deposited: " + amount);
		return account;
	}
	
	public static BankAccount withdraw(BankAccount account) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to withdraw: ");
		double amount = sc.nextDouble();
		if (amount > account.balance) {
			System.out.println("Insufficient funds.");
		} else {
			account.balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
		return account;
	}
	
	public static void main(String[] args) {
		//BankAccount account;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number: ");
		String acc_num = sc.nextLine();
		System.out.println("Enter your account name: ");
		String acc_name = sc.nextLine();
		System.out.println("Enter your initial balance: ");
		double balance = sc.nextDouble();
		
		BankAccount account = new BankAccount(acc_num, acc_name, balance);
		displayAccountDetails(account);
		deposit(account);
		withdraw(account);
		System.out.println("Final balance: " + String.format("%.2f", account.balance));
		
		
		

	}

}
