package modul_320_loesung;

import java.util.Scanner;

import modul_320.Account;

public class AccountApplicationRefractorLoesung {
	
	public static void main(String[] args) {
        System.out.println("Welcome to the account application");
        Account account = new Account();  // hier wird ein Objekt der Klasse `Account` erstellt
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
                    account.deposit(amount);
                } else if (command.equals("-")) {
                    account.withdraw(amount);
                }
            }
        } while (amount != 0);
        
        System.out.println("Final balance: " + account.getBalance());
    }
}
