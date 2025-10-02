package lista05;

import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int quantidades = sc.nextInt();
		String nome[] = new String[quantidades];
		int idades[] = new int[quantidades];
		double alturas[] = new double[quantidades];
		double altura_media = 0;
		int pessoas = 0;
		
		for(int i=0; i<quantidades; i++) {
			System.out.println("Dados da " + i + " pessoa");
			System.out.println("NOME: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.println("IDADE: ");
			idades[i] = sc.nextInt();
			if(idades[i]<16) {
				pessoas = pessoas + 1;
			}
			System.out.println("ALTURA: ");
			alturas[i] = sc.nextDouble();
			altura_media = altura_media + alturas[i];
		}
		
		double menor = ((double)pessoas / quantidades) * 100.0;;
		
		System.out.printf("Altura media: %.2f", altura_media/quantidades);
		System.out.println("\nPessoas com menos de  16 anos:" + menor + "%");
		for(int i = 0; i<quantidades; i++) {
			if(idades[i]<16) {
				System.out.println(nome[i]);
			}
		}
	}

}
