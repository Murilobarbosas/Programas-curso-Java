package lista05;

import java.util.Scanner;

public class desafioPOO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int quantidade = sc.nextInt();
		
		modelDesafio md[]= new modelDesafio[9];
		
		for(int i=0;i<quantidade;i++) {
			System.out.println("Rent " + i);
			System.out.println("Name: ");
			sc.nextLine();
			String n = sc.nextLine();
			System.out.println("Email: ");
			String mail = sc.nextLine();
			System.out.println("Room: ");
			int quarto = sc.nextInt();
			md[quarto] = new modelDesafio(n, mail, quarto);
		}
		
		System.out.println("Busy room:");
		for(int i=0; i<9; i++) {
			if(md[i] != null) {
				System.out.println(md[i]);
			}
		}
		sc.close();
	}

}
