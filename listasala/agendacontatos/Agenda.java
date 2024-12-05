/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontatos;

public class Agenda {

    private Contato[] contatos;
    private int cont;

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
        cont = 0;
    }

    public boolean addContato(Contato c) {
        if (cont < contatos.length) {
            contatos[cont] = c;
            cont++;
            return true;
        }
        return false;
    }

    public boolean removerContatoPrimeiraOcorrenciaApenas(String nome) {
        boolean achou = false;
        int pos = -1;

        /*
        1 passo: procurar o nome e guardar a posição da primeira ocorrência se achar.
        
        esse primeiro for apenas percorre o vetor procurando pelo nome e se achar guarda o
        índice em que achou na variável pos. a instrução break serve para interromper o loop porque
        essa versão do método vai remover só a primeira ocorrência do nome procurado
        (caso haja mais de uma)
         */
        for (int i = 0; i < cont; i++) {
            if (contatos[i].getNome().equals(nome)) {
                achou = true;
                pos = i;
                break;
            }
        }

        /*
        2 passo: fazer a remoção que é jogar todo mundo da posição encontrata até a quantidade menos 1 pra esquerda
        usamos cont-1 porque cont não é uma posição ocupada nunca. então os deslocamentos sempre ocorrerão
        da posição a remover até cont-1 que é onde está o último elemento realmente armazenado no vetor
          
         */
        if (achou) {
            for (int i = pos; i < cont - 1; i++) {
                contatos[i] = contatos[i + 1];
            }
            cont--;//após remover o contato, temos que ajustar a contagem (quantidade) de contatos na agenda subtraindo 1.
        }

        /*
        por fim, o método retorna o boolean para o cliente poder verificar se realmente houve ou não
        alguma remoção (se o contato não existir vai retornar falso e não haverá remoção alguma).
         */
        return achou;
    }

    public boolean removerContatoTodasOcorrencias(String nome) {
        boolean achou = false;
        int i = 0;
        while (i < cont) {
            while (contatos[i].getNome().equals(nome) && (i < cont)) {
                achou = true;
                for (int j = i; j < cont - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                cont--;//enquanto estivermos removendo temos que subtratir 1 de cont (cont--)
                //estaremos dentro desse while (contatos[i].getNome...) somente se na posição i
                //o nome for o recebido como chave de busca.
            }
            i++;
        }
        return achou;
    }

    public int tamanho() {
        return cont;
    }

    public void limpar() {
        cont = 0;
    }

    public Contato buscarContato(String nome) {
        for (int i = 0; i < cont; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return contatos[i];

            }
        }
        return null;
    }

    public String listarContatos() {
        String temp = "";
        if (cont == 0) {
            return "A agenda está vazia!";
        }
        for (int i = 0; i < cont; i++) {
            temp += "Contato " + (i + 1) + ": Nome: " + contatos[i].getNome() + " - Telefone: " + contatos[i].getTelefone() + "\n";
        }
        return temp;

    }

}
