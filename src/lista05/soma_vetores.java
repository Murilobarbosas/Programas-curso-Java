package lista05;

import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int tamanho = sc.nextInt();
		
		int vetorA[] = new int[tamanho];
		int vetorB[] = new int[tamanho];
		
		System.out.println("Digite os valores do vetor A");
		for(int i=0;i<tamanho;i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B");
		for(int i=0;i<tamanho;i++) {
			vetorB[i] = sc.nextInt();
		}
		
		for(int i=0;i<tamanho;i++) {
			System.out.println("Vetor Resultante " + (vetorA[i]+vetorB[i]));
		}
	}

}
