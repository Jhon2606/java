public class TestaFuncionario {
    public static void main(String[] args) {
        /*Funcionario f1 = new Funcionario();

        f1.setNome("Caludio");
        f1.setSalarioBase(1500.00);
        f1.exibirDados();*/

        Gerente g1 = new Gerente();
        g1.setNome("Marlinda");
        g1.setSalarioBase(3000.00);
        g1.setBonus(10);
        g1.exibirDados();
        System.out.println();
        Vendedor v1 = new Vendedor();
        v1.setNome("Francisco");
        v1.setSalarioBase(2500.00);
        v1.setComissao(100);
        v1.exibirDados();
    }
}
