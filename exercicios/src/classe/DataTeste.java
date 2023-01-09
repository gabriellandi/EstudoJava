package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		data1.dia = 3;
		data1.mes = 10;
		data1.ano = 1989;
		
		Data data2 = new Data();
		data2.dia = 22;
		data2.mes = 8;
		data2.ano = 2015;
		
		String primeiraData = data1.obterDataFormatada();
		String segundaData = data2.obterDataFormatada();
		
		System.out.printf("A primeira data é %s e a segunda data é %s", primeiraData, segundaData);
		
		data1.imprimirDataFormatada();
		
	}
	
}
