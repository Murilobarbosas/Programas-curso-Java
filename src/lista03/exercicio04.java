package lista03;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		cc.price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		cc.dollar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", cc.Amount()));
		sc.close();
	}

}
