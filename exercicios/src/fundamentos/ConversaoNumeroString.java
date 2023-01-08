package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //chamei a variavel a transformei em string
		
		double num3 = 300;
		System.out.println(String.valueOf(num3));
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); //mostrei o tipo de variavel, transformei ela em string e setei a variavel como parametro, para demonstrar quem iria se transforma em string.
		
		System.out.println(("" + num2).length());//transformei o numero em string, concatenando ele com uma "string"
	}
}
