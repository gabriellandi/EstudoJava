package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu ultimo salario: ");
		String salario1 = entrada.nextLine();
		System.out.println("Digite seu penultimo salario: ");
		String salario2 = entrada.nextLine();
		System.out.println("Digite seu antepenultimo salario: ");
		String salario3 = entrada.nextLine();
		
		salario1 = salario1.replaceAll(",", ".");
		double salario1Ajustado = Double.parseDouble(salario1);
	
		salario2 = salario2.replaceAll(",", ".");
		double salario2Ajustado = Double.parseDouble(salario2);
		
		salario3 = salario3.replaceAll(",", ".");
		double salario3Ajustado = Double.parseDouble(salario3);
		
		double mediaSalarial = (salario1Ajustado + salario2Ajustado + salario3Ajustado) /3;
		
		System.out.println(mediaSalarial);
		
		entrada.close();
	}
	

}
