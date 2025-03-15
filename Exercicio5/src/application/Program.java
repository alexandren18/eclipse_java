package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder:");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositar = sc.nextDouble();
			 account =  new Account(name,number,depositar);
		}
		
		else {
			 account =  new Account(name, number);

		}
		
		
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		
		System.out.print("Enter a deposit value: ");
		 double depositar =  sc.nextDouble();
		 account.deposito(depositar);
		 
		 System.out.println("Updated account data:");
		 System.out.println(account.toString());
		 
		 System.out.print("Enter a withdraw value: ");
		 depositar = sc.nextDouble();
		 account.saque(depositar);
		 
		 System.out.println("Updated account data:");
		 System.out.println(account.toString());
		 
		 
		 sc.close();
		 
		 
		
		
		
		
		

	}

}
