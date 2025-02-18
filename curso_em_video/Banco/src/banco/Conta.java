package banco;

public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("---------------------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta ainda com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
            System.out.println("Conta encerrada");
        }

    }

    public void depositar(double s) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + s);
            System.out.println("Deposito realizado na conta " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(double s) {
        if (this.getStatus()) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado na conta " + this.getDono());
            } else {
                System.out.println("Impossível sacar em uma conta fechada");
            }
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso pot ");
        } else {
            System.out.println("Impossível pagar");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
}
