
import java.text.DecimalFormat;
import java.util.Scanner;

public class horas_e_faltas {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	
		int codigoF;
		float gratificacao = 0, horasextras, horasfalta, fatorh;
		
		for (int i = 0; i < 100; i++) {

			//codigo do funcionario
			do {
				System.out.print("Informe o CODIGO DO FUNCIONARIO (0 para SAIR): ");
				codigoF = leia.nextInt();
				if (codigoF < 0) {
					System.out.println(">>>> Voce deve informar o codigo do Funcionario para continuar");
				}
			} while (codigoF < 0);

			if (codigoF == 0) {
				break;
			}

			//calcular horas extras trabalhadas
			do {
				System.out.print("Informe A quantidade de Horas Extras Trabalhadas: ");
				horasextras = leia.nextInt();
				if (horasextras < 0) {
					System.out.println(">>>> O Numero de horas deve ser positivo!");
				}
			} while (horasextras < 0);

			//calcular horas faltadas
			do {
				System.out.print("Informe A quantidade de horas Faltadas: ");
				horasfalta = leia.nextInt();
				if (horasfalta < 0) {
					System.out.println(">>>> Não existe horas de faltas negativas");
				}
			} while (horasfalta < 0);
			
			//fatorHoras
			fatorh=horasextras-(2/3)*horasfalta;
			
			if (fatorh > 2400) {
				gratificacao = 500;
			} else if (fatorh > 1801 || fatorh < 2400) {
				gratificacao = 400;
			} else if (fatorh > 1201 || fatorh <1800) {
				gratificacao = 300;
			} else if (fatorh > 600 || fatorh < 1200) {
				gratificacao = 200;
			} else if (fatorh < 600) {
				gratificacao = 100;
			}
			
			System.out.println("Codigo Funcionario:    " +codigoF);
			System.out.println("Fator Horas:       " +fatorh);
			System.out.println("Gratificaçao:      " +df.format(gratificacao));
		}
	}	
}
