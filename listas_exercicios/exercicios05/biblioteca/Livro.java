package biblioteca;
public class Livro {
    private String titulo;
    private String autor;
    private int isbn;

    public Livro(String titulo, String autor, int isbn){
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }

}
