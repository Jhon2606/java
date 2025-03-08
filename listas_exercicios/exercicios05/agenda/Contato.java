package agenda;

public class Contato {
    String nome; 
    int telefone; 
    String email;

    public Contato(String nome, int telefone, String email){
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
