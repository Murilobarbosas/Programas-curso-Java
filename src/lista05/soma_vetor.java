package lista05;

import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int tamanho = sc.nextInt();
		int numero[] = new int[tamanho];
		
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite um numero: ");
			numero[i] = sc.nextInt();
		}
		int soma=0, media;
		System.out.println("VALORES= ");
		for(int i=0; i<tamanho; i++) {
			System.out.println(numero[i]);
			soma = soma + numero[i];
		}
		System.out.println("SOMA= " + soma);
		System.out.println("MEDIA= " + soma/tamanho);
	}

}
