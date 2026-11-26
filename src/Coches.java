import java.util.ArrayList;
import java.util.Scanner;

//
//Realiza un programa que permita al usuario añadir marcas de coches mediante la consola. Si escribe una línea en blanco, se acabará de añadir marcas.
//
//Al final debe imprimirlas ordenadas en líneas separadas
public class Coches {
	public static void main(String[] args) {
		ArrayList<String> coches = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String marca;
		System.out.println("Introduce marcas de coches (deja una línea en blanco para terminar):");
		while (true) {
			marca = sc.nextLine();
			if (marca.isEmpty()) {
				break;
			}
			coches.add(marca);
		}
		coches.sort(null);
		for (String coche : coches) {
			System.out.println(coche);
		}
	}
}
