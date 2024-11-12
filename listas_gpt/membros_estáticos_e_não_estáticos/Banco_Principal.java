//Crie uma classe Banco com um atributo estático taxaJuros que define a taxa de juros aplicável a todas as contas.
//Além disso, adicione uma classe Conta com um saldo e um método calcularJuros que calcula o saldo atualizado com base na taxa de juros
//No método main, crie uma conta e altere a taxa de juros global.
class Banco{
    public static double taxaJuros = 0.05;
}
class Conta{
    private double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }
    public double calcularJuros(){
        return saldo * (1 + Banco.taxaJuros);
    }
}
public class Banco_Principal{
    public static void main(String[] args) {
        Conta c1 = new Conta(200.00);
        Conta c2 = new Conta(300.00);
        Banco.taxaJuros = 0.10;
        Conta c3 = new Conta(500.00);
        
        System.out.printf("Juros: %.2f\n", c1.calcularJuros());
        System.out.printf("Juros: %.2f\n", c2.calcularJuros());
        System.out.printf("Juros: %.2f\n", c3.calcularJuros());
    }
}
