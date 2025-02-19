package exercicios05;
public class Caixa<T> {
    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    @Override
    public String toString(){
        return "Item armazenado: " + item.toString();
    }
    public static void main(String[] args) {
        Caixa<Integer> caixaInteiro = new Caixa<>();
        caixaInteiro.setItem(42);
        System.out.println(caixaInteiro.getItem());
        System.out.println(caixaInteiro.toString());
    }

}
