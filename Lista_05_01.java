package DA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista_05_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");

		float salarioFixo, totalVendas, comissao = 0;

		System.out.print("Informe o SAL�RIO FIXO: ");
		salarioFixo = leia.nextFloat();

		System.out.print("Informe o TOTAL DE VENDAS no m�s: ");
		totalVendas = leia.nextFloat();

		if (totalVendas <= salarioFixo) {
			comissao = totalVendas * 0.15f;
		} else {
			comissao = totalVendas * 0.20f;
		}
		
		System.out.println("SAL�RIO FIXO : "+df.format(salarioFixo));
		System.out.println("COMISS�O     : "+df.format(comissao));
		System.out.println("SAL�RIO FINAL: "+df.format(salarioFixo+comissao));

	}

}
