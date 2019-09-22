package aulaLTP1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Scanner read;
		read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		float salario, dinheiroVendas, dinheiroVendasAltas, dinheiroVendasBaixas;
		
		System.out.println("Informe o salario do Funcionario");
		salario = read.nextFloat();
		System.out.println("Digite o Valor das vendas feitas pelo funcionario");
		dinheiroVendas = read.nextFloat();
		
		if (dinheiroVendas <= salario) {
			System.out.println("O salario do funcionario sera: "+ df.format((salario /100 *15) +salario));
		} else {
			System.out.println("O salario do funcionario sera: "+ df.format((salario /100 *20) +salario));
		 }
		}
		
	}
