package listas_gpt.lista1;
//Enunciado: Crie uma classe chamada ContaBancaria com os atributos numeroConta (String), saldo (double) e nomeTitular (String).
//Implemente um construtor que recebe o número da conta e o nome do titular, e inicialize o saldo em zero.
//Crie métodos depositar e sacar, onde: depositar adiciona uma quantia ao saldo. sacar subtrai uma quantia do saldo, mas apenas se houver saldo suficiente.
public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String nomeTitular;

    public ContaBancaria(String numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.00;
    }

    //ContaBancaria pessoa1 = new ContaBancaria("123456789", 8000.00, "Ferdinandison");

    public void depostitar(double quantia){
        if(this.saldo >= 0){
            this.saldo += quantia;
        }
    }
    public void sacar(double quantia){
        if(this.saldo > 0 && quantia <= saldo){
            this.saldo -= quantia;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
}
