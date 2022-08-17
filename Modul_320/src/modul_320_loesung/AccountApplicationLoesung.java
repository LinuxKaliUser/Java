package modul_320_loesung;

import java.util.Scanner;

public class AccountApplicationLoesung {
	public static void main(String[] args) {
		System.out.println("Welcome to the account application");
		double balance = 0;
		double amount = 0;
		String command = "";

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the amount, 0 (zero) to terminate");
			amount = sc.nextDouble();
			if (amount != 0) {
				System.out.println("To deposit, press +, to withdraw press -");
				command = sc.next();
				if (command.equals("+")) {
					balance = deposit(balance, amount);
				} else if (command.equals("-")) {
					balance = withdraw(balance, amount);
				}
			}
		} while (amount != 0);

		System.out.println("Final balance: " + balance);
	}

	public static double deposit(double balance, double amount) {
		return balance + amount;
	}

	public static double withdraw(double balance, double amount) {
		return balance - amount;
	}
}
