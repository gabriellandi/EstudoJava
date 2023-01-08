package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		double media = 5.6;
		
		String resultadoParcial = media >= 5.0 ? "Recuperação" : "Reprovou";
		String resultado = media >= 7.0 ? "Passou" : resultadoParcial;
		
		System.out.println(resultado);
		
	}
	
}
