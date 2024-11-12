package membros_estáticos_e_não_estáticos;
//Crie uma classe chamada Calculadora que tenha um método estático chamado somar, que recebe dois inteiros como parâmetros e retorna a soma deles.
//Em seguida, crie uma classe principal para testar esse método.

public class Calculadora{
    public static int somar(int n1, int n2){
        return n1 + n2;
    }
    public static void main(String[] args){
        int resultado = Calculadora.somar(2, 3);
        System.out.println(resultado);
    }
}