package DA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RevisaoProvaLoop {

	public static void main(String[] args) {
		System.out.println("=== Programa para calcular imposto e gratificação ===\n");

		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");

		float salarioBruto, imposto, gratificacao = 0, salarioLiquido;
		int tempoServico;

		for (int i = 0; i < 10; i++) {

			do {
				System.out.print("Informe o SALÁRIO BRUTO (0 para SAIR): ");
				salarioBruto = leia.nextFloat();
				if (salarioBruto < 0) {
					System.out.println(">>>> O salário deve ser maior que 0!");
				}
			} while (salarioBruto < 0);

			if (salarioBruto == 0) {
				break;
			}

			do {
				System.out.print("Informe o TEMPO DE SERVIÇO: ");
				tempoServico = leia.nextInt();
				if (tempoServico < 0) {
					System.out.println(">>>> O tempo de casa deve ser maior que 0!");
				}
			} while (tempoServico < 0);

			// Calcular o imposto
			if (salarioBruto <= 500) {
				imposto = 0;
			} else if (salarioBruto <= 1500) {
				imposto = salarioBruto * 0.03f;
			} else if (salarioBruto <= 3000) {
				imposto = salarioBruto * 0.08f;
			} else {
				imposto = salarioBruto * 0.12f;
			}

			// Calcular a gratificação
			if (salarioBruto >= 2000 && tempoServico <= 3) {
				gratificacao = 20;
			} else if (salarioBruto >= 2000 && tempoServico > 3) {
				gratificacao = 35;
			} else if (salarioBruto < 2000 && tempoServico <= 3) {
				gratificacao = 23;
			} else if (salarioBruto < 2000 && tempoServico <= 6) {
				gratificacao = 30;
			} else if (salarioBruto < 2000 && tempoServico > 6) {
				gratificacao = 40;
			}

			salarioLiquido = salarioBruto - imposto + gratificacao;

			System.out.println("\n==============================================");
			System.out.println("Salário Bruto  : " + df.format(salarioBruto));
			if (imposto == 0) {
				System.out.println("Imposto isento");
			} else {
				System.out.println("Imposto        : " + df.format(imposto));
			}
			System.out.println("Gratificação   : " + df.format(gratificacao));
			System.out.println("Salário Líquido: " + df.format(salarioLiquido));
			System.out.println("==============================================\n ");
		}
	}

}
