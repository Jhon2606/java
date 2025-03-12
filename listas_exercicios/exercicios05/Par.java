
public class Par <T1, T2> {
    private T1 primeiro;
    private T2 segundo;

    public void setPrimeiro(T1 primeiro) {
        this.primeiro = primeiro;
    }
    public void setSegundo(T2 segundo) {
        this.segundo = segundo;
    }
    public T1 getPrimeiro() {
        return primeiro;
    }
    public T2 getSegundo() {
        return segundo;
    }
    public static void main(String[] args) {
        Par<String, Integer> teste = new Par<>();
        teste.setPrimeiro("oi");
        teste.setSegundo(4);
        System.out.println(teste.toString());
    }
    @Override
    public String toString() {
        return "<" + primeiro + ", " + segundo + ">";
    }
}
