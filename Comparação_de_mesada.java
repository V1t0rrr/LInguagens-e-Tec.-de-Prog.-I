import java.util.Scanner;
public class mesada_se_ganha_mais {



		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			float mesadaZezinho, mesadaJoaozinho;
			
			System.out.println("Informe a mesada do ZEZINHO: ");
			mesadaZezinho = leia.nextFloat();
			
			System.out.println("Informe a mesada do JOÃOZINHO: ");
			mesadaJoaozinho = leia.nextFloat();
			
		if (mesadaZezinho > mesadaJoaozinho)
			System.out.println("Zezinho Ganha mais que Joaozinho");
		
		if (mesadaZezinho < mesadaJoaozinho)
				System.out.println("Joaozinho ganha Mais que Zezinho");	
		
		if (mesadaZezinho == mesadaJoaozinho)
			System.out.println("Ambos ganham o mesmo valor de Mesada");	
		
		}

	}
