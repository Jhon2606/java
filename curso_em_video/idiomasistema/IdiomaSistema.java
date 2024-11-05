package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args){
        Locale lugar = Locale.getDefault();
        System.out.println("Seu idioma do sitema e " + lugar.getDisplayLanguage());
        System.out.println("Código do idioma: " + lugar.getDefault());
    }
}
