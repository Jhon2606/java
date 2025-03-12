package testafuncionario2;

public class TestaFuncionario2 {

    public static void main(String[] args) {
        Funcionario[] f = {new Gerente("Fabricio", 5000.00), new Vendedor("Raphael", 3000.00, 10),
            new Estagiario("Calango", 1500.00)};
        
        for (Funcionario funcionario : f) {
            System.out.printf("Nome: %s, Salário Final: R$ %.2f%n",
                    funcionario.getNome(),
                    funcionario.calcularSalario());
        }
    }

}
