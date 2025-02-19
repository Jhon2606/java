package exercicios05;

public class ImpressoraGenerica<T> {
    public <T> void printValor(T value){
        System.out.println("Valor: " + value);
    }
    public static void main(String[] args) {
        ImpressoraGenerica<Integer>  string = new ImpressoraGenerica<>();
        string.printValor("oi");
    }
}
