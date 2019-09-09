package exercicio;

import java.util.Scanner;

public class teclado {

	public static void main(String[] args) {
		Scanner leia;
		leia = new Scanner(System.in);
		
		int anoAtual;
		int anoNascimento;
		int idade;
		
		System.out.println("DIGITE O ANO ATUAL");
		anoAtual = leia.nextInt();
		
		System.out.println("DIGITE O ANO DE NASCIMENTO");
		anoNascimento = leia.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		System.out.println("Idade: " +idade);
	
	}
	
	

}
