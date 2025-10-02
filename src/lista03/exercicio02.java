package lista03;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		
		System.out.println("Name: ");
		em.name = sc.nextLine();
		System.out.println("Gross salary: ");
		em.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		em.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + em.toString());
		
		System.out.println("Which percentage to increade salary?");
		double percentage = sc.nextDouble();
		em.increaseSalary(percentage);
		
		System.out.println("Updated data: " + em.toString());
		
		sc.close();
	}

}
