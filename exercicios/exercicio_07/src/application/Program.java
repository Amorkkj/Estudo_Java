package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas: ");
		int m = sc.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		int n = sc.nextInt();
		int[][] tab = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Digite um valor para a linha: " + i + " e coluna: " + j);
				tab[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Digite o valor a ser procurado na matriz: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (tab[i][j] == x) {
					System.out.println("Position: "+ i + ","+ j);
				if (j > 0) {
					System.out.println("Left: " + tab[i][j-1]);
				}
				if (i > 0) {
					System.out.println("Up: " + tab[i-1][j]);
				}
				if (j < j-1) {
					System.out.println("Right: " + tab[i][j+1]);
				}
				if (i < i-1) {
					System.out.println("Down: " + tab[i+1][j]);
				}
			}
		}
	}
}		
}
