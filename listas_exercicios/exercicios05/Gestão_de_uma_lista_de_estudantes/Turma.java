package Gestão_de_uma_lista_de_estudantes;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> lista;
    public Turma(){
        this.lista = new ArrayList<>();
    }
    public void adicionarAluno(Aluno a){
        lista.add(a);
    }
    public void removerAluno(int matricula){
        Aluno alunoParaRemover = null;

        for (Aluno a : lista) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
    
        if (alunoParaRemover != null) {
            lista.remove(alunoParaRemover);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    
        }

        public double mediaAlunos(){
            double som = 0;
            double media;
            
            for(Aluno a: lista){
                som += a.getNota();
            }
            media = som/ lista.size();
            return media;
        }
        
    public void exibirAlunos(){
        for(Aluno a: lista){
            System.out.println("Nome: " + a.getNome() + " Matriula: " + a.getMatricula() + " Nota: " + a.getNota());
        }
    }
    public static void main(String[] args) {
        Turma t1 = new Turma();
        Aluno a1 = new Aluno("Joao", 8.5, 123);
        Aluno a2 = new Aluno("Maria", 9.0, 456);

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.exibirAlunos();

        t1.removerAluno(123);
        t1.exibirAlunos();
        
        System.out.println("A media dos alunos foi: "+ t1.mediaAlunos());
    }
}
