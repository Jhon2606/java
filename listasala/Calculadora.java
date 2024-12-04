public class Calculadora {
	public static int soma(int i, int j) {
		return i + j;
	}
	public static int subtracao(int i, int j) {
		return i - j;
	}
	public static int multiplicacao(int i, int j) {
		return i * j;
	}
	public static int divisao(int i, int j) {
		return i / j;
	}
	public static void main(String[] args) {
		System.out.println(Calculadora.divisao(2, 2));
	}
}