public class PortaValor {
    public static <T> T retornaOMesmo(T valor){
        return valor;
    }
    public static void main(String[] args) {
         Integer numero = PortaValor.retornaOMesmo(10);
         String texto = PortaValor.retornaOMesmo("Olá, Generics!");
         Character caractere = PortaValor.retornaOMesmo('A');
 
         System.out.println("Integer: " + numero);
         System.out.println("String: " + texto);
         System.out.println("Character: " + caractere);
    }
}