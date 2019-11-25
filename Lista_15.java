package DA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista_15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");

		String nome[] = new String[100], destino[] = new String[100], tipo[] = new String[100];
		int codDestino, codTipo, quantidadePassagens[] = new int[100], contVendas, qtdPassagensSul = 0,
				totalPassagens = 0, totalIdaEVolta = 0;
		float precoPassagem, valorAPagar[] = new float[100], totalVendido = 0;
		char flag = 'S';

		for (contVendas = 0; contVendas < 100 && flag != 'N'; contVendas++) {

			System.out.println("Informe o NOME do passageiro: ");
			nome[contVendas] = leia.nextLine();

			do {
				System.out.println("REGIÃO ====================== ");
				System.out.println(" 1 - Região norte");
				System.out.println(" 2 - Região nordeste");
				System.out.println(" 3 - Região centro-oeste");
				System.out.println(" 4 - Região sul");
				System.out.print(">>> Informe o código:");
				codDestino = leia.nextInt();
				if (codDestino < 1 || codDestino > 4) {
					System.err.println(">>>>>>> Informe o código entre 1 e 4");
				}
			} while (codDestino < 1 || codDestino > 4);

			do {
				System.out.println("TIPO =================");
				System.out.println(" 1 - Ida");
				System.out.println(" 2 - Ida e Volta");
				System.out.print(">>> Informe o código:");
				codTipo = leia.nextInt();
				if (codTipo < 1 || codTipo > 2) {
					System.err.println(">>>>>>> Informe o código entre 1 e 2");
				}
			} while (codTipo < 1 || codTipo > 2);

			do {
				System.out.println("Quantidades de passagens: ");
				quantidadePassagens[contVendas] = leia.nextInt();
				if (quantidadePassagens[contVendas] < 1) {
					System.err.println(">>>>>>> A Quantidade deve ser maior que ZERO!");
				}
			} while (quantidadePassagens[contVendas] < 1);

			if (codDestino == 1) {
				if (codTipo == 1) {
					precoPassagem = 500;
				} else {
					precoPassagem = 900;
				}
				destino[contVendas] = "Região Norte";
			} else if (codDestino == 2) {
				if (codTipo == 1) {
					precoPassagem = 350;
				} else {
					precoPassagem = 650;
				}
				destino[contVendas] = "Região Nordeste";
			} else if (codDestino == 3) {
				if (codTipo == 1) {
					precoPassagem = 350;
				} else {
					precoPassagem = 600;
				}
				destino[contVendas] = "Região Centro-Oeste";
			} else {
				if (codTipo == 1) {
					precoPassagem = 300;
				} else {
					precoPassagem = 550;
				}
				qtdPassagensSul += quantidadePassagens[contVendas];
				destino[contVendas] = "Região Sul";
			}

			totalPassagens += quantidadePassagens[contVendas];
			valorAPagar[contVendas] = precoPassagem * quantidadePassagens[contVendas];

			if (quantidadePassagens[contVendas] > 1) {
				valorAPagar[contVendas] -= valorAPagar[contVendas] * 0.035f;
			}

			if (codTipo == 2) {
				totalIdaEVolta += quantidadePassagens[contVendas];
				tipo[contVendas] = "Ida e Volta";
			}else {
				tipo[contVendas] = "Ida";
			}

			totalVendido += valorAPagar[contVendas];

			System.out.println("Vendido " + quantidadePassagens[contVendas] + " passagens para " + nome[contVendas]
					+ " por " + df.format(valorAPagar[contVendas]));

			do {
				System.out.println("Deseja continuar (S/N): ");
				flag = leia.next().toUpperCase().charAt(0);
			} while (flag != 'S' && flag != 'N');

			if (contVendas == 99) {
				System.out.println("Total de vendas atingidas no dia!");
			}

			// Limpar Buffer
			leia.nextLine();
		}

		System.out.println("RELATÓRIO FINAL ====================================");
		System.out.println("a)	A quantidade de passagens vendidas para a região Sul: " + qtdPassagensSul);
		System.out.println(
				"b)	A média dos valores faturados por todas as passagens: " + df.format(totalVendido / contVendas));
		System.out.println("c)	A porcentagem de passagens de ida e volta vendida   : "
				+ (totalIdaEVolta / (float) totalPassagens * 100) + "%");
		System.out.println("d)	Todas as Vendas ================================");
		for (int i = 0; i < contVendas; i++) {
			System.out.println("========================================================");
			System.out.println("Nome do passageiro: "+nome[i].toUpperCase());
			System.out.println("Total de passagens: "+quantidadePassagens[i]);
			System.out.println("Destino "+destino[i]);
			System.out.println("Passagem de "+tipo[i]);
			System.out.println("Valor total       : "+df.format(valorAPagar[i]));
		}
	}

}
