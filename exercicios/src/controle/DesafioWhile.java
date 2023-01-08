package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double total = 0;
		double nota = 0;
		int numAlunos = 0;
		
		while(nota != -1){
			System.out.print("Digite a nota do aluno: (ou -1 para sair)");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >=0) {
				total += nota;
				numAlunos++;
			}else if(nota != -1){
				System.out.println("Nota inválida");
			}
		}
		
		System.out.printf("Esta turma tem %d alunos e a média de notas da sala é %.2f", numAlunos, total/numAlunos);
		
		entrada.close();
	}
}
