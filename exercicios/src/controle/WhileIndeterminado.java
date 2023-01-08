package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String digitado = "";
		
		while(!digitado.equalsIgnoreCase("sair")) {
			System.out.print("Digite uma palavra: ");
			digitado = entrada.nextLine();
			System.out.println(digitado);
		}
		
		entrada.close();
	}
}
