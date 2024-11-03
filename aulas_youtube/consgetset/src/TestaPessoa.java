public class TestaPessoa {
 public static void main(String[] args){
     Pessoa p1 = new Pessoa("Jhonatas", 1.65);//instanciação
     Pessoa p0 = new Pessoa(null, 0);
     //p1.setNome("Jhonatas");
     //p1.setAltura(1.65);
     System.out.println("Nome: " + p1.getNome());
     System.out.println("Altura: " + p1.getAltura());//As variaveis de instancia sao privadas, mas os metodos da classe podem acessalas e como eles sao publicos eles podem ser invocados por outras classes
     p0.setNome("Marcos");
     p0.setAltura(1.70);
     System.out.println("Nome: " + p0.getNome());
     System.out.println("Altura: " + p0.getAltura());
 }   
}