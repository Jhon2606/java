public class Agenda {
    private Contato[] contatos;
    private int cont;

    public Agenda(int tamamnho){
        contatos = new Contato[tamamnho];
        cont = 0;
    }
    public boolean addContato(Contato c){
        if(cont < contatos.length){
            contatos[cont] = c;
            cont++;
            return true;
        }
        return false;
    }
    public boolean removerContato(String nome){
        boolean achou = false;
        for(int i = 0; i < cont; i++){
            if(contatos[i].getNome().equals(nome)){
                achou = true;
                for(int j = i; j < cont; j++){
                    contatos[j] = contatos[j+1];
                }
                contatos[cont] = null;
            }
        }
    }
}public class Agenda {
    private Contato[] contatos;
    private int cont;

    public Agenda(int tamamnho){
        contatos = new Contato[tamamnho];
        cont = 0;
    }
    public boolean addContato(Contato c){
        if(cont < contatos.length){
            contatos[cont] = c;
            cont++;
            return true;
        }
        return false;
    }
    public boolean removerContato(String nome){
        boolean achou = false;
        for(int i = 0; i < cont; i++){
            if(contatos[i].getNome().equals(nome)){
                achou = true;
                for(int j = i; j < cont; j++){
                    contatos[j] = contatos[j+1];
                }
                contatos[cont] = null;
            }
        }
        return achou;
    }
}
class Contato{
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

class Contato{
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
