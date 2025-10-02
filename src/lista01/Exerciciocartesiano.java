package lista01;

import java.util.Scanner;

public class Exerciciocartesiano {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		String resp;
		
		do{
			System.out.println("Insira a coordenada de X:");
			x = sc.nextInt();
			
			System.out.println("Insira a coordenada de Y");
			y = sc.nextInt();
			
			if(x>0 && y>0) {
				System.out.println("Primeiro Quadrante");
			}else if(x<0 && y>0) {
				System.out.println("Segundo Quadrante");
			}else if(x<0 && y<0) {
				System.out.println("Terceiro Quadrante");
			}else if(x>0 && y<0) {
				System.out.println("Quarto Quadrante");
			}else {
				System.out.println("O valor e nulo");
			}
			System.out.println("Deseja continuar(S/N)?");
			resp = sc.next();
		}while(resp.equalsIgnoreCase("S"));
	}

}
