package lista02;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro ate 1000:");
		int num = sc.nextInt();
		
		for(int i=1; i<num;i++) {
			if(i%2>0) {
				System.out.printf("%d\n", i);
			}
		}
	}

}
