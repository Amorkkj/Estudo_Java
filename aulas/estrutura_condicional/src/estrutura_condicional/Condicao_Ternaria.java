package estrutura_condicional;

public class Condicao_Ternaria {

	public static void main(String[] args) {
		
		//(condição) ? valor_se_verdadeiro : valor_se_falso
		
		double preco = 15;
		double desconto, desconto2;
		
		if (preco < 20) {
			desconto = preco * 0.1;
		} else {
			desconto = preco *0.05;
		}
		
		desconto2 = (preco < 20)? preco * 0.1 : preco * 0.05;
		
		
		System.out.println(desconto);
		System.out.println(desconto2);
	}

}
