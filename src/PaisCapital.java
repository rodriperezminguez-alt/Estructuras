import com.sun.source.tree.NewArrayTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
	public static void main(String[] args) {
		Map<String, String> paisesCapitales = new HashMap<>() {{
			put("España", "Madrid");
			put("Francia", "París");
			put("Italia", "Roma");
			put("Alemania", "Berlín");
			put("Portugal", "Lisboa");
		}};
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un país europeo: ");
		String pais = sc.nextLine();
		String capital = paisesCapitales.get(pais);
		if (capital != null) {
			System.out.println("La capital de " + pais + " es " + capital);
		} else {
			System.out.println("No se encontró la capital de " + pais);
		}
	}
}
