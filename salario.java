import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoHoras {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		int salarioMinimo = 880;
		float salarioBruto;
		float imposto;
		float ValorGanhocomHoras;
		float salarioHora = 256.08f;
		System.out.println("DIGITE AS HORAS TRABALHADAS");
		float numerodeHoras = leia.nextFloat();
		
		 ValorGanhocomHoras = numerodeHoras * salarioHora;
		 imposto = ValorGanhocomHoras /100 *3;
		 salarioBruto = ValorGanhocomHoras - imposto;
		 
		 System.out.println("ValorGanhocomHoras: " +df.format(ValorGanhocomHoras));
		 System.out.println("salarioBruto: " +df.format(salarioBruto));
	}

}
