package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		String dataFormatada = (dia < 10 ? "0"+dia : dia) + "/" + (mes < 10 ? "0"+ mes : mes) +"/" + ano;
		return dataFormatada;
	};
	
	void imprimirDataFormatada() {
		System.out.printf("\n%d/%d/%d", dia, mes, ano);
	};
}
