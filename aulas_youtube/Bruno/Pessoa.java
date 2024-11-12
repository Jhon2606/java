public class Pessoa{
	static int numeroDePessoas = 0; //Declaro uma variavel estática

	String nome; //Declaro uma variavel não estática
	
	public Pessoa(String nome){
		numeroDePessoas++;
		this.nome = nome;
	}

	public static void main(String[] args){
		Pessoa p1 = new Pessoa("Fulano");
		/*não faça assim. torne as variáveis de instância privadas
		 * isso é apenas um código para ilustrar um outro conceito*/
		System.out.println(p1.nome);
		System.out.println(p1.numeroDePessoas);
		
		Pessoa p2 = new Pessoa("Beltrano");
		
		System.out.println(p1.numeroDePessoas);
		System.out.println(p2.numeroDePessoas);
		System.out.println(Pessoa.numeroDePessoas);
		System.out.println(p2.nome);
		
		p2 = null;
		Pessoa.numeroDePessoas--;
		System.out.println(p2.numeroDePessoas);
		System.out.println(Pessoa.numeroDePessoas);
		//System.out.println(nome);//não compila
	}
}