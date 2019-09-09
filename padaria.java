import java.util.Scanner;

public class padaria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float pao = (float) 0.62; float broa = (float) 2.90, vendidosjuntos, paesSeparados, broasSeparadas, porcentagem;
		
		System.out.println("DIGITE A QUANTIDADE DE PAES VENDIDOS");
		float quantidadepao = leia.nextFloat();
		
		System.out.println("DIGITE A QUANTIDADE DE BROAS VENDIDAS");
		float quantidadebroa = leia.nextFloat();
		
		vendidosjuntos = (float) ((pao * quantidadepao) + (broa * quantidadebroa));
		paesSeparados = (float) ((pao * quantidadepao));
		broasSeparadas = (float) ((broa * quantidadebroa));		
		porcentagem = (float) ((quantidadebroa + quantidadepao)) /100 *30;
		
		System.out.println("venderamJuntos: " +vendidosjuntos);
		System.out.println("paes separados: " +paesSeparados);
		System.out.println("broas separadas: " +broasSeparadas);
		System.out.println("porcentagem: " +porcentagem);
	}

}
