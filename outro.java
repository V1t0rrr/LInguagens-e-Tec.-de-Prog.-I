package DA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista_07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		DecimalFormat perc = new DecimalFormat("0.00'%'");

		float   precoPao = 0.62f, 
				precoBroa = 2.90f, 
				vendasPaes, 
				vendasBroas,
				totalVendasPaes=0, 
				totalVendasBroas=0, 
				totalVendas = 0, 
				totalVendasGeral = 0,
				poupanca=0,
				maiorVenda = 0,
				menorVenda = Float.MAX_VALUE;
		
		int 	qtdPaes, 
				qtdBroas,
				totalQtdPaes=0, 
				totalQtdBroas=0, 
				totalItensVendidos=0, 
				formaPagamento;

		do {
			vendasPaes = 0;
			vendasBroas = 0;
			do {
				System.out.print("Informe a QUANTIDADE de PÃES (-1 para SAIR): ");
				qtdPaes = leia.nextInt();
				if(qtdPaes <= 0 && qtdPaes != -1) {
					System.err.println("===> A quantidade de PÃES deve ser maior que ZERO!");
				}
			} while (qtdPaes <= 0 && qtdPaes != -1);

			if (qtdPaes == -1) {
				break;
			}

			do {
				System.out.print("Informe a QUANTIDADE de BROAS: ");
				qtdBroas = leia.nextInt();
				if(qtdBroas <= 0) {
					System.err.println("===> A quantidade de BROAS deve ser maior que ZERO!");
				}
			} while (qtdBroas <= 0);

			do {
				System.out.print("Informa a FORMA DE PAGAMENTO\n 1 - Cartão\n 2 - Dinheiro \n Opção: ");
				formaPagamento = leia.nextInt();
				if(formaPagamento < 1 || formaPagamento > 2) {
					System.err.println("===> Digite apenas código 1 e 2");
				}
			} while (formaPagamento < 1 || formaPagamento > 2);

			vendasPaes = precoPao * qtdPaes;
			vendasBroas = precoBroa * qtdBroas;
			totalVendas = vendasPaes + vendasBroas;
			totalVendasGeral += vendasPaes + vendasBroas;
			totalVendasBroas += vendasBroas;
			totalVendasPaes += vendasPaes;
			totalQtdBroas += qtdBroas;
			totalQtdPaes += qtdPaes;
			poupanca += totalVendas * 0.30f;
			
			if(totalVendas > maiorVenda) {
				maiorVenda = totalVendas;
			}
			
			if(totalVendas < menorVenda) {
				menorVenda = totalVendas;
			}

			System.out.println("RELATÓRIO INTERMEDIÁRIO==================================");
			System.out.println("Quantidade Pães   :" + qtdPaes);
			System.out.println("Venda Pães        :" + df.format(vendasPaes));
			System.out.println("---------------------------------------------------------");
			System.out.println("Quantidade Broas  :" + qtdBroas);
			System.out.println("Venda Broas       :" + df.format(vendasBroas));
			System.out.println("---------------------------------------------------------");
			System.out.println("Total Vendido     :" + df.format(totalVendas));
			System.out.println("=========================================================");
		} while (true);
		totalItensVendidos = totalQtdBroas + totalQtdPaes;
		
		System.out.println("\n\nRELATÓRIO FINAL =========================================");
		System.out.println("Venda Pães                   :" + df.format(totalVendasPaes));
		System.out.println("Percentual de vendas de Pães :" + perc.format(totalQtdPaes/(float)totalItensVendidos*100));
		System.out.println("---------------------------------------------------------");
		System.out.println("Venda Broas                  :" + df.format(totalVendasBroas));
		System.out.println("Percentual de vendas de Broas:" + perc.format(totalQtdBroas/(float)totalItensVendidos*100));
		System.out.println("---------------------------------------------------------");
		System.out.println("Total Arrecadado             :" + df.format(totalVendasGeral));
		System.out.println("Poupança                     :" + df.format(poupanca));
		System.out.println("---------------------------------------------------------");
		System.out.println("MENOR venda                  :" + df.format(menorVenda));
		System.out.println("MAIOR venda                  :" + df.format(maiorVenda));
		System.out.println("=========================================================");

	}
}
