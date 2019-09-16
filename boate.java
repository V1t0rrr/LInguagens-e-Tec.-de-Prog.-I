import java.util.Scanner;

public class idade_e_boate {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int anoAtual, anoNascimento;
		
		System.out.println("DIGITE O ANO ATUAL");
		anoAtual = leia.nextInt();
		
		System.out.println("DIGITE SEU ANO DE NASCIMENTO");
		anoNascimento = leia.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		System.out.println("idade " + idade);
		
		if (idade < 18)
			System.out.println("Infelizmente você não poderá frequentar essa boate ");
		
		if (idade >= 18)
			System.out.println("Bem vindo à nossa Boate e tenha uma boa noite :)");
			
	}
	

}
