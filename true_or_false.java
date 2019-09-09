public class true_or_false {

	public static void main(String[] args) {
		int a = 45, b = 12;
		boolean c; /* boolean serve para falar se a afirmação é verdadeira ou falsa*/
		boolean d;
		boolean e;
		boolean f;
		boolean g;
		boolean h;
		
		c = (boolean) (a == b); /* aqui coloquei para que o compilador faça o calculo e me fale se é verdadeiro ou falso*/
		d = (boolean) (a * 2 >= b - a);
		e = (boolean) (b%2 > a%2);
		f = (boolean) (b++ < a--);
		g = (boolean) (a + 45 <= b + 12);
		h = (boolean) (a / b != b / a);
		
		System.out.println(" c = " + c); /* aqui para que me mostre na tela o resultado final*/
		System.out.println(" d = " + d);
		System.out.println(" e = " + e);
		System.out.println(" f = " + f);
		System.out.println(" g = " + g);
		System.out.println(" h = " + h);
	}

}
