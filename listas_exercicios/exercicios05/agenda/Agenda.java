package agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> lista;

    public Agenda(){
        this.lista = new ArrayList<>();
    }
    public void adicinarContato(Contato c){
        lista.add(c);
    }
    public void removerContato(String nome){
        lista.removeIf(c -> c.getNome().equals(nome));
    }
    public void buscarContato(String nome){
        for(Contato l: lista){
            if(l.getNome().equals(nome)){
                System.out.println(l);
                break;
            }
        }
    }
    public void exibirContatos(){
        for(Contato c: lista){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Contato c = new Contato("Sergio", 9985642, "Sergio@gmail.com");
        Contato c2 = new Contato("Andre", 159875632, "Andre@gmail.com");
        Agenda a = new Agenda();
        a.adicinarContato(c);
        a.adicinarContato(c2);
        a.exibirContatos();
        a.removerContato("Andre");
        a.buscarContato("Sergio");
        a.exibirContatos();


    }
}
