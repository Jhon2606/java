package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> lista;

    public Biblioteca(){
        this.lista = new ArrayList<>();
    }

    public void adicionarLivro(Livro l){
        lista.add(l);
    }
    public void removerLivro(int isbn){
        lista.removeIf(l -> l.getIsbn() == isbn);
    }
    public String buscarLivro(String titulo){
        for(Livro l: lista){
            if(titulo.equals(l.getTitulo())){
                return "Nome: " + l.getTitulo() + " Autor: " + l.getAutor() + " ISBN: " + l.getIsbn();
            }
        }
        return "Livro não encontrado";
    }
    public void exibirLivros() {
        if (lista.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for (Livro l : lista) {
                System.out.println("Nome: " + l.getTitulo() + " Autor: " + l.getAutor() + " ISBN: " + l.getIsbn());
            }
        }
    }
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro l1 = new Livro("Java: Como Programar", "Deitel", 12345);
        Livro l2 = new Livro("Clean Code", "Robert C. Martin", 67890);
        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.exibirLivros();
        biblioteca.removerLivro(12345);
        System.out.println(biblioteca.buscarLivro("Clean Code"));
        biblioteca.exibirLivros();
    }
}