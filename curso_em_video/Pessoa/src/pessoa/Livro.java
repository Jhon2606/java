package pessoa;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPages;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPages, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPages = totPages;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + ", autor = "
                + autor + ", totPages = " + totPages + ", pagAtual = "
                + pagAtual + ", aberto = " + aberto + ", leitor = " + leitor.getNome()
                + ", idade = " + leitor.getIdade() + ", sexo = " + leitor.getSexo() + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPages() {
        return totPages;
    }

    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPages) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}
