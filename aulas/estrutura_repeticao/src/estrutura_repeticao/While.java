package estrutura_repeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor a se somado.");
		int x = sc.nextInt();
		int soma = 0;
		
		
		//quando nao se sabe ao certo a quantidade de repetições
		while (x != 0) {
			soma += x;
			System.out.println("Digite outro valor. Digite 0 para finalizar.");
			x = sc.nextInt();
		}
		System.out.println(soma);

		sc.close();
	}

}
