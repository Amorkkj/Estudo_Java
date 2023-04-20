package estrutura_repeticao;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		//menos utilizado. ira ser executado pelo menos 1 vez.
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.println("digite a tempuratura em celsius:");
			double celsius = sc.nextDouble();		
			double f = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("a tempetura em Fadhshds eh: %.2f %n", f);
			System.out.println("Deseja repetir ? (s/n)");
			resp = sc.next().charAt(0);
		} while (resp == 's');
			
		sc.close();
		
		
	}

}
