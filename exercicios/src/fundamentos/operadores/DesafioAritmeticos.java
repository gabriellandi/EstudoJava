package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double a = 6*(3+2);
		double primeira = Math.pow(a, 2)/(3*2);
		
		double b = ((1-5)*(2-7))/2;
		double segunda = Math.pow(b, 2);
		
		double cima = Math.pow(primeira - segunda, 3);
		
		int resultado = (int) (cima/Math.pow(10, 3));
		
		System.out.println(resultado);
		
	}
}
