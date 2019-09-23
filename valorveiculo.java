import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio6_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		int anoVeiculo, idade;
		float valorVeiculo, valorDescontoAno = 0 , valorFinal, valorDescontoIdade = 0, descontoTotal;
		
		System.out.println("");
		System.out.println("\t|====== TABELA DE DESCONTOS ======|");
		System.out.println("\t| Ano do Veiculo |  Desconto   |");
		System.out.println("\t|       Até 2000      | 12% |");
		System.out.println("\t|      2001 até 2010  | 7%  |");
		System.out.println("\t|      2011 até 2014  | 3%  |");
		System.out.println("\t|==============================|\n");

		System.out.println("");
		System.out.println("\t|====== TABELA POR IDADE ======|");
		System.out.println("\t| IDADE       |     Desconto   |");
		System.out.println("\t|ATÉ 40       | 0.5% |");
		System.out.println("\t|41 ATÉ 60    | 1% |");
		System.out.println("\t|ACIMA DE 60  | 3% |");
		System.out.println("\t|==============================|\n");
		
		System.out.print("> Informe o VALOR do Veiculo: ");
		 valorVeiculo= leia.nextFloat();
		
		System.out.print("> Informe o ANO do Veiculo: ");
		 anoVeiculo= leia.nextInt();
		 
		 System.out.print("> Informe a SUA IDADE: ");
		 idade= leia.nextInt();
		 
		 if (anoVeiculo == 2000) {
			 valorDescontoAno = valorVeiculo / 100 *12.0f;
		 }else if  (anoVeiculo >= 2001 && anoVeiculo <= 2010) {
			 valorDescontoAno = valorVeiculo / 100 * 0.7f;
		 }else if (anoVeiculo >= 2011 && anoVeiculo <= 2014) {
			 valorDescontoAno = valorVeiculo / 100 *0.3f;
		 } 
		
		if (idade == 40) {
			valorDescontoIdade = valorVeiculo / 100 * 0.5f;
		} else if (idade >= 41 && idade <= 60) {
			valorDescontoIdade = valorVeiculo / 100 * 1.0f;
		} else if (idade > 60) {
			valorDescontoIdade = valorVeiculo /100 * 3.0f;	
		}
		
		descontoTotal = valorDescontoAno + valorDescontoIdade;
		valorFinal= valorVeiculo - descontoTotal;
		
		System.out.println("Seu Veiculo é do ano de:    " +anoVeiculo);
		System.out.println("Sua Idade é:     " +idade);
		System.out.println("Seu Desconto pelo ano do veiculo é:    " + df.format(valorDescontoAno));
		System.out.println("Seu Desconto pela Idade é:     " +df.format(valorDescontoIdade));
		System.out.println("Seu Desconto total é:    " +df.format(descontoTotal));
		System.out.println("O valor Total do veiculo sera de       :    " +df.format(valorFinal));
		 }
	}
