package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas e colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int l = 0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		for (int l = 0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				if (mat[l][c] < 0)
					count ++;
			}
		}
		
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}

}
