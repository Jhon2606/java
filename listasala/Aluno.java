public class Aluno {
	private double notaFinal;
	private String nome;

	public Aluno(double notaFinal, String nome) {
		this.nome = nome;
		this.notaFinal = notaFinal;
	}
	public String aprovado() {
		if(this.notaFinal >= 7) {
			return "aprovado";
		} else {
			return "reprovado";
		}
	}
	public static void main(String[] args) {
		Aluno a1 = new Aluno(10, "Fedinadirson");
		System.out.println("O aluno " + a1.nome + " foi " + a1.aprovado());
	}
}