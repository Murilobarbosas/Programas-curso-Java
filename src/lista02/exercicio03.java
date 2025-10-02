package lista02;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.println("Informe os valores:");
		int quantidade = sc.nextInt();
		
		for(int i=0;i<quantidade;i++) {
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			num3=sc.nextDouble();
			double media= (num1*2+num2*3+num3*5)/10;
			System.out.printf("%.1f\n",media);
		}
	}

}
