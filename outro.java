package aulaLTP1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class outro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		int quantidadepao = 0, quantidadebroa = 0, qntdtotalpao = 0, qntdtotalbroa = 0, juntos, formpgnto = 0, tpao = 0, tbroa = 0;
		float vlrtotalpao, vlrtotalbroa, vlrtotaljuntos, arrecadados, fpao, fbroa, tjuntos, qntdtotaljuntos =0, poup;
		float percentualpao, percentualbroa;
		String formaPagamento = null;
		do { 
			
			do {
		

		
		System.out.println("DIGITE A QUANTIDADE DE PAES");
		quantidadepao = leia.nextInt();
		
		System.out.println("DIGITE A QUANTIDADE DE BROAS");
		quantidadebroa = leia.nextInt();
		if(quantidadepao <1 || quantidadebroa <1) {
			System.out.println("PARA CONTINUAR TEM QUE ESCOLHER 1 PRODUTO PELO MENOS");
		}
		
	} while (quantidadebroa<1 && quantidadepao<1);
			do {
		System.out.println("DIGITE A FORMA DE PAGAMENTO (1)CARTAO (2) DINHEIRO");
		formpgnto = leia.nextInt();
		if (formpgnto == 1) {
			formaPagamento = "CARTAO";
		}else if (formpgnto == 2) {
			formaPagamento = "DINHEIRO";
		}
			} while (formpgnto < 1 || formpgnto > 2);
	
	qntdtotalpao= qntdtotalpao + quantidadepao;
	qntdtotalbroa = qntdtotalbroa + quantidadebroa;
	vlrtotalpao = qntdtotalpao * 0.68f;
	vlrtotalbroa = qntdtotalbroa * 2.90f;
	vlrtotaljuntos = vlrtotalpao + vlrtotalbroa;
	juntos = qntdtotalpao + qntdtotalbroa;
	
	
	System.out.println("========== RESULTADOS ==========================");
	System.out.println("A quantidade de broas vendidas nessa compra foi: "+qntdtotalbroa );
	System.out.println("A quantidade de paes  vendidas nessa compra foi: "+qntdtotalpao  );
		
	System.out.println("O valor total de paes: " + df.format(vlrtotalpao));
	System.out.println("O valor total de broas: " + df.format(vlrtotalbroa));
		
	System.out.println("FORMA DE PAGAMENTO           " +formaPagamento );
	System.out.println("TOTAL DE PAES E BROAS: " + df.format(juntos));
		
	System.out.println("=======================================================");

	 tpao = qntdtotalpao;
	 tbroa =qntdtotalbroa;
	 fpao = tpao *0.68f;
	 fbroa = tbroa * 2.90f;
	 arrecadados = fpao + fbroa;
	 tjuntos = tpao + tbroa;

     System.out.println("Exit = 0");
     int sair = leia.nextInt();

    if(sair == 0){
     break;
     }


     } while (true);


 qntdtotaljuntos= tjuntos ;
poup = (arrecadados )/100 *0.30f;
percentualpao = ((tjuntos /100 * tpao));
percentualbroa = ((tjuntos /100 * tbroa));


System.out.println("========== RESULTADOS FINAIS =========================="); 	
System.out.println("A quantidade de broas vendidas nessa compra foi: "+tbroa );	
System.out.println("A quantidade de paes  vendidas nessa compra foi: "+tpao  );	

System.out.println("O valor total de broas vendidos: " + df.format(fbroa));	
System.out.println("O valor total de paes vendidos: " + df.format(fpao));		
System.out.println("O valor total vendidos: " + df.format(arrecadados));		
System.out.println("O percentual do pão é : " + (percentualpao) + "%");					
System.out.println("O percentual da broa é: " + (percentualbroa) + "%");					
	
	}
}
