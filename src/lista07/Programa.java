package lista07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.println("Individual or company (i/c)? ");
			char p = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			double renda = sc.nextDouble();
			if(p=='i') {
				System.out.println("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new PessoaFisica(name, renda, health));
			}else {
				System.out.println("Number of employees: ");
				int e = sc.nextInt();
				list.add(new PessoaJuridica(name, renda, e));
			}
		}
		
		double sum=0;
		System.out.println("Taxes Paid");
		for (Pessoa p : list) {
			System.out.println(p.toString());
			sum += p.calculo();
		}
		System.out.println("Total Taxes: $" + sum);
	}

}
