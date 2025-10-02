package exercicio05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma=0;
		int menor=0;
		
		System.out.println("Quantas pessoas serao digitadas?");
		int numero = sc.nextInt();
		String[] nome = new String[numero];
		int[] idade = new int[numero];
		double[] altura = new double[numero];
		
		for(int i=0; i<numero; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			sc.nextLine();
			System.out.println("Nome");
			nome[i]=sc.nextLine();
			System.out.println("Idade");
			idade[i]=sc.nextInt();
			System.out.println("Altura");
			altura[i]=sc.nextDouble();
			soma+= altura[i];
			if(idade[i]<16) {
				menor++;
			}
		}
		
		double media = ((double)menor/numero)*100;
		System.out.println(media);
		System.out.println("Altura média:" + String.format("%.2f", soma/numero));
		System.out.println("Pessoas com menos de 16 anos:" + media);
		
		for(int i=0; i<numero; i++) {
			if(idade[i]<16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
