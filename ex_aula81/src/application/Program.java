package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accNumber, holder, initialDeposit);
		} else {
			account = new Account(accNumber, holder);
		}
		
		System.out.println("");
		System.out.println(account.toString());
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		account.newDeposit(sc.nextDouble());
		System.out.println("Updated " + account.toString());
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		account.newWithdraw(sc.nextDouble());
		System.out.println("Updated " + account.toString());
		
		
		sc.close();
	}

}
