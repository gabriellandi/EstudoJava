package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5 ; i++) {
			System.out.println(valor);
			valor+="#";
		}
		
		//Verso do desafio
		//Não pode usar valor numérico para controlar o laço!
		
		String cerquilha = "#";
		for(; cerquilha.length() <= 5 ;) {
			System.out.println(cerquilha);
			cerquilha+="#";
		}
		
		//Resposta do Professor
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		
	}
}
