package lista05;

import java.util.Scanner;

public class ExercicioProposto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de linhas:");
		int linha = sc.nextInt();
		
		System.out.println("Informe a quantidade de colunas:");
		int coluna = sc.nextInt();
		
		int[][] mat = new int[linha][coluna];
		System.out.println("Informe os numeros da matriz");
		
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Informe o numero:  ");
		int num = sc.nextInt();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==num) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
	}

}
