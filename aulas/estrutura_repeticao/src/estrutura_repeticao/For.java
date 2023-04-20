package estrutura_repeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numero a ser somado: ");
		int n = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor a ser somado: ");
			int numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.printf("A soma dos numeros digitados eh %d", soma);
	}

}
