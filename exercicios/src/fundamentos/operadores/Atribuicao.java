package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b
		c -= b; //c = c - b
		c *= b; //c = c * b
		c /= b; //c = c / b
		c %= 2; //c = c % 2 -- 0 é par -- 1 é ímpar;
		
		System.out.println(c);		
	}
}
