package DA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista_05_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");

		int codProd, quantidade;
		float preco = 0, valorAPagar, valorDesconto;

		System.out.println("");
		System.out.println("\t|====== TABELA DE PREÇOS ======|");
		System.out.println("\t| Código do Produto |  Preço   |");
		System.out.println("\t|       1 a 10      | R$ 10,00 |");
		System.out.println("\t|      11 a 20      | R$ 15,00 |");
		System.out.println("\t|      21 a 30      | R$ 20,00 |");
		System.out.println("\t|      31 a 40      | R$ 30,00 |");
		System.out.println("\t|==============================|\n");

		System.out.print("> Informe o Código do Item: ");
		codProd = leia.nextInt();

		System.out.println("Informe a QUANTIDADE de Itens: ");
		quantidade = leia.nextInt();

		if (codProd >= 1 && codProd <= 10) {
			preco = 10;
		} else if (codProd >= 11 && codProd <= 20) {
			preco = 15;
		} else if (codProd >= 21 && codProd <= 30) {
			preco = 20;
		} else if (codProd >= 31 && codProd <= 40) {
			preco = 30;
		}

		valorAPagar = preco * quantidade;

		if (valorAPagar <= 250) {
			valorDesconto = valorAPagar * 0.05f;
		} else if (valorAPagar <= 500) {
			valorDesconto = valorAPagar * 0.10f;
		} else {
			valorDesconto = valorAPagar * 0.15f;
		}
		
		System.out.println("Preço Unitário     : "+df.format(preco));
		System.out.println("Valor da Nota      : "+df.format(valorAPagar));
		System.out.println("Desconto           : "+df.format(valorDesconto));
		System.out.println("Valor com Desconto : "+df.format(valorAPagar-valorDesconto));

	}

}
