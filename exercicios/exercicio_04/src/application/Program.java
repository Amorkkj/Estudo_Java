package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		name = sc.nextLine();
		Client client = new Client(accNumber, name);
		System.out.println("Is there na initial deposit (y/n) ?");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();
			client.deposite(value);
		} 
			
		System.out.printf("Account data: %n" + client.toString());
		
		System.out.println();
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double value = sc.nextDouble();
		client.deposite(value);
		System.out.printf("Update account data: %n" + client.toString());
		
		System.out.println();
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		client.withdraw(value);
		System.out.printf("Update account data: %n" + client.toString());
		
		sc.close();
	}

}
