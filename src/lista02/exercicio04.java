package lista02;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int numero = sc.nextInt();
		
		for(int i=0;i<numero;i++) {
			double valor1=sc.nextInt();
			double valor2=sc.nextInt();
			
			if(valor2==0) {
				System.out.println("Divisao impossivel");
			}else {
				double media=valor1/valor2;
				System.out.printf("%.1f", media);
			}
		}
	}

}
