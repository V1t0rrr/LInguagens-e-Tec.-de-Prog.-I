public class aulaLTP1 {

	public static void main(String[] args) {
		int a = 5, b = 3, c;
		double d = 2.5, f = 0;
		float g;
		
		c = a / b; /*pedi para que o resultado de "c" fosse gerado a partir da divisão de a sobre b*/
		d += d / a; /*pedi para que o resultado de "d" fosse gerado da divisão de d por a*/
		f -= a++/d;
		g = (float) (d*5.1);
		
		System.out.println(" c = " + c);
		System.out.println(" d = " + d);
		System.out.println(" f = " + f);		
		System.out.println(" g = " + g);
		
	}

}
