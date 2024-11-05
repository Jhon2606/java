package ResolucaoTela;

import java.awt.Dimension;
import  java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args){
        Toolkit ferramenta = Toolkit.getDefaultToolkit();
        Dimension tamanhotela = ferramenta.getScreenSize();
        System.out.println("O tamanho da tela e");
        System.out.println(tamanhotela.width + " x " + tamanhotela.height);
    }
}
