import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			float numero, numero1, soma, subtracao, multiplicacao, divisao;
			
			System.out.println("DIGITE O NUMERO");
			numero = leia.nextFloat();
			
			System.out.println("DIGITE O SEGUNDO NUMERO");
			numero1 = leia.nextFloat();
			
			soma = numero + numero1;
			subtracao = numero - numero1;
			multiplicacao = numero * numero1;
			divisao = numero / numero1;
			
			System.out.println("soma: " +soma);
			System.out.println("subtracao: " +subtracao);
			System.out.println("multiplicacao: " +multiplicacao);
			System.out.println("divisao: " +divisao);
		}
	}