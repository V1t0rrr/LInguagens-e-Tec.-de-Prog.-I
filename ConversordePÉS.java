package aulaLTP1;

import java.util.Scanner;

public class jardas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pe = 1, polegadas = pe * 12, jardas = 3* pe, milha = 1* 1760 + jardas;
		System.out.println("DIGITE O NUMERO DE PÉS");
		int quantidadedePes = leia.nextInt();
		
		polegadas = quantidadedePes * 12;
		jardas = quantidadedePes * 3;
		milha = jardas + 1760;
		
		System.out.println("polegadas: " +polegadas);
		System.out.println("jardas: " +jardas);
		System.out.println("milha: " +milha);

	}

}
