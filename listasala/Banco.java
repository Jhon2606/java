public class Banco {
	private static double conta_corrente = 0;

	public void deposito(int valor) {
		Banco.conta_corrente += valor;
	}
	public void saque(int valor) {
		Banco.conta_corrente -= valor;
	}
	public Banco(double conta_corrente) {
		Banco.conta_corrente = conta_corrente;
	}
	public static void main(String[] args) {
		Banco b1 = new Banco(1010.00);
		b1.deposito(100);
		b1.saque(10);
		System.out.println("A conta atualmente possui " + Banco.conta_corrente + " reais");
	}
}