package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double nota = entrada.nextDouble();
		
		if(nota >= 7.0) {
			System.out.println("Voce foi aprovado");
		} else if(nota >= 5.0 && nota < 7.0) {
			System.out.println("Voce ficou de recuperacao");
		} else {
			System.out.println("Voce está reprovado");
		}
		
		entrada.close();
	}
}
