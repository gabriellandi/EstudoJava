package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o dia da semana? ");
		String diaSemana = entrada.next();
		
		diaSemana = diaSemana.toUpperCase();
		
		if(diaSemana.equals("DOMINGO")) {
			System.out.println("1");
		} else if(diaSemana.equals("SEGUNDA")){
			System.out.println("2");
		} else if(diaSemana.equals("TERÇA")){
			System.out.println("3");
		} else if(diaSemana.equals("QUARTA")){
			System.out.println("4");
		} else if(diaSemana.equals("QUINTA")){
			System.out.println("5");
		} else if(diaSemana.equals("SEXTA")){
			System.out.println("6");
		} else if(diaSemana.equals("SABADO")){
			System.out.println("7");
		}else {
			System.out.println("Dia inválido!");
		};
		
		entrada.close();
	}
}
