package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		System.out.print("Enter account number: ");
		acc.setAccountNumber(sc.nextInt());
		System.out.print("Enter account holder: ");
		acc.setHolder(sc.next());
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			acc.setValue(sc.nextDouble());
		}
		
		System.out.println("");
		System.out.println(acc.toString());
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		acc.newDeposit(sc.nextDouble());
		System.out.println("Updated " + acc.toString());
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		acc.newWithdraw(sc.nextDouble());
		System.out.println("Updated " + acc.toString());
		
		
		sc.close();
	}

}
