package lista05;

import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int quantidades = sc.nextInt();
		int numero[] = new int[quantidades];
		int maior=0,posicao=0;
		
		for(int i=0;i<quantidades; i++) {
			System.out.println("Digite um numero: ");
			numero[i] = sc.nextInt();
			if(maior<numero[i]) {
				maior = numero[i];
				posicao = i;
			}
		}
		
		System.out.println("Maior Valor = " + maior);
		System.out.println("Posicao do Maior Valor = " + posicao);
	}

}
