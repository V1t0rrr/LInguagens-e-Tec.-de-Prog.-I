package aulaLTP1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class salarioFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		float salario, gratificação = 50, desconto, liquido;
		System.out.println("DIGITE O SEU SALÁRIO");
		float valorSalario = leia.nextInt();
		
		salario =  valorSalario + gratificação;
		desconto = (valorSalario /100) *10;
		liquido = salario - desconto;
		
		System.out.println("Salario liquido: " +df.format(liquido));
		
	}

}
