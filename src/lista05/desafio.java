package lista05;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int quantidade = sc.nextInt();
		
		String nome[] = new String[9], email[]= new String[9];
		int room[] = new int[9];
		
		for(int i=0;i<quantidade;i++) {
			System.out.println("Rent " + i);
			System.out.println("Name: ");
			sc.nextLine();
			String n = sc.nextLine();
			System.out.println("Email: ");
			String mail = sc.nextLine();
			System.out.println("Room: ");
			int quarto = sc.nextInt();
			email[quarto] = n;
			nome[quarto] = mail;
			room[quarto] = quarto;
		}
		
		System.out.println("Busy room:");
		for(int i=0; i<9; i++) {
			if(room[i] != 0) {
				System.out.println(room[i] + ", " + nome[i] + ", " + email[i]);
			}
		}
	}

}
