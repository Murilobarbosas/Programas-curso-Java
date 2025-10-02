package lista02;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro:");
		int numero = sc.nextInt();
		for(int i = 1;i<=numero;i++) {
			System.out.println("" + i + "  " + Math.pow(i, 2) + "  " + Math.pow(i, 3));
		}
	}

}
