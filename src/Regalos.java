import java.util.ArrayList;
import java.util.Scanner;

public class Regalos {
	public static void main(String[] args) {
		ArrayList<Integer> portales = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el portal en el que aterriza Papá Noel: ");
		int portalActual = sc.nextInt();
		System.out.print("Introduce el número de portales a visitar: ");
		int numeroPortales = sc.nextInt();
		System.out.println("Introduce los portales a visitar:");
		for (int i = 0; i < numeroPortales; i++) {
			portales.add(sc.nextInt());
		}
		repartirRegalos(portalActual, portales);
	}

	public static void repartirRegalos(int portalActual, ArrayList<Integer> portales) {
		while (!portales.isEmpty()) {
			int portalMasCercano = portales.get(0);
			for (int i = 1; i < portales.size(); i++) {
				int portal = portales.get(i);
				int distanciaActual = portalActual - portalMasCercano;
				if (distanciaActual < 0) {
					distanciaActual = -distanciaActual;
				}
				int distanciaNueva = portalActual - portal;
				if (distanciaNueva < 0) {
					distanciaNueva = -distanciaNueva;
				}
				if (distanciaNueva < distanciaActual || (distanciaNueva == distanciaActual && portal > portalMasCercano)) {
					portalMasCercano = portal;
				}
			}
			System.out.println("Visita el portal: " + portalMasCercano);
			portales.remove(Integer.valueOf(portalMasCercano));
			portalActual = portalMasCercano;
		}
	}
}
