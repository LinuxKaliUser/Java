package modul_320;

import java.util.Scanner;

public class AccountApplication {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the account application\r\n"
				+ "Please enter the amount, 0 (zero) to terminate");
		double accountAmount = sc.nextDouble();
		
		while (accountAmount!=0) {
			
			System.out.println("To deposit, press +, to withdraw, press -");
			String desccision = sc.next();
			
			if (desccision.equals("+")) {
				
				accountAmount = plusAccountAmount(accountAmount);
				
				
			}else if(desccision.equals("-")) {
				
				accountAmount = minusAccountAmount(accountAmount);
				
			}else {
				
				System.out.println("Error in the input!");
			}
		
			
		}
		System.out.println("Final balance:"+accountAmount);
		
		System.out.println("Programm terminate");
		
	}

	private static double plusAccountAmount(double accountAmount) {
		
		System.out.println("Please enter the amount, 0 (zero) to terminate");
		double result = 0;
		double input = sc.nextDouble();
		
		if(input!=0) {
			
			result = accountAmount+input;
			
		}else if (input==0) {
			
			System.out.println("Final balance:"+accountAmount);
			System.out.println("Programm terminate");
			System.exit(0);
			
		}
		
		
		return result;
	}

	private static double minusAccountAmount(double accountAmount) {
		
		System.out.println("Please enter the amount, 0 (zero) to terminate");
		double input = sc.nextDouble();
		double result =0;
		
		if(input!=0) {
			
			result = accountAmount-input;
			
		}else if (input==0) {
			
			System.out.println("Final balance:"+accountAmount);
			System.out.println("Programm terminate");
			System.exit(0);
			
		}
		
		return result;
	}

}
