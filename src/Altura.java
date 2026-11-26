
import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
	public static void main(String[] args) {
		ArrayList<Double> alturas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de alumnos: ");
		int numeroAlumnos = sc.nextInt();
		leerAlturas(sc, alturas, numeroAlumnos);
		double media = calcularMedia(alturas);
		int alumnosAlturaSuperior = calcularAlumnosAlturaSuperior(alturas, media);
		int alumnosAlturaInferior = calcularAlumnosAlturaInferior(alturas, media);
		System.out.println("Altura media: " + media);
		System.out.println("Número de alumnos con altura superior a la media: " + alumnosAlturaSuperior);
		System.out.println("Número de alumnos con altura inferior a la media: " + alumnosAlturaInferior);
	}

	public static void leerAlturas(Scanner sc, ArrayList<Double> alturas, int numeroAlumnos) {
		for (int i = 0; i < numeroAlumnos; i++) {
			alturas.add(sc.nextDouble());
		}
	}

	public static double calcularMedia(ArrayList<Double> alturas) {
		double suma = 0;
		for (double altura : alturas) {
			suma += altura;
		}
		return suma / alturas.size();
	}

	public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
		int contador = 0;
		for (double altura : alturas) {
			if (altura > media) {
				contador++;
			}
		}
		return contador;
	}

	public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {
		int contador = 0;
		for (double altura : alturas) {
			if (altura < media) {
				contador++;
			}
		}
		return contador;
	}
}
