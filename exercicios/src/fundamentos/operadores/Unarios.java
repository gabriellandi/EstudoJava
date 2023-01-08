package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a+1 
		a--; // a = a-1
		
		++b; // b = b+1
		--b; // b = b-1
		
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("Mini-Desafio...");
		System.out.println(++a == b--); //Regra de precedencia, ele irá incrementar o a, antes de realizar a comparação,e só depois
//										irá decrementar o B.
		System.out.println(a == b); // aqui as variaveis já estao devidademente incrementadas e decrementadas
		System.out.println(a);
		System.out.println(b);
		
	}
}
