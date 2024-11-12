package membros_estáticos_e_não_estáticos;
//Crie uma classe Pessoa com um atributo estático totalDePessoas, que representa o número de instâncias criadas dessa classe.
//Cada vez que um novo objeto Pessoa é criado, incremente esse contador. Adicione um método estático getTotalDePessoas para retornar o valor do contador.
//Teste a classe criando alguns objetos Pessoa.

public class Pessoa {
    private static int totalDePessoas = 0;
    
    public Pessoa(){
        totalDePessoas++;
    }
    public static int getTotalDePessoas(){
        return totalDePessoas;
    }
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        System.out.println("Total de pessoas: " + Pessoa.getTotalDePessoas());
    }
}
