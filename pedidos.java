package aulaLTP1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cachorroQuente {

	public static void main(String[] args) {
		Scanner read;
		read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		int codigo, quantidade;
		float valor;
		
		System.out.println("Digite o codigo do produto");
		codigo = read.nextInt();
		System.out.println("Digite a quantidade desejada");
		quantidade = read.nextInt();
		
		if (codigo == 100) {
			valor = 1.20f;
			System.out.println("Cachorro Quente, valor total do pedido: "+ df.format(valor*quantidade));
		} else if (codigo == 101) {
			valor = 1.30f;
			System.out.println("Bauru Simples, valor total do pedido: "+ df.format(valor*quantidade));
		} else if (codigo == 102 ) {
			valor = 1.50f;
			System.out.println("Bauru com Ovo, valor total do pedido: "+ df.format(valor*quantidade));
		} else if (codigo == 103) {
			valor = 1.20f;
			System.out.println("Hamburguer, valor total do pedido: "+ df.format(valor*quantidade));
		} else if (codigo == 104 ) {
			valor = 1.30f;
			System.out.println("Cheeseburguer, valor total do pedido: "+ df.format(valor*quantidade));
		} else if (codigo == 105) {
			valor = 1.00f;
			System.out.println("Refrigerante, valor total do pedido: "+ df.format(valor*quantidade));
		}
	}
