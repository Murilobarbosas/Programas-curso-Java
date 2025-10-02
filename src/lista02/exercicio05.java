package lista02;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma quantidade:");
		int quantidade = sc.nextInt();
		
		for(int i=0;i<quantidade;i++) {
			System.out.println("Informe o fatorial:");
			int fatorial = sc.nextInt();
			int valor = fatorial;
			if(fatorial==0) {
				System.out.println("1");
			}else {
				for(int n=1; n<fatorial;n++) {
					valor = valor * n;
				}
				System.out.printf("%d", valor);
			}
			
		}
	}

}
