package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		double valorFinal = preco * (1 - desconto);
		return valorFinal;
	};
}
