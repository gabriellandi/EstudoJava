package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na terça
		//Trabalho na quinta
		
		boolean terça = false;
		boolean quinta = false;
		
		if(terça && quinta) {
			System.out.println("TV DE 50' POLEGADAS E SORVETE PARA FAMILIA");
		} else if(terça || quinta) {
			System.out.println("TV DE 32' POLEGADAS E SORVETE PARA FAMILIA");
		} else {
			System.out.println("Vai passar fome");
		}
	}
}
