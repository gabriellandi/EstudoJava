package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9: //Como os objetivos são os mesmo não é necessário repetir
			conceito = "A";
			break;
		case 8: case 7: //Como os objetivos são os mesmo não é necessário repetir
			conceito = "B";
			break;
		case 6: case 5: //Como os objetivos são os mesmo não é necessário repetir
			conceito = "C";
			break;
		case 4: case 3: //Como os objetivos são os mesmo não é necessário repetir
			conceito = "D";
			break;
		case 2: case 1: case 0: //Como os objetivos são os mesmo não é necessário repetir
			conceito = "E";
			break;
		default:
			conceito = "não encontrado!";
			break;
		}
		
		System.out.println("Conceito é " + conceito);
		entrada.close();
	}
}
