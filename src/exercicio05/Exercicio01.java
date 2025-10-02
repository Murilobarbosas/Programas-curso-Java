package exercicio05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int numero = sc.nextInt();
		int[] vect = new int[numero];
		for(int i=0; i<numero; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i=0; i<numero; i++) {
			if(vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
