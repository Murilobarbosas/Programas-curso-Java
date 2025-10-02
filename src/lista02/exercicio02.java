package lista02;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in=0, out=0;
		
		System.out.println("Informe um valor para uma quantidade de numero:");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Informe o numero entre 10 e 20:");
			int valor = sc.nextInt();
			if(valor>=10&&valor<=20) {
				in = in+1;
			}else {
				out=out+1;
			}
		}
		System.out.printf("%d dentro do parametro\n", in);
		System.out.printf("%d fora do parametro", out);
	}

}
