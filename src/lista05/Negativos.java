package lista05;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numero voce vai digitar? ");
		int numero = sc.nextInt();
		int valor[] = new int[numero];
		
		for(int i=0; i<numero; i++) {
			System.out.println("Digite um numero:");
			valor[i]= sc.nextInt();
		}
		
		System.out.println("Numero negativos:");
		for(int i=0; i<numero; i++) {
			if(valor[i]<0) {
				System.out.println(valor[i]);
			}
		}

	}

}
