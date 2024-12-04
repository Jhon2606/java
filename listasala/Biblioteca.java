public class Biblioteca {
    private int tam;
    private Livros[] livro;
    private int posicaoAtual; // Índice que vai controlar onde adicionar o próximo livro

    public Biblioteca(int tam){
        this.tam = tam;
        livro = new Livros[tam];
        posicaoAtual = 0; // Inicializa a posição atual para 0
    }

    // Método para adicionar um livro
    public void adicionarLivros(Livros l) {
        if (posicaoAtual < tam) {
            livro[posicaoAtual] = l;
            posicaoAtual++; // Incrementa a posição após adicionar o livro
        } else {
            System.out.println("Não há mais espaço para adicionar livros.");
        }
    }

    // Método para exibir os livros
    public void exibirLivros() {
        if (posicaoAtual == 0) {
            System.out.println("Não há livros na biblioteca.");
        } else {
            for (int i = 0; i < posicaoAtual; i++) {
                System.out.println("Livro " + (i + 1) + ": " + livro[i].getNome());
            }
        }
    }

    // Método para buscar um livro pelo nome
    public Livros buscarLivro(String nome) {
        for (int i = 0; i < posicaoAtual; i++) {
            if (livro[i].getNome().equals(nome)) {
                return livro[i]; // Retorna o livro encontrado
            }
        }
        System.out.println("Livro não encontrado.");
        return null; // Retorna null caso o livro não seja encontrado
    }

    public static void main(String[] args){
        Biblioteca b1 = new Biblioteca(3);
        
        // Criando livros
        Livros livro1 = new Livros();
        livro1.setNome("Java para Iniciantes");
        
        Livros livro2 = new Livros();
        livro2.setNome("Estruturas de Dados");
        
        Livros livro3 = new Livros();
        livro3.setNome("Padrões de Projeto");

        // Adicionando livros na biblioteca
        b1.adicionarLivros(livro1);
        b1.adicionarLivros(livro2);
        b1.adicionarLivros(livro3);

        // Exibindo os livros na biblioteca
        b1.exibirLivros();
        
        // Buscando um livro
        String nomeBuscado = "Estruturas de Dados";
        Livros resultado = b1.buscarLivro(nomeBuscado);
        
        if (resultado != null) {
            System.out.println("Livro encontrado: " + resultado.getNome());
        }
    }
}

class Livros {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
