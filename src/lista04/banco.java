package lista04;

import java.util.Scanner;

public class banco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c;
		
		System.out.println("Enter account number:");
		int account = sc.nextInt();
		System.out.println("Enter account holder:");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)?");
		String resp = sc.nextLine();
		
		if(resp.equals("y")||resp.equals("Y")) {
			System.out.println("Enter initial deposit value:");
			double deposit = sc.nextDouble();
			c = new Conta(account, name, deposit);
		}else {
			c = new Conta(account, name);
		}
		
		System.out.println("Account data:");
		System.out.println(c.toString());
		
		System.out.println("Enter a deposit value: ");
		double value = sc.nextDouble();
		c.deposito(value);
		System.out.println("Updated accoun data");
		System.out.println(c.toString());
		
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		c.saque(value);
		System.out.println("Updated accoun data");
		System.out.println(c.toString());
		
		sc.close();
	}
}
