package listas_gpt.lista1;

import java.util.Set;

public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Ana", 9);
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

        Pessoa p2 = new Pessoa("João", 19);
        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());

        Pessoa p3 = new Pessoa(null, 0);
        System.out.println(p3.getNome());
        System.out.println(p3.getIdade());
    }
}
