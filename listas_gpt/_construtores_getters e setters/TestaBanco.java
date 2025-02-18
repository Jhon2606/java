package listas_gpt.lista1;

import java.util.Scanner;

public class TestaBanco {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o nome do contibuinte: ");
        String nome = ler.nextLine();
        System.out.printf("Digite o numero da conta: ");
        String conta = ler.nextLine();

        ContaBancaria cont1 = new ContaBancaria(conta, nome);

        System.out.printf("Digite o valor a ser depositado: ");
        double adicionardinheiro = ler.nextDouble();
        cont1.depostitar(adicionardinheiro);

        System.out.println("Saldo atual:" + cont1.getSaldo());

        System.out.printf("Digite o valor de saque: ");
        double removerDinheiro = ler.nextDouble();
        cont1.sacar(removerDinheiro);

        System.out.println("Saldo atual:" + cont1.getSaldo());
    }
}
