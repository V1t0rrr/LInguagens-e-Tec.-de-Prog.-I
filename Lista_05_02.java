package DA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista_05_02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");

		int codItem, quantidade;
		float preco = 0, valorAPagar;

		System.out.println("");
		System.out.println("\t|========= TABELA DE PREÇOS =========|");
		System.out.println("\t| Especificação  | Código |  Preço   |");
		System.out.println("\t|------------------------------------|");
		System.out.println("\t|Cachorro Quente |   100  | R$ 1,20  |");
		System.out.println("\t|Bauro Simples   |   101  | R$ 1,30  |");
		System.out.println("\t|Bauro com Ovo   |   102  | R$ 1,50  |");
		System.out.println("\t|Hamburger       |   103  | R$ 1,20  |");
		System.out.println("\t|Cheeseburguer   |   104  | R$ 1,30  |");
		System.out.println("\t|Refrigerante    |   105  | R$ 1,00  |");
		System.out.println("\t|====================================|\n");

		System.out.println("Informe o CÓDIGO do Item: ");
		codItem = leia.nextInt();

		System.out.println("Informe a QUANTIDADE de Itens: ");
		quantidade = leia.nextInt();

		if (codItem == 100) {
			preco = 1.2f;
		} else if (codItem == 101) {
			preco = 1.3f;
		} else if (codItem == 102) {
			preco = 1.5f;
		} else if (codItem == 103) {
			preco = 1.2f;
		} else if (codItem == 104) {
			preco = 1.3f;
		} else if (codItem == 105) {
			preco = 1.0f;
		}
		
		valorAPagar = preco * quantidade;
		
		System.out.println("Valor a pagar: "+df.format(valorAPagar));
	}

}
