package exercicio05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Quantos numeros voce vai digitar?");
		int numero = sc.nextInt();
		double[] vect = new double[numero];
		for(int i=0; i<numero; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("VALORES = ");
		for(int i=0; i<numero; i++) {
			soma += vect[i];
			System.out.println(vect[i]);
		}
		
		System.out.println("SOMA =");
		System.out.println(soma);
		System.out.println("MEDIA =");
		System.out.println(soma/numero);
		sc.close();
	}

}
