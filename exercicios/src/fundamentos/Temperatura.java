package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final int ajuste = 32;
		final double fator = 5/9.0;
		double fah = 86;
		double cel = (fah-ajuste)*fator;
		System.out.println("O resulto é " + cel + "°C.");
		
		
		fah = 0;
		cel = (fah-ajuste)*fator;
		System.out.println("O resulto é " + cel + "°C.");
	};
	
};
