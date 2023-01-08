package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	// Ler o num1
	// Ler o num2
	// + or - or * or / or % 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		double num1 = Double.parseDouble(entrada.nextLine());
		System.out.print("Digite o segundo numero: ");
		double num2 = Double.parseDouble(entrada.nextLine());
		System.out.print("Digite o sinal da operação desejada: ");
		String sinal = entrada.next();
		
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
		
		String resultado = sinal.equals("+") ? String.valueOf(num1 + num2) :
							sinal.equals("-") ? String.valueOf(num1 - num2) :
								sinal.equals("*") ? String.valueOf(num1 * num2) :
									sinal.equals("/") ? String.valueOf(num1 / num2) : "Você não digitou uma operação valida";
		
		System.out.println("O resulta da operalção é: " + resultado);
		
		entrada.close();
	}
}
