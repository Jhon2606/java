import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite elementos para adicionar no ArrayList: [Digite sair para terminar]");
		while(true) {
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("sair")) {
				break;
			}
			lista.add(input);
		}
		System.out.println("Elementos: ");
		for(String elemento: lista) {
			System.out.println(elemento);
		}
		scanner.close();
	}
}