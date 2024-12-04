public class Biblioteca {
    private String[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        livros = new String[capacidade];
        contador = 0;
    }

    public void adicionarLivro(String nomeLivro) {
        if (contador < livros.length) {
            livros[contador] = nomeLivro;
            contador++;
            System.out.println("Livro adicionado: " + nomeLivro);
        } else {
            System.out.println("Biblioteca cheia! Não é possível adicionar mais livros.");
        }
    }

    public String buscarLivro(String nomeLivro) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].equalsIgnoreCase(nomeLivro)) {
                return "Livro encontrado: " + livros[i];
            }
        }
        return "Livro não encontrado.";
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        biblioteca.adicionarLivro("Robin Wood");
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("Harry Potter");

        System.out.println(biblioteca.buscarLivro("Robin Wood"));
        System.out.println(biblioteca.buscarLivro("Sherlock Holmes"));
    }
}
