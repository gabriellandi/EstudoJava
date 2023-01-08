package fundamentos.operadores;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2"); // compara todos os detalhes da linguagem
		
		String s = new String("2");
		System.out.println("2".equals(s)); // o equals compara os conteudos ignorando o restante
	}
}
