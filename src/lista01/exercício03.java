package lista01;

import java.util.Scanner;

public class exercício03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resp, alcool=0, gasolina =0, diesel =0;
		do {
			System.out.println("Qual voce prefere: \n1-Alcool\n2-Gasolina\n3-Diesel\n4-Fim");
			resp = sc.nextInt();
			if(resp==1) {
				alcool= alcool + 1;
			}else if(resp==2) {
				gasolina= gasolina + 1;
			}else if(resp==3){
				diesel= diesel + 1;
			}else if(resp==4){
				System.out.println("Muito obrigado!\n");
			}else {
				System.out.println("Insira um numero valido!");
			}
		}while(resp!=4);
		System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
	}

}
