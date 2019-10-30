import java.text.DecimalFormat;
import java.util.Scanner;

public class alunos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		int rPessoal = 0, rFamiliar = 0, i, total, rMedia = 0;
		String nome = null;
		float alimentacao, outros, mediaGastos, maiorGasto = Float.MIN_VALUE;
		
		for (i = 0; i < 10; i++) {
			
		do {
		System.out.println("DIGITE O NOME DO ALUNO ");
		nome = leia.nextLine();
		} while (nome == null);
		
		do {
			System.out.println("INFORME A RENDA PESSOAL (N PARA SAIR): ");
			rPessoal = leia.nextInt();
			if (rPessoal <= 0) {
				System.out.println(" >>>>> A RENDA PESSOAL NAO PODE SER MENOR OU IGUAL A ZERO!");
			
			}
		} while (rPessoal <= 0);
		
		do {
			System.out.println("INFORME A RENDA FAMILIAR: ");
			rFamiliar = leia.nextInt();
			if (rFamiliar <= 0) {
				System.out.println(" >>>>> A RENDA FAMILIAR NAO PODE SER MENOR OU IGUAL A ZERO! ");
			}
		} while (rFamiliar <= 0);
		
		do {
			System.out.println("INFORME O SEU GASTO COM ALIMENTAÇÃO: ");
			alimentacao = leia.nextInt();
			if (alimentacao <= 0) {
				System.out.println(" >>>>> SEU GASTO COM ALIMENTAÇÃO DEVE SER MAIOR QUE ZERO! ");
			}
		} while (alimentacao <= 0);
		
		do {
			System.out.println("INFORME O SEU GASTO COM DESPESAS: ");
			outros = leia.nextInt();
			if (outros <= 0) {
				System.out.println(" >>>>> SEU GASTO COM DESPESAS TEM QUE SER MAIOR QUE ZERO ");
			}
		} while (outros <= 0);
		
		rMedia = (rPessoal + rFamiliar);
		mediaGastos= (alimentacao + outros)/rFamiliar;
		
		if (mediaGastos > maiorGasto)
			maiorGasto = mediaGastos;
				
		
		// Resultado Intermediário
		System.out.println("NOME DO ALUNO: " + nome);
		System.out.println("RENDA FAMILIAR    : " + df.format(rFamiliar));
		System.out.println("RENDA PESSOAL  : " + df.format(rPessoal));
		System.out.println("GASTO COM ALIMENTAÇÃO  : " + df.format(alimentacao));
		System.out.println("GASTO COM DESPESAS     : " + df.format(outros));
		System.out.println("GASTO MEDIO EM %      : " + mediaGastos  +"%");
		}
		// RESULTADO FINAL
		System.out.println("MEDIA DA RENDA DOS ALUNOS: " +rMedia / i );
		System.out.println("O ALUNO ("+nome+") TEM O MAIOR GASTO DE:      " +maiorGasto +"%");
	}
}
