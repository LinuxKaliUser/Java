package modul_320;

import java.util.Scanner;

public class AccountApplicationRefactor {

	public static void main(String[] args) {
		System.out.println("Welcome to the account application");
		double amount = 0;
		String command = "";
		Account account = new Account();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the amount, 0 (zero) to terminate");
			amount = sc.nextDouble();
			
			if (amount != 0) {
				System.out.println("To deposit, press +, to withdraw press -");
				command = sc.next();
				if (command.equals("+")) {
					account.deposit( amount);
				} else if (command.equals("-")) {
					account.withdraw( amount);
				}
			}
		} while (amount != 0);

		System.out.println("Final balance: " +account.getBalance() );
	}

	

	

}
