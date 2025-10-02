package lista07;

import java.util.Scanner;

public class ProgramFixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.println("Number:");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial balance: ");
		double initbalance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double withdraw = sc.nextDouble();
		Account acc = new Account(number, holder, initbalance, withdraw);
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

}
