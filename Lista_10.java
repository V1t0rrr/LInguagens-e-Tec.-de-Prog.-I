package DA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista_10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		DecimalFormat perc = new DecimalFormat("0.00'%'");

		String nome, nomeMaiorGasto="";
		float rendaPessoal, rendaFamiliar, gastosAlimentacao, gastosOutrasDespesas, percRendaXGastos, 
			  somaRendasPessoais=0, maiorGasto = Float.MIN_VALUE;
		char flag = 'S';
		int i,	contAlunosGastaMais200 = 0;

		for (i = 0; flag != 'N'; i++) {

			System.out.println("Informe o NOME: ");
			nome = leia.nextLine().toUpperCase();

			do {
				System.out.println("Informe a RENDA PESSOAL: ");
				rendaPessoal = leia.nextFloat();
				if (rendaPessoal < 0) {
					System.out.println(" >>>>> A renda não pode ser menor que ZERO!");
				}
			} while (rendaPessoal < 0);

			do {
				System.out.println("Informe a RENDA FAMILIAR: ");
				rendaFamiliar = leia.nextFloat();
				if (rendaFamiliar <= 0) {
					System.out.println(" >>>>> A renda não pode ser menor ou igual que ZERO!");
				}
			} while (rendaFamiliar <= 0);

			do {
				System.out.println("Informe o Total gasto com ALIMENTAÇÃO: ");
				gastosAlimentacao = leia.nextFloat();
				if (gastosAlimentacao <= 0) {
					System.out.println(" >>>>> O gasto com alimentação não pode ser menor ou igual que ZERO!");
				}
			} while (gastosAlimentacao <= 0);

			do {
				System.out.println("Informe o Total gasto com OUTRAS DESPESAS: ");
				gastosOutrasDespesas = leia.nextFloat();
				if (gastosOutrasDespesas <= 0) {
					System.out.println(" >>>>> O gasto com alimentação não pode ser menor ou igual que ZERO!");
				}
			} while (gastosOutrasDespesas <= 0);

			percRendaXGastos = (gastosAlimentacao + gastosOutrasDespesas) / (rendaPessoal + rendaFamiliar) * 100;
			somaRendasPessoais += rendaPessoal;
			
			if(gastosOutrasDespesas>200) {
				contAlunosGastaMais200++;
			}
			
			if(percRendaXGastos > maiorGasto) {
				maiorGasto = percRendaXGastos;
				nomeMaiorGasto = nome;
			}

			System.out.println("O aluno " + nome + ", possui:");
			System.out.println("- Renda pessoal                                                                    : "
					+ df.format(rendaPessoal));
			System.out.println("- Renda familiar                                                                   : "
					+ df.format(rendaFamiliar));
			System.out.println("- Total gasto com alimentação                                                      : "
					+ df.format(gastosAlimentacao));
			System.out.println("- Total gasto com outras despesas                                                  : "
					+ df.format(gastosOutrasDespesas));
			System.out.println("- % gasto com alimentação e outras despesas em relação às rendas pessoal e familiar: "
					+ perc.format(percRendaXGastos));

			System.out.print("\nDeseja continuar (S/N): ");
			flag = leia.next().toUpperCase().charAt(0);
			// Limpar buffer
			leia.nextLine();
		}
		
		System.out.println("- Porcentagem dos alunos que gasta acima de R$ 200,00 com outras despesas: "+perc.format(contAlunosGastaMais200/i*100));
		System.out.println("- A média da renda pessoal dos alunos                                    : "+df.format(somaRendasPessoais/i));
		System.out.println("- O aluno "+nomeMaiorGasto+" teve o maior gasto percentual               : "+perc.format(maiorGasto));
	}

}
