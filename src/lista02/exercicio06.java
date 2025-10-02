package lista02;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.printf("%d\n", i);
			}
		}
	}

}
