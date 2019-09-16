import java.util.Scanner;

public class notas_e_aprovação {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nome;
		String disciplina;
		float nota1, nota2, nota3, notaFinal;
		
		System.out.println("DIGITE SEU NOME");
		nome = leia.nextLine();
		
		System.out.println("DIGITE A NOTA 1");
		nota1 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA 2");
		nota2 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA 3");
		nota3 = leia.nextFloat();
		
		notaFinal = nota1 + nota2 +nota3;
		
		System.out.println("Nome =  " +nome);
		System.out.println("Nota 1  " +nota1);
		System.out.println("Nota2  " +nota2);
		System.out.println("Nota3  " +nota3);
		System.out.println("NotaFinal  " +notaFinal);
		
		if(notaFinal >= 60)
			System.out.println("Aprovado");
		
		if(notaFinal < 60 )
			System.out.println("Reprovado");

	}
