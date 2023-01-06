package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 2894984321251891.62984940; //explicita (CAST)
		System.out.println(b);
		
		int c = 4586;
		byte d = (byte) c;
		
		System.out.println(d);
	}
}
