package lista05;

import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int quantidades = sc.nextInt();
		int numeros[] = new int[quantidades];
		
		for(int i = 0; i<quantidades; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		int par = 0;
		
		System.out.println("Numeros Pares: ");
		for(int i = 0; i<quantidades; i++) {
			if((numeros[i]%2) == 0) {
				par = par + 1;
				System.out.println(numeros[i]);
			}
		}
		
		System.out.println("Quantidades de pares = " + par);
	}

}
